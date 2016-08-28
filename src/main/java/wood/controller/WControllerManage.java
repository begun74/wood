package wood.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.commons.io.FileUtils;
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
import wood.model.DirBrand;
import wood.model.DirColor;
import wood.model.Particleboard;
import wood.service.WoodService;
import wood.util.FileUpload;
import wood.util.ReadExcelUtil;

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
			
		case "4":
			model = new ModelAndView("plywood/admin/addPhoto");
			break;
			
		case "5":
			model = new ModelAndView("plywood/admin/addBrand");
			break;
		}
		model.addObject("error", error);
		model.addObject("dirColors",woodService.getListDirColors());
		model.addObject("particleboards",woodService.getListParticleboards());
		model.addObject("dirBrands",woodService.getListDirBrands());
		//System.out.println("sb - " +sb.getTime());
	    return model;
	}

	@RequestMapping(value = "addBrand" , method = RequestMethod.POST , consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ModelAndView   processBrand(HttpSession session, @Valid @ModelAttribute("addBrandForm") DirBrand dirBrand,
			BindingResult result,
			@ModelAttribute  MultipartFile file,
			@RequestParam(value = "id_dirBrand",   required=false) Long id_dirBrand) 
	{
		ModelAndView model = new ModelAndView("redirect:/admin?act="+sb.ADD_BRAND);

		if(result.hasErrors())
		{
			model.addObject("error", result.getFieldError().getDefaultMessage());
			return model;
		}
		if(id_dirBrand != null && id_dirBrand.longValue()>0) 
			dirBrand.setId(id_dirBrand);
		
		woodService.addBrand(dirBrand);
		
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

	@RequestMapping(value = "addPhoto" , method = RequestMethod.POST , consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ModelAndView   processPhoto( @ModelAttribute  MultipartFile file) 
	{
		ModelAndView model = new ModelAndView("redirect:/admin?act="+sb.ADD_PHOTO);

		fileUpload.processPhoto(file);
		//System.out.println("addPhoto");
	    return model;
	}

	
	@RequestMapping(value = "delParticleboard")
	public String  delParticleboard(HttpSession session,@RequestParam(value = "id",   defaultValue = "-1") long id) 
	{
		woodService.delObject(woodService.getParticleboard(id));
		return "redirect:/admin?act="+sb.ADD_PARTICLEBOARD;
	}

	@RequestMapping(value = "delColor")
	public String  delColor(HttpSession session,@RequestParam(value = "id",   defaultValue = "-1") long id) 
	{
		woodService.delObject(woodService.getDirColor(id));
		return "redirect:/admin?act="+sb.ADD_COLOR;
	}
	
	@RequestMapping(value = "delBrand")
	public String  delBrand(HttpSession session,@RequestParam(value = "id",   defaultValue = "-1") long id) 
	{
		woodService.delObject(woodService.getDirBrand(id));
		return "redirect:/admin?act="+sb.ADD_BRAND;
	}

	@RequestMapping(value = "processFile" ,method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ModelAndView  processFile( @ModelAttribute  MultipartFile file) 
	{
		ModelAndView model = new ModelAndView("redirect:/admin?act="+sb.PROCESS_FILE);
		
		List<Particleboard>  pList = fileUpload.process(file);
		
		pList.forEach(p -> woodService.addParticleboard(p));
		
		//for(Particleboard p: pList)
		//	woodService.addParticleboard(p);
		//FileUtils.writeByteArrayToFile(file, file.getBytes());
		//ReadExcelUtil.readParticleboard(file);
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
