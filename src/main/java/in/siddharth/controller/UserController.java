package in.siddharth.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class UserController {
	
	@GetMapping("/user")
	public String getWishMsg (Model model) {
		String  msg = "Good Evening ..!!";
		String s =null;
		s.length();
		model.addAttribute("msg",msg);
		return "index";
	}

}
