package wood.controller2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import wood.bean.BacketBean;
import wood.bean.CompareBean;
import wood.model.CompareItems;
import wood.model.Request;
import wood.model.StatusOrder;
import wood.service.WoodService;



@Controller
public class WAjaxController {
	
	
	@Autowired
	private WoodService woodService;  //Service which will do all data retrieval/manipulation work
	
	@Autowired
	BacketBean backet;
	
	@Autowired
	CompareBean compBean;
	

	@ResponseBody
	@RequestMapping(value = "/statusOrder", method = RequestMethod.POST)
	public ResponseEntity<StatusOrder>  statusOrder(@RequestBody StatusOrder statusOrder) 
	{
		
		Request req = woodService.getRequest(statusOrder.getId());
		if(statusOrder.isStatus())
			req.setStatus(1);
		else 
			req.setStatus(0);
		
		woodService.addRequest(req);

		return new ResponseEntity<StatusOrder>(statusOrder, HttpStatus.OK);
	}


	@ResponseBody
	@RequestMapping(value = "/addToBacket{id}", method = RequestMethod.GET)
	public HttpStatus  addToBacket(@RequestParam ("id") long id) 
	{
		
		if(id > 0)
			backet.addParticleboardToBacket(woodService.getParticleboard(id));
		//System.out.println("id - " +id);
		
		return  HttpStatus.OK;
	}
	
	
	@ResponseBody
	@RequestMapping(value = {"/addToCompare{id}"} , method = RequestMethod.GET)
	public ResponseEntity<CompareItems>   add_product_to_compare( @RequestParam("id") long id)
	{
		 CompareItems compareItems = new  CompareItems();
		if(id > 0)
			compBean.addParticleboardToCompList(woodService.getParticleboard(id));
		
		compareItems.setAllItems(compBean.getItems().size());
		
		return new ResponseEntity<CompareItems>(compareItems, HttpStatus.OK);
	}


	/*
	@ResponseBody
	@RequestMapping(value = "/addToCompare{id}", method = RequestMethod.GET)
	public ResponseEntity<CompareItems>  addToCompare(@RequestBody CompareItems compareItems) 
	{
		
		if(compareItems.getAddedId() > 0)
			compBean.addParticleboardToCompList(woodService.getParticleboard(compareItems.getAddedId()));
		
		compareItems.setAllItems(compBean.getItems().size());

		return new ResponseEntity<CompareItems>(compareItems, HttpStatus.OK);
	}
	*/

}
