package wood.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/hello")
public class WController {

	private int i=0;
	 
	@RequestMapping(value = "hello2", method = RequestMethod.GET)
	public String printHello(ModelMap model) {
	     model.addAttribute("message", "Hello Spring ! "+ (++i));
	     return "showMessage";
	}

	@RequestMapping(value = "hello", method = RequestMethod.GET)
	public ModelAndView  hello(ModelMap model) 
	{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("showMessage");
		modelAndView.addObject("message", "Hello Spring ModelAndView !");
		modelAndView.addObject("count", ""+ (++i));
	    return modelAndView;
	}

}
