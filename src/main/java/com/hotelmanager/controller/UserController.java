package com.hotelmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"/", "/home/"})
public class UserController {
	
	@RequestMapping("")
	public String trangChu() {
		return "user/homepage";
	}
}
