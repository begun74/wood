package wood.model;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


@Service
@PropertySource("classpath:app.properties")
public class FileUpload {

	
	private static final String[] ALLOWED_FILE_TYPES = {"image/jpeg", "image/jpg", "image/gif"};
    private static final Long MAX_FILE_SIZE = 1048576L; //1MB
    //private static final String UPLOAD_FILE_PATH = "D:/GIT_/wood/src/main/webapp/resources/pics/";
    private static final String UPLOAD_FILE_PATH = "UPLOAD_FILE_PATH";
    
    
    @Resource
    private Environment env;
    
    
    public FileUpload()
    {
    	//System.out.println("FileUpload - "+getClass());
    }
    


	public String process(MultipartFile file,String newFileName) {

		if (!file.isEmpty()) {
            String contentType = file.getContentType().toString().toLowerCase();
            if (isValidContentType(contentType)) {
                if (belowMaxFileSize(file.getSize())) {
                    String newFile = newFileName == null?env.getRequiredProperty(UPLOAD_FILE_PATH) + file.getOriginalFilename():env.getRequiredProperty(UPLOAD_FILE_PATH)+newFileName+"."+contentType.substring(contentType.indexOf("/")+1);
                    try {
                        file.transferTo(new File(newFile));
                        return "You have successfully uploaded " + file.getOriginalFilename() + "!";
                    } catch (IllegalStateException e) {
                        return "There was an error uploading " + file.getOriginalFilename() + " => " + e.getMessage();
                    } catch (IOException e) {
                        return "There was an error uploading " + file.getOriginalFilename() + " => " + e.getMessage();
                    }
                } else {
                    return "Error. " + file.getOriginalFilename() + " file size (" + file.getSize() + ") exceeds " + MAX_FILE_SIZE + " limit.";
                }
            } else {
                return "Error. " + contentType + " is not a valid content type.";
            }
        } else {
            return "Error. No file choosen.";
        }
    }
    
    private Boolean isValidContentType(String contentType) {
        if (!Arrays.asList(ALLOWED_FILE_TYPES).contains(contentType)) {
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
