/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.grinder;

import com.grinder.dao.Grinder;
import com.grinder.dao.GrinderDaoImp;
import com.grinder.parser.GrinderParser;

import web.mc.PrintInFile;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Admin
 */

@Controller
public class ControllerGrinderAdmin extends PrintInFile{
   
      
    @Autowired
    GrinderDaoImp  grinderDaoImp; 
    
            
    @RequestMapping(value = "/admingrinder", method = RequestMethod.GET)
    public ModelAndView admingrinder() {
 ModelAndView mv = new ModelAndView("grinder/admin_grinder");
// ModelAndView mv = new ModelAndView("hmc/admin_hmc");

//     List<Grinder> listGrinder = grinderDaoImp.getListGrinders();
////        printInFile(listHmc.toString());
//        mv.addObject("listGrinder", listGrinder);

        return mv;
    }
 
    
    
    
    @RequestMapping(value = "/admingrinder", method = RequestMethod.POST)
    public ModelAndView  addHmcGrinder(HttpServletRequest request) {
 ModelAndView mv = new ModelAndView("grinder/admin_grinder");

 String result="";

		String savePath = request.getServletPath();
		String name = "";
		String path = "";

		if (ServletFileUpload.isMultipartContent(request)) {
			try {
				List<FileItem> multiparts = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
				for (FileItem item : multiparts) {
					if (!item.isFormField()) {
						name = new File(item.getName()).getName();
						path = savePath + File.separator + name;
						item.write(new File(path));
//                                                printInFile("1");

						Grinder grinder = GrinderParser.parse(path);
//                                                printInFile("2");

            // Пытаемя найти уже существующий станок  
//                if(vmcDaoImpl.existVmc(vmc) != true)  {
                        grinderDaoImp.addGrinder(grinder);
                        result +=  "Файл успешно Загружен: " + name + "<br>" ;                                            
//                } else {
//                        vmcDaoImpl.editVmc(vmc);
//                        result +=  "Файл успешно Обнавлён: " + name + "<br>" ;                                                
//                }
                                                    
//                         printInFile( hmc.toString());
                         
                                                        
//						}
					}
                                        
				}
				printInFile("File Uploaded Successfully (" + name + ")");
			} catch (Exception ex) {
				printInFile("File Upload Failed due to " + ex);
                                result += "Ошибка (in file"+ name +") : " + ex;
			}

		} else {
			printInFile("Sorry this Servlet only handles file upload request");
		}

                
//                List<Vmc> listHmc = vmcDaoImpl.listVmc();
//        printInFile(listHmc.toString());
//        mv.addObject("listHmc", listHmc);
        mv.addObject("result", result);
        
		return mv;
	}
    
    
    
    @RequestMapping(value = "/add_grinders_photo", method = RequestMethod.POST)
   
    public ModelAndView add_photo_vmc(@RequestParam ("file") MultipartFile [] files, HttpServletRequest request) {
// We need to use 
// <bean id="multipartResolver" class="org.springframework.web.multipart.commons.CommonsMultipartResolver">     
//        String name = null;
        
       ModelAndView mv = new ModelAndView("grinder/admin_grinder"); 
        String result = "";
        
       String fileName = null;
    	String msg = "";
        
//        if (!file.isEmpty()){
            	if (files != null && files.length >0) {
    		for(int i =0 ;i< files.length; i++){
                try {
//                    byte[] bytes =  files.getBytes();
//                    name = files.getOriginalFilename();

                    fileName = files[i].getOriginalFilename();
	             byte[] bytes = files[i].getBytes();
                    
//                    String rootPath = System.getProperty("catalina.home");
                       //String rootPath = request.getServletPath().getRealPath("");
                       String rootPath = request.getServletPath();
//        rootPath = rootPath + "/resources";

                    File dir= new File(rootPath + File.separator + "resources" +File.separator + "jpg_grider");

                    printInFile("upload", dir.toString());
                    
                    if(!dir.exists()){
                        dir.mkdirs();
                    }

                    File uploadFile = new File(dir.getAbsolutePath()+File.separator + fileName);
                    BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(uploadFile));
                    stream.write(bytes);
                    stream.flush();
                    stream.close();
result+= "Фото " + fileName + " успешно добавлено. </br>";
//                    return "You success upload file!";
                } catch (Exception e) {
                    result+= "You faled to upload " + fileName + " -> " + e.getMessage()+ "</br>";
                }
                
                }
                
                
        }else{
            result+= "You faled to upload " + fileName + "becace the file was empty! </br>";
        }
        mv.addObject("result", result);
        return mv;
    }
    
    
   
}
