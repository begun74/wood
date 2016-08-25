package wood.controller2;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import wood.bean.SessionBean;
import wood.model.DirBrand;
import wood.service.WoodService;
import wood.test.Member;


@Controller
@Scope("session")
public class WController1 {

	@Autowired
	private WoodService woodService;  //Service which will do all data retrieval/manipulation work

	private List<String> courses = new ArrayList<String>();

	{
    courses.add("Yoga");
    courses.add("Stretching");
    courses.add("Pilates");
    courses.add("Aerobic");
    courses.add("Oriental");
	}
	
	@RequestMapping(value = {"/test"} , method = RequestMethod.GET)
	public String  testGet(HttpSession session, Model model) 
	{
		Member member = new Member();
		//ModelAndView model = new ModelAndView("plywood/test");
		List<String> preCheckedVals = new ArrayList<String>();
		preCheckedVals.add("Yoga");
		member.setCourses(preCheckedVals);
        model.addAttribute("courses", courses);
        model.addAttribute("member", member);
        
		return "plywood/test";
	}

	@RequestMapping(value = {"/test"} , method = RequestMethod.POST)
	public String  testPost(HttpSession session, @Valid @ModelAttribute("member") Member member,
			Model model, BindingResult result) 
	{
		System.out.println("member - "+member);
		
		model.addAttribute("courses", courses);
		model.addAttribute("member", member);
		
		return "plywood/test";
	}	
	
	
	@RequestMapping(value = {"/plywood"} , method = RequestMethod.GET)
	public String  plywood(HttpSession session, Model model) 
	{
		//ModelAndView model = new ModelAndView("plywood/index_plywood");
		model.addAttribute("particleboards",woodService.getListParticleboards());
		model.addAttribute("brands",woodService.getListDirBrands());
		//System.out.println("model - "+model);
		return "plywood/index_plywood";
	}
	
}
