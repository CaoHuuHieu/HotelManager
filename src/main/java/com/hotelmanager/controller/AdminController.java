package com.hotelmanager.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hotelmanager.entities.RoomDto;
import com.hotelmanager.entities.RoomEntity;
import com.hotelmanager.entities.RoomTypeEntity;
import com.hotelmanager.services.RoomDtoService;
import com.hotelmanager.services.RoomService;
import com.hotelmanager.services.RoomTypeService;



@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	RoomTypeService roomTypeService;
	@Autowired
	RoomService roomService;
	@Autowired
	RoomDtoService roomDtoService;
	
	@RequestMapping("/")
	public String getAllProduct() {
		return "login";
	}
	
	/* Room*/
	@RequestMapping("/room")
	public String room(Model m) {
		List<RoomDto> roomlist = roomDtoService.getRoomList();
		m.addAttribute("roomlist",roomlist);
		return "admin/roomlist";
	}	
	@RequestMapping("/addroom")
	public String addRoom(Model m) {
		List<RoomTypeEntity> listtype = roomTypeService.getRoomTypeList();
		m.addAttribute("listtype",listtype);
		m.addAttribute("command", new RoomEntity());
		return "admin/add_or_editroom";
	}
	@RequestMapping(value="/saveroom", method = RequestMethod.POST)
	public String saveRoom(@ModelAttribute("RoomEntity") RoomEntity room) {
		roomService.addRoom(room);
		return "redirect:/admin/room";
	}

	@RequestMapping(value="/deleteroom/{id}")    
	public String deleteRoom(@PathVariable int id) {
		roomService.deleteRoom(id);
		return "redirect:/admin/room";
	}
	
	
	/* */
	@RequestMapping("/sodophong")
	public String giaoDienDatPhong(Model view) {
		List<RoomTypeEntity> roomTypes = roomTypeService.getRoomTypeList();
		view.addAttribute("roomTypes", roomTypes);
		return "admin/sodophong";
	}
	@ResponseBody
	@RequestMapping(value = "/laysophong", method = RequestMethod.GET)
	public String laySoPhong() {
		return 321321321+"";
	}
}

