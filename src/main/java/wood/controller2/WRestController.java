package wood.controller2;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class WRestController {

	
	@RequestMapping(value = "/user/", method = RequestMethod.GET)
	public ResponseEntity<Void> listAllUsers() {
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
}
