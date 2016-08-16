package wood.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import wood.model.FileUpload;
import wood.service.WoodService;



@Controller
public class WControllerIndex {

	
	
	@Autowired
	private WoodService woodService;  //Service which will do all data retrieval/manipulation work
	
	@RequestMapping(value = {"/index","/"} , method = RequestMethod.GET)
	public ModelAndView  index(HttpSession session) 
	{
		ModelAndView model = new ModelAndView("plywood/index_plywood");
		model.addObject("particleboards",woodService.getListParticleboards());
		System.out.println("User - "+getPrincipal());
	    return model;
	}

	
    @RequestMapping(value = "/sitemap" , method = RequestMethod.GET)
    public ModelAndView sitemap(HttpSession session ) {
		 ModelAndView mv = new ModelAndView("hmc/sitemap");
		             
		 //mv.addObject("listVmc", vmcDaoImpl.listVmcModelDESC());
		 //mv.addObject("listVideo", videoDaoImpl.getListVideo()); 
		
		 session.setAttribute("page", "sitemap");
		 return mv;
   }
    
	@RequestMapping(value = { "/upload" }, method = RequestMethod.GET)
	public String upload(ModelMap model) {
	
		model.addAttribute("message", "Spring 4 MVC File Upload Example");
		return "plywood/manage/upload";
	}

	@RequestMapping(value = { "/uploadFile" }, method = RequestMethod.POST)
	public ModelAndView handleFileUpload(@ModelAttribute  MultipartFile file, BindingResult result, Model m) {
        
		
		System.out.println("handleFileUpload");
        ModelAndView model = new ModelAndView("plywood/manage/upload");
        FileUpload fileUpload = new FileUpload();
        model.addObject("message", fileUpload.process(file));
        
        return model;
    }
    
    private String getPrincipal(){
        String userName = null;
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
 
        if (principal instanceof UserDetails) {
            userName = ((UserDetails)principal).getUsername();
        } else {
            userName = principal.toString();
        }
        return userName;
    }

}
