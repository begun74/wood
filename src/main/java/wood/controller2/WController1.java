package wood.controller2;


import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import wood.bean.BacketBean;
import wood.modelattribute.MIndex;
import wood.service.WoodService;


@Controller
@Scope("session")
public class WController1 {

	@Autowired
	private WoodService woodService;  //Service which will do all data retrieval/manipulation work

	@Autowired
	BacketBean backet;

	@Autowired
	MIndex mIndex;
	
	
	@RequestMapping(value = {"/plywood"} , method = RequestMethod.GET)
	public String  plywoodGet(HttpSession session, Model model) 
	{
		model.addAttribute("mIndex",mIndex);
		model.addAttribute("brands",woodService.getListDirBrands());
		model.addAttribute("bracketBean",backet);
		
		model.addAttribute("particleboards",mIndex.getListParticleboards(woodService));
		
		//System.out.println("plywoodGet   model - "+model);
		return "plywood/index_plywood";
	}

	
	@RequestMapping(value = {"/plywood"} , method = RequestMethod.POST)
	public String  plywoodPost(HttpSession session, @Valid @ModelAttribute("mIndex") MIndex m_Index, 
			BindingResult result,
			Model model) 
	{
		mIndex = m_Index;
		session.setAttribute("mIndex", mIndex);
		model.addAttribute("mIndex",mIndex);
		
		model.addAttribute("particleboards",mIndex.getListParticleboards(woodService));

		model.addAttribute("brands",woodService.getListDirBrands());
		model.addAttribute("bracketBean",backet);

		//System.out.println("plywoodPost   mIndex - "+m_Index);
		return "plywood/index_plywood";
	}
	
	@RequestMapping(value = {"/add-product-to-customer-basket"} , method = RequestMethod.GET)
	public String  add_product_to_customer_basket( Model model,
			@RequestParam(value = "id",   required=false) Long id)
	{
		//System.out.println("model - "+model);
		//System.out.println("mIndex - "+mIndex);
		model.addAttribute("mIndex",mIndex);
		model.addAttribute("particleboards",woodService.getListParticleboards());
		model.addAttribute("brands",woodService.getListDirBrands());
		model.addAttribute("bracketBean",backet);
		
		if(id != null)
			backet.addParticleboardToBacket(woodService.getParticleboard(id));

		//System.out.println(id+"  plywood/index_plywood");
		
		return "redirect:plywood";
	}

	@RequestMapping(value = {"/del-from-backet"} , method = RequestMethod.GET)
	public String  del_from_backet( Model model, @RequestParam(value = "id",   required=false) Long id)
	{
		//System.out.println("model - "+model);
		//System.out.println("mIndex - "+mIndex);
		model.addAttribute("mIndex",mIndex);
		model.addAttribute("particleboards",woodService.getListParticleboards());
		model.addAttribute("brands",woodService.getListDirBrands());
		model.addAttribute("bracketBean",backet);
		
		if(id != null)
			backet.remPboardFromBacket(id);

		
		return "redirect:plywood";
	}
	
}
