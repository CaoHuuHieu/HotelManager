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
	
	
	@RequestMapping("/rooms")
	public String trangRoom() {
		return "user/roompage";
	}
	
	@RequestMapping("/about")
	public String trangAbout() {
		return "user/aboutpage";
	}
	
	@RequestMapping("/contact")
	public String trangContact() {
		return "user/contactpage";
	}
	
	@RequestMapping("/rooms/detail")
	public String trangRoomDetail() {
		return "user/roomdetail";
	}
}
