package wood.controller2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import wood.model.Request;
import wood.model.StatusOrder;
import wood.service.WoodService;



@Controller
public class WAjaxController {
	
	
	@Autowired
	private WoodService woodService;  //Service which will do all data retrieval/manipulation work
	


	@ResponseBody
	@RequestMapping(value = "/statusOrder", method = RequestMethod.POST)
	public HttpStatus  statusOrder(@RequestBody StatusOrder statusOrder) {
		
		
		
		Request req = woodService.getRequest(statusOrder.getId());
		System.out.println(req);
		if(statusOrder.isStatus())
			req.setStatus(1);
		else 
			req.setStatus(0);
		
		System.out.println(req);
		
		woodService.addRequest(req);

		System.out.println(statusOrder);
		
		return HttpStatus.OK;
	}
}
