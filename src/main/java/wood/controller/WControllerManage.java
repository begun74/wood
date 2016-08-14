package wood.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import wood.model.DirColor;
import wood.service.WoodService;

@Controller
@RequestMapping(value = {"/manage"} , method = RequestMethod.GET)
public class WControllerManage {

	
	@Autowired
	private WoodService woodService;  //Service which will do all data retrieval/manipulation work

	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView  manage(HttpSession session, @RequestParam(value = "act",   defaultValue = "0") String act) 
	{
		ModelAndView model = new ModelAndView("plywood/manage/manage");
		
		switch (act)
		{
		case "1":
			model = new ModelAndView("plywood/manage/addColor");
			break;

		case "2":
			model = new ModelAndView("plywood/manage/addParticleboard");
			break;
			
		}
		model.addObject("dirColors",woodService.getListDirColors());
		
	    return model;
	}


	@RequestMapping(value = "addColor" , method = RequestMethod.POST)
	public ModelAndView  addColor(HttpSession session, @ModelAttribute("addColorForm") DirColor dirColor) 
	{
		//System.out.println("dirColor - "+dirColor.getName());
		
		woodService.addColor(dirColor);
		
		ModelAndView model = new ModelAndView("redirect:/manage?act=1");
		model.addObject("dirColors",woodService.getListDirColors());
		System.out.println("addColor");
	    return model;
	}
	
	@RequestMapping(value = "addParticleboard" ,method = RequestMethod.POST)
	public ModelAndView  addParticleboard(HttpSession session) 
	{
		ModelAndView model = new ModelAndView("redirect:/manage?act=2");
		model.addObject("dirColors",woodService.getListDirColors());
		System.out.println("addParticleboard");
	    return model;
	}

	

}
