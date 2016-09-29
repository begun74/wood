package wood.util;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import wood.model.Particleboard;


@Service
@PropertySource("classpath:app.properties")
public class FileUpload {

	
	private static final String[] ALLOWED_FILE_TYPES_PICS = {"image/jpeg", "image/jpg", "image/gif"};
	private static final String[] ALLOWED_FILE_TYPES_XLS = {"application/vnd.ms-excel","application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"};
    private static final Long MAX_FILE_SIZE = 1048576L; //1MB
    //private static final String UPLOAD_FILE_PATH = "D:/GIT_/wood/src/main/webapp/resources/pics/";
    private static final String UPLOAD_FILE_PATH = "UPLOAD_FILE_PATH";
    private static final String TEMP_FILE_PATH = "TEMP_FILE_PATH";
    
    @Resource
    private Environment env;
    
    
    public FileUpload()
    {
    	//System.out.println("FileUpload - "+getClass());
    }
    
	public boolean process(MultipartFile file,Long id) {
		
		//boolean flag = false;
		
		File path;
		
		if (!file.isEmpty() && isValidContentType_1(file.getContentType().toString().toLowerCase())) {
			
			path = new File(env.getRequiredProperty(UPLOAD_FILE_PATH)+File.separator+id+File.separator);
			
			if(!path.exists() && !path.mkdirs()) 
				return false;
			
			try {
				file.transferTo(new File(path.toString()+file.getOriginalFilename()));
				return true;
			} catch (IllegalStateException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
			
			
		}
		
		
		return false;
	}
	
    public String process(MultipartFile file,String newFileName) {

		if (!file.isEmpty()) {
            String contentType = file.getContentType().toString().toLowerCase();
            
            if (isValidContentType_1(contentType)) {
                if (belowMaxFileSize(file.getSize())) {
                    String newFile = newFileName == null?env.getRequiredProperty(UPLOAD_FILE_PATH) + file.getOriginalFilename():env.getRequiredProperty(UPLOAD_FILE_PATH)+newFileName+"."+contentType.substring(contentType.indexOf("/")+1);
                    try {
                        file.transferTo(new File(newFile));
                        return "You have successfully uploaded " + file.getOriginalFilename() + "!";
                    } catch (Exception e) {
                        //return "There was an error uploading " + file.getOriginalFilename() + " => " + e.getMessage();
                    	return null;
                    } 
                } else {
                    //return "Error. " + file.getOriginalFilename() + " file size (" + file.getSize() + ") exceeds " + MAX_FILE_SIZE + " limit.";
                	return null;
                }
            } 
            else {
                //return "Error. " + contentType + " is not a valid content type.";
            	return null;
            }
            
            
        } else {
            //return "Error. No file choosen.";
        	return null;
        }
    }

	public String processPhoto(MultipartFile file) {

		if (!file.isEmpty()) {
            String contentType = file.getContentType().toString().toLowerCase();
            
            if (isValidContentType_XLS(contentType)) {
                if (belowMaxFileSize(file.getSize())) {
                    String newFile = env.getRequiredProperty(TEMP_FILE_PATH) + "photo"+System.currentTimeMillis()+".xls";
                    try {
                        file.transferTo(new File(newFile));
                        ReadExcelUtil.readPhoto(new File(newFile));
                        return "You have successfully uploaded " + file.getOriginalFilename() + "!";
                    } catch (Exception e) {
                    	e.printStackTrace();
                    	return null;
                    } 
                } else {
                    //return "Error. " + file.getOriginalFilename() + " file size (" + file.getSize() + ") exceeds " + MAX_FILE_SIZE + " limit.";
                	return null;
                }
            } 
            else {
                //return "Error. " + contentType + " is not a valid content type.";
            	return null;
            }
            
            
        } else {
            //return "Error. No file choosen.";
        	return null;
        }
    }
	
	
	public List<Particleboard>  process(MultipartFile file) {
		if (!file.isEmpty()) {
			String contentType = file.getContentType().toString().toLowerCase();
		
			if (isValidContentType_XLS(contentType)) {
            	String newFile = null;
                if (belowMaxFileSize(file.getSize())) {
                	newFile = env.getRequiredProperty(TEMP_FILE_PATH) + file.getOriginalFilename();
                    new File(newFile).mkdirs();
                    try {
						file.transferTo(new File(newFile));
						return ReadExcelUtil.readParticleboard(new File(newFile));
					} catch (Exception e) {
						e.printStackTrace();
						return null;
					}
                }
			}
		}
		
		return null;

	}
	
	
    private Boolean isValidContentType_1(String contentType) {
    	//System.out.println("contentType - "+contentType);
        if (!Arrays.asList(ALLOWED_FILE_TYPES_PICS).contains(contentType)) {
            return false;
        }
        
        return true;
    }
    
    private Boolean isValidContentType_XLS(String contentType) {
    	//System.out.println("contentType - "+contentType);
        if (!Arrays.asList(ALLOWED_FILE_TYPES_XLS).contains(contentType)) {
            return false;
        }
        
        return true;
    }

    private Boolean belowMaxFileSize(Long fileSize) {
        if (fileSize > MAX_FILE_SIZE) {
            return false;
        }
        
        return true;
    }
}
