package wood.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import wood.service.WoodService;



@Controller
public class WControllerIndex {

	
	
	@Autowired
	private WoodService woodService;  //Service which will do all data retrieval/manipulation work
	
	@RequestMapping(value = {"/index","/"} , method = RequestMethod.GET)
	public ModelAndView  index(HttpSession session) 
	{
	    return new ModelAndView("plywood/index_plywood");
	}

	
    @RequestMapping(value = "/sitemap" , method = RequestMethod.GET)
   public ModelAndView sitemap(HttpSession session ) {
		 ModelAndView mv = new ModelAndView("hmc/sitemap");
		             
		 //mv.addObject("listVmc", vmcDaoImpl.listVmcModelDESC());
		 //mv.addObject("listVideo", videoDaoImpl.getListVideo()); 
		
		 session.setAttribute("page", "sitemap");
		 return mv;
   }

}
