package wood.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import wood.model.DirColor;
import wood.model.FileUpload;
import wood.model.Particleboard;
import wood.service.WoodService;

@Controller
@RequestMapping(value = {"/manage"} , method = RequestMethod.GET)
public class WControllerManage {

	
	private static String UPLOAD_FOLDER = "/wood/src/main/webapp/resources/pics";
	
	@Autowired
	private WoodService woodService;  //Service which will do all data retrieval/manipulation work

	@Autowired
	FileUpload fileUpload;
	
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
		model.addObject("particleboards",woodService.getListParticleboards());
		
	    return model;
	}


	@RequestMapping(value = "addColor" , method = RequestMethod.POST , consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ModelAndView  addColor(HttpSession session, @ModelAttribute("addColorForm") DirColor dirColor,
			@ModelAttribute  MultipartFile file) 
	{
		//System.out.println("dirColor - "+dirColor.getName());
		
		woodService.addColor(dirColor);
		
		ModelAndView model = new ModelAndView("redirect:/manage?act=1");
		//model.addObject("dirColors",woodService.getListDirColors());
		//System.out.println("addColor");
	    return model;
	}
	
	@RequestMapping(value = "addParticleboard" ,method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ModelAndView  addParticleboard(HttpSession session, @ModelAttribute("addParticleboardForm") Particleboard particleboard,
			@ModelAttribute  MultipartFile file) 
	{
		
		particleboard.setDirColor(woodService.getDirColor(particleboard.getFk_dirColor()));
		woodService.addParticleboard(particleboard);
		System.out.println("particleboard - "+particleboard.getId());
		ModelAndView model = new ModelAndView("redirect:/manage?act=2");
		
		model.addObject("message", fileUpload.process(file,""+particleboard.getId()));
	    return model;
	}


}
