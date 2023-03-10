package com.hotelmanager.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hotelmanager.entities.RoomTypeEntity;
import com.hotelmanager.services.RoomService;
import com.hotelmanager.services.RoomTypeService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	RoomTypeService roomTypeService;
	@Autowired
	RoomService roomService;
	@RequestMapping("")
	public String getAllProduct() {
		return "login";
	}
	@RequestMapping("/room")
	public String room() {
		return "admin/roomlist";
	}	
	@RequestMapping("/addroom")
	public String addRoom() {
		return "admin/add_or_editroom";
	}
	
	@RequestMapping("/sodophong")
	public String giaoDienDatPhong(Model view) {
		List<RoomTypeEntity> roomTypes = roomTypeService.getRoomTypeList();
		view.addAttribute("roomTypes", roomTypes);
		return "admin/sodophong";
	}
	@RequestMapping("/booking")
	public String giaoDienDanhSachBooking(Model view) {
		List<RoomTypeEntity> roomTypes = roomTypeService.getRoomTypeList();
		view.addAttribute("roomTypes", roomTypes);
		return "admin/danhsachbooking";
	}
	@ResponseBody
	@RequestMapping(value = "/laysophong", method = RequestMethod.GET)
	public String laySoPhong() {
		return 321321321+"";
	}
}

