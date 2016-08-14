package wood.controller2;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import wood.service.WoodService;


@Controller
public class WController1 {

	
	@Autowired
	private WoodService woodService;  //Service which will do all data retrieval/manipulation work
	
	@RequestMapping(value = {"/loginPage"} , method = RequestMethod.GET)
	public ModelAndView  loginPage(HttpSession session, @RequestParam(value = "error",required = false) String error,
			@RequestParam(value = "logout",	required = false) String logout) 
	{
	    //return new ModelAndView("plywood/login1");
		
	    
		ModelAndView model = new ModelAndView("plywood/login1");
		if (error != null) {
			model.addObject("error", "Invalid Credentials provided.");
		}

		if (logout != null) {
			model.addObject("message", "Logged out from JournalDEV successfully.");
		}
		
		//model.setViewName("loginPage");
		return model;
	}

}