package com.bit2025.mysite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bit2025.mysite.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/join")
	public String join() {
		return "user/join";
		
	}

}
