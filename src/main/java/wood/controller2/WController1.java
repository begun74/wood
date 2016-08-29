package wood.controller2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

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

import wood.bean.BacketBean;
import wood.bean.SessionBean;
import wood.model.DirBrand;
import wood.model.Particleboard;
import wood.modelattribute.MIndex;
import wood.service.WoodService;
import wood.test.Member;


@Controller
@Scope("session")
public class WController1 {

	@Autowired
	private WoodService woodService;  //Service which will do all data retrieval/manipulation work

	@Autowired
	BacketBean backet;

	private List<String> courses = new ArrayList<String>();

	private List<String> rs = new ArrayList<String>();
	
	private Map<Integer,String> ops = new HashMap<Integer,String>();
	{
		rs.add("Radio1");
		rs.add("Radio2");
		rs.add("Radio3");
		rs.add("Radio4");
		
		ops.put(1,"Op1");
		ops.put(2,"Op2");
		ops.put(3,"Op3");
		ops.put(4,"Op4");
		
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
        model.addAttribute("courses", courses);
        model.addAttribute("rs", rs);
        model.addAttribute("ops", ops);
        model.addAttribute("member", member);
        
		return "plywood/test";
	}

	@RequestMapping(value = {"/test"} , method = RequestMethod.POST)
	public String  testPost(HttpSession session, @Valid @ModelAttribute("member") Member member,
			Model model, BindingResult result) 
	{
		model.addAttribute("courses", courses);
        model.addAttribute("ops", ops);
        model.addAttribute("rs", rs);
		model.addAttribute("member", member);

		System.out.println("model - "+model);
		System.out.println("member - "+member);
		
		return "plywood/test";
	}	
	
	
	@RequestMapping(value = {"/plywood"} , method = RequestMethod.GET)
	public String  plywoodGet(HttpSession session, Model model) 
	{
		MIndex mIndex = new MIndex();
		model.addAttribute("mIndex",mIndex);
		model.addAttribute("particleboards",woodService.getListParticleboards());
		model.addAttribute("brands",woodService.getListDirBrands());
		model.addAttribute("bracketBean",backet);

		//System.out.println("plywoodGet   model - "+model);
		return "plywood/index_plywood";
	}

	
	@RequestMapping(value = {"/plywood"} , method = RequestMethod.POST)
	public String  plywoodPost(HttpSession session, @Valid @ModelAttribute("mIndex") MIndex mIndex, 
			BindingResult result,
			Model model) 
	{
		model.addAttribute("mIndex",mIndex);
		
		List<Particleboard> pList = new LinkedList<Particleboard>();
		Iterator<Long> iterBrands = mIndex.getBrands().iterator();
		
		boolean isFinding = false;
		
		while(iterBrands.hasNext())
		{
			isFinding = true;
			Particleboard particleboard = new Particleboard();
			particleboard.setFk_dirBrand(iterBrands.next());
			pList.addAll( woodService.getListParticleboards(particleboard));
		}
		
		if(pList.size()!=0 || isFinding)
			model.addAttribute("particleboards",pList);
		else
			model.addAttribute("particleboards",woodService.getListParticleboards());
		
		model.addAttribute("brands",woodService.getListDirBrands());
		model.addAttribute("bracketBean",backet);

		//System.out.println("plywoodPost   mIndex - "+mIndex);
		return "plywood/index_plywood";
	}
	
	@RequestMapping(value = {"/add-product-to-customer-basket"} , method = RequestMethod.GET)
	public String  add_product_to_wish_list( Model model, @RequestParam(value = "id",   required=false) Long id)
	{
		//System.out.println("model - "+model);
		MIndex mIndex = new MIndex();
		model.addAttribute("mIndex",mIndex);
		model.addAttribute("particleboards",woodService.getListParticleboards());
		model.addAttribute("brands",woodService.getListDirBrands());
		model.addAttribute("bracketBean",backet);
		
		if(id != null)
			backet.getItems().add(woodService.getParticleboard(id));

		//System.out.println(id+"  plywood/index_plywood");
		
		return "redirect:index";
	}
}
