package wood.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import wood.service.WoodService;

@Controller
@RequestMapping(value = {"/manage"} , method = RequestMethod.GET)
public class WControllerManage {

	
	@Autowired
	private WoodService woodService;  //Service which will do all data retrieval/manipulation work

	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView  manage(HttpSession session) 
	{
		ModelAndView model = new ModelAndView("plywood/manage/manage");
		model.addObject("dirColors",woodService.getListDirColors());
		
	    return model;
	}

	
	@RequestMapping(value = "addForm" , method = RequestMethod.POST)
	public ModelAndView  addFormManage(HttpSession session) 
	{
		ModelAndView model = new ModelAndView("redirect:/manage");
		model.addObject("dirColors",woodService.getListDirColors());
		System.out.println("addForm");
	    return model;
	}

}
