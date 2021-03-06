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
import wood.model.Particleboard;
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
	public ModelAndView  index(HttpSession session, @RequestParam(value = "pg",   required=false) Long id_partgroup) 
	{
		
		ModelAndView model = new ModelAndView("plywood/index_all");
		//MIndex mIndex = session.getAttribute("mIndex") == null?new MIndex():(MIndex)session.getAttribute("mIndex");
		MIndex mIndex = new MIndex();
		
		mIndex.setPg(id_partgroup);
		
		if(id_partgroup != null)
			model = new ModelAndView("plywood/index_pg");
		
		
		model.addObject("partTypes",woodService.getListPartTypes());
		model.addObject("particleboards",mIndex.getListParticleboards2(woodService));
		model.addObject("brands",woodService.getListDirBrands());
		model.addObject("thickness",woodService.getAllThickness());
		model.addObject("length",woodService.getAllLength());
		model.addObject("weight",woodService.getAllWeight());

		model.addObject("backetBean",backet);
		model.addObject("compBean",compBean);

		model.addObject("mIndex",mIndex);
		
		//System.out.println("/index - "+mIndex);
	    return model;
	}
	
	
	@RequestMapping(value = {"/singleProduct"} , method = RequestMethod.GET)
	public ModelAndView  singleProduct (HttpSession session, @RequestParam(value = "id",   required=false) Long id) 
	{
		ModelAndView model = new ModelAndView("plywood/single-product");
		MIndex mIndex = session.getAttribute("mIndex") == null?new MIndex():(MIndex)session.getAttribute("mIndex");
		
		
		Particleboard p = null;
		if(id != null)
			p = woodService.getParticleboard(id);
		
		if(mIndex.getPartType() == null)
			mIndex.setPartType(p.getPartType());
		
		model.addObject("particleboard",p);
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
			model.addObject("error", "Invalid username or password!");
		}

		if (logout != null) {
			SecurityContextHolder.clearContext();
			session.invalidate();
			model.setViewName("plywood/loginPage");
		}
		
		return model;
	}

	
    @RequestMapping(value = "/contact" , method = RequestMethod.GET)
    public ModelAndView contact(HttpSession session ) {
		 ModelAndView mv = new ModelAndView("plywood/common/contact");
		             
		 mv.addObject("message", new Object());
		 //mv.addObject("listVideo", videoDaoImpl.getListVideo()); 
		
		 //session.setAttribute("page", "sitemap");
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
