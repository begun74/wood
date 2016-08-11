/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.mc;

import com.mc.parser.VmcParser;
import com.mc.dao.vmc.Vmc;
import com.mc.dao.vmc.VmcDaoImpl;
import com.mc.dao.orders.Order;
import com.mc.dao.orders.OrderDaoImpl;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Admin
 */
@Controller
public class ControllerVmcAdmin extends PrintInFile{
    
    
    @Autowired
    VmcDaoImpl vmcDaoImpl;
      
    @Autowired
    OrderDaoImpl orderJDBCTemplate; 
    
            
    @RequestMapping(value = "/adminadd", method = RequestMethod.GET)
    public ModelAndView hmcadmin() {
 ModelAndView mv = new ModelAndView("hmc/admin_hmc");
  

     List<Vmc> listHmc = vmcDaoImpl.listVmc();
//        printInFile(listHmc.toString());
        mv.addObject("listHmc", listHmc);

        return mv;
    }
 
    
    @RequestMapping(value = "/admin_req", method = RequestMethod.GET)
    public ModelAndView adminRequesst() {
      ModelAndView mv = new ModelAndView("hmc/admin_requsts");

      List<Order> listOrder = orderJDBCTemplate.getListOrders();
        printInFile("listOrder", listOrder.toString());
       
        mv.addObject("listOrder", listOrder);

        return mv;
    }
    
 
    // change in to ok
    @RequestMapping(value = "/requestisprocessed-{id}", method = RequestMethod.GET)
    public String adminRequestIsProcessed(@PathVariable ("id") int id)  {
//      ModelAndView mv = new ModelAndView("hmc/admin_requsts");

//      List<Order> listOrder = orderJDBCTemplate.getListOrders();
//        printInFile("listOrder", listOrder.toString());
       orderJDBCTemplate.requestIsProcessed(id);
//        mv.addObject("listOrder", listOrder);

        return "redirect:/admin_req";
    }
    

    
    
    
      @RequestMapping(value = "/deleteMC", method = RequestMethod.GET)
    public String addSorexesPhoto( @RequestParam (value = "id") int id) { 
        vmcDaoImpl.removeHmc(id);
        
        return "redirect:/admin_admin_vmc45.htm";
    }
    
    
    
    
    @RequestMapping(value = "/addHmcList", method = RequestMethod.POST)
    public ModelAndView  addHmcList(HttpServletRequest request) {
 ModelAndView mv = new ModelAndView("hmc/admin_hmc");

 String result="";

		//String savePath = request.getServletContext().getRealPath("");
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

						Vmc vmc = VmcParser.parse(path);
//                                                printInFile("2");

            // Пытаемя найти уже существующий станок  
                if(vmcDaoImpl.existVmc(vmc) != true)  {
                        vmcDaoImpl.addVmc(vmc);
                        result +=  "Файл успешно Загружен: " + name + "<br>" ;                                            
                } else {
                        vmcDaoImpl.editVmc(vmc);
                        result +=  "Файл успешно Обнавлён: " + name + "<br>" ;                                                
                }
                                                    
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

                
                List<Vmc> listHmc = vmcDaoImpl.listVmc();
//        printInFile(listHmc.toString());
        mv.addObject("listHmc", listHmc);
        mv.addObject("result", result);
        
		return mv;
	}
    
    
    
    
    
    @RequestMapping(value = "/add_photo_vmc", method = RequestMethod.POST)
    @ResponseBody
    public String add_photo_vmc(@RequestParam ("file") MultipartFile [] files, HttpServletRequest request) {
// We need to use 
// <bean id="multipartResolver" class="org.springframework.web.multipart.commons.CommonsMultipartResolver">     
//        String name = null;
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
                    return "You faled to upload " + fileName + " -> " + e.getMessage();
                }
                
                }
                
                
        }else{
            return "You faled to upload " + fileName + "becace the file was empty!";
        }
        
       return result; 
    }
    
    
    
     @RequestMapping(value = "/addHmcPhoto", method = RequestMethod.POST)  
    public ModelAndView  addSorexesPhoto(HttpServletRequest request) {

       
    	String result = "";
        //String savePath = request.getServletPath().getRealPath("");
        String savePath = request.getServletPath();
        savePath = savePath + "/resources/assets/images/products";

//        savePath = savePath.replace("\\build", "") + "\\resources";

        if (ServletFileUpload.isMultipartContent(request)) {
            result = "1";
            try {
                  result = "2";
 List<FileItem> multiparts = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
 result = "3";
                for (FileItem item : multiparts) {
                result = "3";    
                    if (!item.isFormField()) {
                        String name = new File(item.getName()).getName();
                        String path = savePath + File.separator + name;
                        
                        printInFile("rr", path);
                        
                        item.write(new File(path));
                        result += "Фото " + name + " успешно добавлено. </br>";
                    }else{
                        result = "44";
                    }
                }

                System.out.println("File Uploaded Successfully");

            } catch (Exception ex) {
//                System.out.println("File Upload Failed due to " + ex);
                result = "File Upload Failed due to " + ex;
            }

        } else {
//            System.out.println("Sorry this Servlet only handles file upload request");
            result = "Sorry this Servlet only handles file upload request";
        }

        //ModelAndView mv = new ModelAndView("sorex/workwithsorex");
        ModelAndView mv = new ModelAndView("hmc/admin_hmc");
        mv.addObject("result", result);

        printInFile("upload addHmcPhoto ", result);
        
//        userController.addUsersList(mv);
//        orderController.addListOrders(mv);
//        companyController.addCompanyList(mv);
//        addListSorexs(mv);

        return mv;
    }
    
    
    
    
    
        // Print in File
     protected void printInFile(String str){    // For Check 
            File file = new File("d:\\2\\HMC exeption2.txt");
//            File file = new File("HMC exeption2.txt");
        try {
        	FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write("-------> "+new Date()+"): \n");
            fileWriter.write(str + "\n\n");
        } catch (IOException ex) {
//            Logger.getLogger(ControllerMachine.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        } 
    
    
}
