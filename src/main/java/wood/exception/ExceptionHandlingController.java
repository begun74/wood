package wood.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class ExceptionHandlingController {

	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ModelAndView not_found(HttpServletRequest req, Exception e) {
			
		ModelAndView mav = new ModelAndView("/404");
		return mav;
	}

	
}
