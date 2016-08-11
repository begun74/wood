/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import com.mc.dao.enters.EntersDaoImpl;
import com.mc.dao.orders.OrderDaoImpl;
import com.mc.dao.video.VideoDaoImpl;
import com.mc.dao.vmc.Vmc;
import com.mc.dao.vmc.VmcDaoImpl;
import web.mc.PrintInFile;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerIndex extends PrintInFile {
  
    
    @Autowired
    VmcDaoImpl vmcDaoImpl;
    
    @Autowired
    EntersDaoImpl entersDaoImpl;
    
    @Autowired
    OrderDaoImpl orderJDBCTemplate;
    
       @Autowired
    VideoDaoImpl videoDaoImpl;
    
    
       
       
       
       
     @RequestMapping(value = {"/index","/"} , method = RequestMethod.GET)
    public ModelAndView userSorexInfo(HttpSession session ) {
	 ModelAndView mv = new ModelAndView("hmc/index_mc");
	System.out.println("index");
	    List <Vmc> listVmc= vmcDaoImpl.listVmcLast4Machine();               
	// mv.addObject("nombersofenters", entersDaoImpl.getNombersEnters());
	 mv.addObject("nombersofquerys", orderJDBCTemplate.getNombers());
	 mv.addObject("listVmc", listVmc);
	
	  mv.addObject("listVideo", videoDaoImpl.getList10Video()); 
	
	   session.setAttribute("page", "index");
        return mv;
    }

 
          
     @RequestMapping(value = "/sitemap" , method = RequestMethod.GET)
    public ModelAndView sitemap(HttpSession session ) {
 ModelAndView mv = new ModelAndView("hmc/sitemap");
              
  mv.addObject("listVmc", vmcDaoImpl.listVmcModelDESC());
  mv.addObject("listVideo", videoDaoImpl.getListVideo()); 

   session.setAttribute("page", "sitemap");
 
 
 return mv;
    }
    
    
    
    // P.S.  SessionStatus ss, ss.setComplete() - delete all from Session 
    
//      @ExceptionHandler(IOException.class)
//  public ResponseEntity<String> handleIOException(IOException ex) {
//
//    // prepare responseEntity
//
//    return responseEntity;
//  }
    
    
    
}
