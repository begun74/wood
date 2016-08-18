package wood.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WControllerError {

    @RequestMapping(value = "/403" , method = RequestMethod.GET)
	public String m403() {
    	//System.out.println("m403");
	    return "/403";
	}

    @RequestMapping(value = "/404" , method = RequestMethod.GET)
	public String m404() {
    	//System.out.println("m404");
	    return "/404";
	}

    @RequestMapping(value = "/500" , method = RequestMethod.GET)
	public String m500() {
    	//System.out.println("m500");
	    return "/500";
	}

}
