/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.mc;

import com.mc.parser.VideoParser;
import com.mc.dao.video.Video;
import com.mc.dao.video.VideoDaoImpl;
import com.mc.parser.Video2Parser;
import com.video.dao.section.SectionDaoImp;
import com.video.dao.video2.VideoFromExcel;
import service.Video1ServisDaoImp;
import java.io.File;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestParam;
/**
 *
 * @author Admin
 */

@Controller
public class ControllerVideo extends PrintInFile {
    
    @Autowired
    VideoDaoImpl videoDaoImpl;
     
    @Autowired
    SectionDaoImp sectionDaoImp;
    
    @Autowired
    Video1ServisDaoImp video1ServisDaoImp;

    
    @RequestMapping(value = "/video", method = RequestMethod.GET)
    public ModelAndView video(HttpSession session,
             @RequestParam(value = "page",   defaultValue = "1") int page,
             @RequestParam(value = "section",   defaultValue = "all") String section
    ) {
      ModelAndView mv = new ModelAndView("hmc/video");
        session.setAttribute("page", "video?page="+page+"&section="+section);
        
        mv.addObject("listVideo", videoDaoImpl.getListVideo(section, page));
        mv.addObject("kol_vo_page_itogo", videoDaoImpl.getKol_vo_page_itogo());
        mv.addObject("page", page);
        mv.addObject("section", section);
        
       return mv; 
    } 
    
    
    
        @RequestMapping(value = "/video2", method = RequestMethod.GET)
    public ModelAndView video2(HttpSession session,
             @RequestParam(value = "page",   defaultValue = "1") int page,
             @RequestParam(value = "section",   defaultValue = "all") String section
    ) {
      ModelAndView mv = new ModelAndView("hmc/video2");
        session.setAttribute("page", "video2?page="+page+"&section="+section);
        
        mv.addObject("listVideo2", videoDaoImpl.getListVideo(section, page));
        mv.addObject("listSection", sectionDaoImp.getListSection());
        mv.addObject("kol_vo_page_itogo", videoDaoImpl.getKol_vo_page_itogo());
        mv.addObject("page", page);
        mv.addObject("section", section);
        
       return mv; 
    } 
    
    
      @RequestMapping(value = "/videotest1", method = RequestMethod.GET)
    public String  video(){
        
          try {
          printInFile("testVideo2", video1ServisDaoImp.getVideo1(1).toString());
              
          } catch (Exception e) {
                  printInFile("testVideo2", "Exeption!!");
          }finally {
        
          }
        
        return "redirect:/video";
    }
    

 
  
    
    @RequestMapping(value = "/videosearch", method = RequestMethod.GET)
    public ModelAndView videosearch(HttpSession session, @RequestParam (value = "word") String word) {
      ModelAndView mv = new ModelAndView("hmc/video");

      session.setAttribute("page", "videosearch");
        
        mv.addObject("listVideo", videoDaoImpl.getListVideoFromRequest(word));
        mv.addObject("section", "Search: " + word);
       return mv; 
    }  
    
    
    @RequestMapping(value = "/video{id}", method = RequestMethod.GET)
    public ModelAndView videoId(HttpSession session, @PathVariable ("id") int id ) {
//      ModelAndView mv = new ModelAndView("hmc/video_one");
      ModelAndView mv = new ModelAndView("hmc/video");
             
      session.setAttribute("page", "video"+id);        
        mv.addObject("video", videoDaoImpl.getVideo(id));
        mv.addObject("section", videoDaoImpl.getVideo(id).getHeadline());
        
       return mv; 
    }  

    

    
    @RequestMapping(value = "/addListVideo", method = RequestMethod.POST)
    public ModelAndView  addHmcList(HttpServletRequest request) {
 ModelAndView mv = new ModelAndView("hmc/admin_hmc");

 String resultVideo="";

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
//                                                printInFile("Upload video 1.txt" ,"1");

						Video video = VideoParser.parse(path);
//                                                printInFile("Upload video 1.txt" , "2");

            // Пытаемя найти уже существующий станок  
                if(videoDaoImpl.existVideo(video) != true)  {
                        videoDaoImpl.addVideo(video);
                        resultVideo +=  "Файл успешно Загружен: " + name + "<br>" ;                                            
                } else {
                        videoDaoImpl.editVideo(video);
                        resultVideo +=  "Файл успешно Обнавлён: " + name + "<br>" ;                                                
                }
                                                    

                         
                                                        
//						}
					 }
                                        
				}
//				printInFile("Upload video 1.txt" , "File Uploaded Successfully (" + name + ")");
			
                        } catch (Exception ex) {
//				printInFile("Upload video 1.txt" , "File Upload Failed due to " + ex);
                                resultVideo += "Ошибка (in file"+ name +") : " + ex;
			}

		} else {
//			printInFile("Upload video 1.txt" ,"Sorry this Servlet only handles file upload request");
                        
		}

                
                List<Video> listVideo = videoDaoImpl.getListVideo();

        mv.addObject("listVideo", listVideo);
        mv.addObject("resultVideo", resultVideo);
        
		return mv;
	}
    
    
    
    
    
     @RequestMapping(value = "/add_list_video2", method = RequestMethod.GET)
    public ModelAndView  add_list_video2(HttpServletRequest request) {
 ModelAndView mv = new ModelAndView("hmc/admin_add_video2");
 
 return mv;
    }
    
     @RequestMapping(value = "/add_list_video2", method = RequestMethod.POST)
    public ModelAndView  addListVideo2(HttpServletRequest request) {
 ModelAndView mv = new ModelAndView("hmc/admin_add_video2");

 String resultVideo="";

		//String savePath = request.getServletPath().getRealPath("");
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
//                                                printInFile("Upload video 1.txt" ,"1");

						VideoFromExcel video = Video2Parser.parse(path);
//                                                printInFile("Upload video 1.txt" , "2");

            // Пытаемя найти уже существующий станок  
//                if(videoDaoImpl.existVideo(video) != true)  {
                     String rezul =   video1ServisDaoImp.addVideo1(video);
                        resultVideo +=  rezul + ": " + name + "<br>" ;                                            
//                } else {
//                        video1ServisDaoImp.editVideo(video);
//                        resultVideo +=  "Файл успешно Обнавлён: " + name + "<br>" ;                                                
//                }

					 }       
				}
//				printInFile("Upload video 1.txt" , "File Uploaded Successfully (" + name + ")");
			
                        } catch (Exception ex) {
//				printInFile("Upload video 1.txt" , "File Upload Failed due to " + ex);
                                resultVideo += "Ошибка (in file"+ name +") : " + ex;
			}

		} else {
//			printInFile("Upload video 1.txt" ,"Sorry this Servlet only handles file upload request");        
		}

                List<Video> listVideo = videoDaoImpl.getListVideo();

        mv.addObject("listVideo", listVideo);
        mv.addObject("resultVideo", resultVideo);
        
		return mv;
	}
    
    
    
}
