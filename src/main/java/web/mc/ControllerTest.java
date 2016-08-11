/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.mc;

import com.mc.dao.vmc.Vmc;
import service.ServiceDaoImp;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;



@Controller
public class ControllerTest {
 
    @Autowired
    ServiceDaoImp serviceDaoImp;
    
        
    @RequestMapping(value = "/test_add_vmc" , method = RequestMethod.GET)
    public String test_add_vmc() {
     
        Vmc vmc = new Vmc ();
        vmc.setModel("Test");
        vmc.setVideo1("https://www.youtube.com/embed/mLvykk4FiFo");
        
        serviceDaoImp.addVmc(vmc);
        
        return "index";
    }
    
    
}
