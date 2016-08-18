package wood.controller2;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import wood.bean.SessionBean;
import wood.service.WoodService;


@Controller
@Scope("session")
public class WController1 {

	
	@RequestMapping(value = {"/test"} , method = RequestMethod.GET)
	public ModelAndView  loginPage(HttpSession session, @RequestParam(value = "error",required = false) String error,
			@RequestParam(value = "logout",	required = false) String logout) 
	{
	    
		ModelAndView model = new ModelAndView("plywood/test");
		/*
		if (error != null) {
			model.addObject("error", "Invalid Credentials provided.");
		}

		if (logout != null) {
			//model.addObject("message", "Logged out from JournalDEV successfully.");
			SecurityContextHolder.clearContext();
			session.invalidate();
			model.setViewName("plywood/loginPage");
		}
		*/
		return model;
	}

}
