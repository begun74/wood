/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.stereotype.Controller;
/**
 *
 * @author Admin
 */

@Controller
public class ControllerError {
    
        @RequestMapping(value = "/403" , method = RequestMethod.GET)
    public String m403() {
     
        return "403";
    }
    
        @RequestMapping(value = "/404" , method = RequestMethod.GET)
    public String m404() {
     
        return "404";
    }
    
        @RequestMapping(value = "/500" , method = RequestMethod.GET)
    public String m500() {
     
        return "500";
    }

    
    
}
