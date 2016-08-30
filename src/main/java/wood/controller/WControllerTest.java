package wood.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import wood.test.Member;

public class WControllerTest {
	
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

		//System.out.println("model - "+model);
		//System.out.println("member - "+member);
		
		return "plywood/test";
	}	


}
