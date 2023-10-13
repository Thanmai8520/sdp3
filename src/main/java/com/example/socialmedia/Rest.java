package com.example.socialmedia;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Rest {
	@GetMapping("/login")
	public String login()
	{
		return "login";
	}
	@GetMapping("/success")
	public String success() {
		return "success";	
	}
	@GetMapping("/forgotpw")
	public String forgotpw()
	{
		return "forgotpw";
	}
	@GetMapping("/signup")
	public String signup()
	{
		return "signup";
	}
	@GetMapping("/home")
	public String home()
	{
		return "home";
	}
}
