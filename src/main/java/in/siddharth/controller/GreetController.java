package in.siddharth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class GreetController {
	

	
	@GetMapping("/Greet")
	public String getGreetMsg (Model model) {
		String  msg = "Welcome ..!!";
		model.addAttribute("msg",msg);
		return "index";
	}
	
	@GetMapping("/wish")
	public String getWishMsg (Model model) {
		String  msg = "Good Evening ..!!";
		int i =10/0;
		model.addAttribute("msg",msg);
		return "index";
	}
	
	

}
