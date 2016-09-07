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

import wood.model.Request;
import wood.model.StatusOrder;
import wood.service.WoodService;



@Controller
public class WAjaxController {
	
	
	@Autowired
	private WoodService woodService;  //Service which will do all data retrieval/manipulation work
	


	@ResponseBody
	@RequestMapping(value = "/statusOrder", method = RequestMethod.POST)
	public ResponseEntity<StatusOrder>  statusOrder(@RequestBody StatusOrder statusOrder) {
		
		
		
		Request req = woodService.getRequest(statusOrder.getId());
		if(statusOrder.isStatus())
			req.setStatus(1);
		else 
			req.setStatus(0);
		
		woodService.addRequest(req);

		return new ResponseEntity<StatusOrder>(statusOrder, HttpStatus.OK);
	}
}
