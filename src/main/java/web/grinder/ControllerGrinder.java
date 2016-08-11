/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.grinder;

import com.grinder.dao.Grinder;
import com.grinder.dao.GrinderDaoImp;
import com.mc.dao.vmc.Vmc;
import web.mc.PrintInFile;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class ControllerGrinder extends PrintInFile {
    
    @Autowired
    GrinderDaoImp  grinderDaoImp; 
    
           @RequestMapping(value = "/drill-end-mill-grinder" , method = RequestMethod.GET)
    public ModelAndView mc(  
            @RequestParam(value = "drill",   defaultValue = "0") int drill,
            @RequestParam(value = "mill",   defaultValue = "0") int mill,
                      HttpSession session) {
       ModelAndView mv = new ModelAndView("grinder/grinder_all");
     
//       List<Grinder> lisrG =  grinderDaoImp.getListGrinders();
       List<Grinder> lisrG =  grinderDaoImp.getListGrinders(drill, mill);
       
       mv.addObject("listGrinder",  lisrG );
       mv.addObject("drill",  drill );
       mv.addObject("mill",  mill );
    
               printInFile("grinder", lisrG.toString());
        
     return mv;  
    }
    
     @RequestMapping(value = "/grinder{id}", method = RequestMethod.GET)
    public ModelAndView getSorexInfo( @PathVariable ("id") int id, HttpSession session) {   
        
                     ModelAndView mv = new ModelAndView("grinder/grinder_one");
                 Grinder grinder = grinderDaoImp.getGrinder(id);
//                printInFile("HMC exeption21.txt", grinder.toString());
                mv.addObject("grinder", grinder);
                
                 session.setAttribute("page", "grinder"+id);

        return mv;
    }
    
    
    
    
}
