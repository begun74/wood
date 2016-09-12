package wood.controller;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.MediaType;
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

import wood.annotation.Loggable;
import wood.bean.BacketBean;
import wood.bean.CompareBean;
import wood.bean.SessionBean;
import wood.modelattribute.MIndex;
import wood.service.WoodService;
import wood.util.FileUpload;



@Controller
public class WControllerIndex {

	
	
	@Autowired
	private WoodService woodService;  //Service which will do all data retrieval/manipulation work
	
	@Autowired
	FileUpload fileUpload;

	@Autowired
	BacketBean backet;

	@Autowired
	CompareBean compBean;

	@PostConstruct
	void init(){
		//System.out.println("WControllerIndex @PostConstruct");
	}
	
	@PreDestroy
	void destr() {
		//System.out.println("WControllerIndex @PreDestroy");
	}

	
	@RequestMapping(value = {"/index","/"} , method = RequestMethod.GET)
	public ModelAndView  index(HttpSession session) 
	{
		ModelAndView model = new ModelAndView("plywood/index_plywood");
		
		MIndex mIndex = session.getAttribute("mIndex") == null?new MIndex():(MIndex)session.getAttribute("mIndex");
		model.addObject("particleboards",mIndex.getListParticleboards(woodService));
		model.addObject("brands",woodService.getListDirBrands());
		model.addObject("backetBean",backet);
		model.addObject("compBean",compBean);
		model.addObject("mIndex",mIndex);
		
		//System.out.println("/index - "+mIndex);
	    return model;
	}

	@RequestMapping(value = {"/loginPage"} , method = RequestMethod.GET)
	public ModelAndView  loginPage(HttpSession session, @RequestParam(value = "error",required = false) String error,
			@RequestParam(value = "logout",	required = false) String logout) 
	{
	    
		ModelAndView model = new ModelAndView("plywood/loginPage");
		if (error != null) {
			model.addObject("error", "Invalid Credentials provided.");
		}

		if (logout != null) {
			SecurityContextHolder.clearContext();
			session.invalidate();
			model.setViewName("plywood/loginPage");
		}
		
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
