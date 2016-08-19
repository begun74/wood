package wood.controller;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import wood.bean.SessionBean;
import wood.model.DirColor;
import wood.model.FileUpload;
import wood.model.Particleboard;
import wood.service.WoodService;

@Controller
@RequestMapping(value = {"/admin"} , method = RequestMethod.GET)
@Scope("session")

public class WControllerManage {
	
	@Autowired
	private WoodService woodService;  //Service which will do all data retrieval/manipulation work

	@Autowired
	FileUpload fileUpload;
	
	@Autowired
	SessionBean sb;

	
	@PostConstruct
	void init(){
		//System.out.println("WControllerManage @PostConstruct");
	}
	
	@PreDestroy
	void destr() {
		//System.out.println("WControllerManage @PreDestroy");
	}

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView  manage(HttpSession session, 
				@RequestParam(value = "act",   defaultValue = "0") String act,
				@RequestParam(value = "error",   defaultValue = "") String error) 
	{
		ModelAndView model = new ModelAndView("plywood/admin/admin");
		
		switch (act)
		{
		case "1":
			model = new ModelAndView("plywood/admin/addColor");
			break;

		case "2":
			model = new ModelAndView("plywood/admin/addParticleboard");
			break;

		case "3":
			model = new ModelAndView("plywood/admin/processFile");
			break;
			
		}
		model.addObject("error", error);
		model.addObject("dirColors",woodService.getListDirColors());
		model.addObject("particleboards",woodService.getListParticleboards());
		//System.out.println("sb - " +sb.getTime());
	    return model;
	}


	@RequestMapping(value = "addColor" , method = RequestMethod.POST , consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ModelAndView   processColor(HttpSession session, @Valid @ModelAttribute("addColorForm") DirColor dirColor,
			BindingResult result,
			@ModelAttribute  MultipartFile file,
			@RequestParam(value = "id_dirColor",   required=false) Long id_dirColor) 
	{
		ModelAndView model = new ModelAndView("redirect:/admin?act="+sb.ADD_COLOR);

		if(result.hasErrors())
		{
			model.addObject("error", result.getFieldError().getDefaultMessage());
			return model;
		}
		if(id_dirColor != null && id_dirColor.longValue()>0) 
			dirColor.setId(id_dirColor);
		
		woodService.addColor(dirColor);
		
	    return model;
	}
	
	@RequestMapping(value = "addParticleboard" ,method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ModelAndView  processParticleboard(HttpSession session, @Valid  @ModelAttribute("addParticleboardForm") Particleboard particleboard,
			BindingResult result,
			@ModelAttribute  MultipartFile file,
			@RequestParam(value = "id_particleboard",   required=false) Long id_particleboard) 
	{
		ModelAndView model = new ModelAndView("redirect:/admin?act="+sb.ADD_PARTICLEBOARD);
		if(result.hasErrors())
		{
			model.addObject("error", result.getFieldError().getDefaultMessage());
			return model;
		}

		if(id_particleboard != null && id_particleboard>0)
		{
			particleboard.setId(id_particleboard);
		}
		
		particleboard.setDirColor(woodService.getDirColor(particleboard.getFk_dirColor()));
		woodService.addParticleboard(particleboard);
		
		model.addObject("message", fileUpload.process(file,""+particleboard.getId()));
	    return model;
	}

	
	@RequestMapping(value = "delParticleboard")
	public String  delParticleboard(HttpSession session,@RequestParam(value = "id",   defaultValue = "-1") long id) 
	{
		woodService.delObject(woodService.getParticleboard(id));
		return "redirect:/admin?act=2";
	}

	@RequestMapping(value = "delColor")
	public String  delColor(HttpSession session,@RequestParam(value = "id",   defaultValue = "-1") long id) 
	{
		woodService.delObject(woodService.getDirColor(id));
		return "redirect:/admin?act=1";
	}
	

	@RequestMapping(value = "processFile" ,method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ModelAndView  processFile( @ModelAttribute  MultipartFile file) 
	{
		ModelAndView model = new ModelAndView("redirect:/admin?act="+sb.PROCESS_FILE);
		/*
		if(result.hasErrors())
		{
			model.addObject("error", result.getFieldError().getDefaultMessage());
			return model;
		}
*/
	    return model;
	}


}
