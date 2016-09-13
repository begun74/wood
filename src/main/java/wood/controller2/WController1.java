package wood.controller2;


import java.util.Iterator;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import wood.bean.BacketBean;
import wood.bean.CompareBean;
import wood.model.DirColor;
import wood.model.Particleboard;
import wood.model.Request;
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
	CompareBean compBean;

	@Autowired
	MIndex mIndex;
	
	
	@RequestMapping(value = {"/plywood"} , method = RequestMethod.GET)
	public String  plywoodGet(HttpSession session, @ModelAttribute("mIndex") MIndex m_Index, Model model) 
	{
		mIndex = m_Index;
		session.setAttribute("mIndex", mIndex);
		model.addAttribute("mIndex",mIndex);
		
		model.addAttribute("brands",woodService.getListDirBrands());
		model.addAttribute("backetBean",backet);
		model.addAttribute("compBean",compBean);
		
		model.addAttribute("particleboards",mIndex.getListParticleboards(woodService));

		return "plywood/index_plywood";
	}

	
	@RequestMapping(value = {"/plywood"} , method = RequestMethod.POST)
	public String  plywoodPost(HttpSession session, @ModelAttribute("mIndex") MIndex m_Index, Model model) 
	{
		mIndex = m_Index;
		session.setAttribute("mIndex", mIndex);
		model.addAttribute("mIndex",mIndex);
		
		model.addAttribute("particleboards",mIndex.getListParticleboards(woodService));

		model.addAttribute("brands",woodService.getListDirBrands());
		model.addAttribute("backetBean",backet);
		model.addAttribute("compBean",compBean);

		return "plywood/index_plywood";
	}
	
	@RequestMapping(value = {"/add-product-to-customer-basket"} , method = RequestMethod.GET)
	public String  add_product_to_customer_basket( Model model,
			@RequestParam(value = "id",   required=false) Long id,
			@RequestParam(value = "action",   required=false) String action)
	{
		model.addAttribute("mIndex",mIndex);
		model.addAttribute("particleboards",woodService.getListParticleboards());
		model.addAttribute("brands",woodService.getListDirBrands());
		model.addAttribute("backetBean",backet);
		
		if(id != null)
			backet.addParticleboardToBacket(woodService.getParticleboard(id));

		if(action != null)
			return "redirect:"+action;
		
		return "redirect:plywood";
	}

	@RequestMapping(value = {"/del-from-backet"} , method = RequestMethod.GET)
	public String  del_from_backet( Model model, @RequestParam(value = "id",   required=false) Long id)
	{
		model.addAttribute("mIndex",mIndex);
		model.addAttribute("particleboards",woodService.getListParticleboards());
		model.addAttribute("brands",woodService.getListDirBrands());
		model.addAttribute("backetBean",backet);
		
		if(id != null)
			backet.remPboardFromBacket(id);

		
		return "redirect:plywood";
	}
	

	@RequestMapping(value = {"/add-product-to-compare-list"} , method = RequestMethod.GET)
	public String  add_product_to_compare( Model model,
			@RequestParam(value = "id",   required=false) Long id)
	{
		model.addAttribute("particleboards",compBean.getItems());
		model.addAttribute("backetBean",backet);
		
		if(id != null)
			compBean.addParticleboardToCompList(woodService.getParticleboard(id));

		
		return "redirect:plywood";
	}
	
	@RequestMapping(value = {"/del-from-compare"} , method = RequestMethod.GET)
	public String  del_from_compare( Model model,
			@RequestParam(value = "id",   required=false) Long id)
	{
		model.addAttribute("particleboards",compBean.getItems());
		model.addAttribute("backetBean",backet);
		
		if(id != null)
			compBean.getItems().remove(woodService.getParticleboard(id));
		
		if(compBean.getItems().size() == 0)
			return "redirect:index";
		
		return "redirect:compare";
	}

	@RequestMapping(value = {"/compare"} , method = RequestMethod.GET)
	public String  compare( Model model)
	{
		model.addAttribute("particleboards",compBean.getArrItems());
		model.addAttribute("backetBean",backet);
		model.addAttribute("compBean",compBean);
		
		if(compBean.getItems().size() == 0)
			return "redirect:index";
		
		return "plywood/compare_plywood";
	}
	
	
	@RequestMapping(value = {"/createOrder"} , method = RequestMethod.GET)
	public String  createOrderGET( Model model)
	{
		Request req = new Request();
		model.addAttribute("requestForm",req);
		model.addAttribute("particleboards",compBean.getItems());
		model.addAttribute("backetBean",backet);
		model.addAttribute("compBean",compBean);
		model.addAttribute("mIndex",mIndex);
		
		if(backet.getItems().size()==0)
			return "redirect:plywood";
		
		return "plywood/createOrder";
	}

	
	@RequestMapping(value = {"/createOrder"} , method = RequestMethod.POST)
	public String  createOrderPOST( ModelMap model,  @ModelAttribute("requestForm") @Valid  Request request,
			BindingResult result)
	{

		model.addAttribute("particleboards",compBean.getItems());
		model.addAttribute("backetBean",backet);
		model.addAttribute("compBean",compBean);

		
		if(result.hasErrors())
		{
			return "plywood/createOrder";
		}
		
		Iterator<Particleboard> iter = backet.getItems().iterator();
		
		while(iter.hasNext())
		{
			Request toOrder = new Request();
			
			toOrder.setName(request.getName());
			toOrder.setPhone(request.getPhone());
			toOrder.setFk_particleboard(iter.next().getId());
			toOrder.setDescription(request.getDescription());
			toOrder.setEmail(request.getEmail());
			
			woodService.addRequest(toOrder);
		}
		
		backet.getItems().clear();
		backet.getItemsTM().clear();
		//System.out.println("createOrderPOST");
		
		return "redirect:plywood";
	}


	
	
}
