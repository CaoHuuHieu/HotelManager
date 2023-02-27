package com.hotelmanager.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hotelmanager.entities.CategoryEntity;
import com.hotelmanager.entities.RoomDto;
import com.hotelmanager.entities.RoomEntity;
import com.hotelmanager.entities.RoomTypeEntity;
import com.hotelmanager.entities.ServiceEntity;
import com.hotelmanager.entities.UsersEntity;
import com.hotelmanager.entities.UtilitiesEntity;
import com.hotelmanager.services.CategoryService;
import com.hotelmanager.services.RoomDtoService;
import com.hotelmanager.services.RoomService;
import com.hotelmanager.services.RoomTypeService;
import com.hotelmanager.services.ServiceService;
import com.hotelmanager.services.UsersService;
import com.hotelmanager.services.UtilitiesService;



@Controller
@RequestMapping(value="/admin")
public class AdminController {
	@Autowired
	RoomTypeService roomTypeService;
	@Autowired
	RoomService roomService;
	@Autowired
	RoomDtoService roomDtoService;
	@Autowired
	UsersService usersService;
	@Autowired
	UtilitiesService utilitiesService;
	@Autowired
	ServiceService serviceService;
	@Autowired
	CategoryService categoryService;
	
	@RequestMapping("")
	public String Login() {
		return "login";
	}
	
	@RequestMapping("/index")
	public String Home() {
		return "admin/index";
	}
	
	
	/* =========== Login-Users ============*/
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String checkLogin(@ModelAttribute("login") UsersEntity user) {
		List<UsersEntity>  list = usersService.checkLogin(user.getUsername(),user.getPassword());
		if(list.isEmpty())
			return "redirect:/admin";
		else {
			if (list.get(0).getRole().getId()==1) {	
				
				return "redirect:/admin/index";
			}
			else {
				return "admin/roomlist";
			}
		}
	}
	
	@RequestMapping("/users")
	public String users(Model m) {
		List<UsersEntity> userslist = usersService.getUsersList();
		m.addAttribute("userslist",userslist);
		return "admin/users";
	}
	
	@RequestMapping("/addusers")
	public String addUsers(Model m) {
		m.addAttribute("command", new UsersEntity());
		m.addAttribute("method", "add");
		return "admin/add_or_editusers";
	}
	@RequestMapping(value="/saveusers", method = RequestMethod.POST)
	public String saveUsers(@ModelAttribute("UsersEntity") UsersEntity users, @RequestParam String thaotac) {
		System.out.println("==================="+users.getBirthday());
		if(thaotac.equalsIgnoreCase("update")) {
			usersService.updateUsers(users);    
		}
		else {
			usersService.addUsers(users);
		}
		return "redirect:/admin/users";
	}

	@RequestMapping(value="/deleteusers", method = RequestMethod.GET)    
	public String deleteUsers(@RequestParam int id) {
		usersService.deleteUsers(id);
		return "redirect:/admin/users";
	}
	
	@RequestMapping("/editusers")
	public String editUsers(@RequestParam int id, Model m) {
		UsersEntity editusers = usersService.getUsersbyId(id);
		m.addAttribute("command", editusers);
		m.addAttribute("method", "update");
		return "admin/add_or_editusers";
	}
	
	/* ========== Room ==========*/
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
		m.addAttribute("method", "add");
		return "admin/add_or_editroom";
	}
	@RequestMapping(value="/saveroom", method = RequestMethod.POST)
	public String saveRoom(@ModelAttribute("RoomEntity") RoomEntity room, @RequestParam String thaotac) {
		if(thaotac.equalsIgnoreCase("update")) {
			roomService.updateRoom(room);    
		}
		else {
			roomService.addRoom(room);
		}
		return "redirect:/admin/room";
	}

	@RequestMapping(value="/deleteroom", method = RequestMethod.GET)    
	public String deleteRoom(@RequestParam int id) {
		roomService.deleteRoom(id);
		return "redirect:/admin/room";
	}
	
	@RequestMapping("/editroom")
	public String editRoom(@RequestParam int id, Model m) {
		RoomEntity editroom = roomService.getRoombyID(id);
		List<RoomTypeEntity> listtype = roomTypeService.getRoomTypeList();
		m.addAttribute("listtype",listtype);
		m.addAttribute("command", editroom);
		m.addAttribute("method", "update");
		return "admin/add_or_editroom";
	}
	
	/* ========== Utilities ==========*/
	@RequestMapping("/utilities")
	public String getUtilities(Model m) {
		List<UtilitiesEntity> utilist = utilitiesService.getUtilitiesList();
		m.addAttribute("utilist",utilist);
		return "admin/Utilities";
	}
	
	@RequestMapping("/addutilities")
	public String addUtilities(Model m) {
		m.addAttribute("command", new UtilitiesEntity());
		m.addAttribute("method", "add");
		return "admin/add_or_editutilities";
	}
	@RequestMapping(value="/saveutilities", method = RequestMethod.POST)
	public String saveUtilities(@ModelAttribute("UtilitiesEntity") UtilitiesEntity utilities, @RequestParam String thaotac) {
		if(thaotac.equalsIgnoreCase("update")) {
			utilitiesService.updateUtilities(utilities);
		}
		else {
			utilitiesService.addUtilities(utilities);
		}
		return "redirect:/admin/utilities";
	}
	
	@RequestMapping(value="/deleteutilities", method = RequestMethod.GET)    
	public String deleteUtilities(@RequestParam int id) {
		utilitiesService.deleteUtilities(id);
		return "redirect:/admin/utilities";
	}
	
	@RequestMapping("/editutilities")
	public String editUtilities(@RequestParam int id, Model m) {
		UtilitiesEntity editutilities = utilitiesService.getUtilitiesById(id);
		m.addAttribute("command", editutilities);
		m.addAttribute("method", "update");
		return "admin/add_or_editutilities";
	}
	
	
	/* ========== Service ==========*/
	@RequestMapping("/service")
	public String getService(Model m) {
		List<ServiceEntity> listservice = serviceService.getServiceList();
		m.addAttribute("listservice",listservice);
		return "admin/service";
	}
	
	@RequestMapping("/addservice")
	public String addService(Model m) {
		List<CategoryEntity> listcategory = categoryService.getCategoryNameList();
		m.addAttribute("listcategory",listcategory);
		m.addAttribute("command", new ServiceEntity());
		m.addAttribute("method", "add");
		return "admin/add_or_editservice";
	}
	@RequestMapping(value="/saveservice", method = RequestMethod.POST)
	public String saveService(@ModelAttribute("ServiceEntity") ServiceEntity service, @RequestParam String thaotac) {
		if(thaotac.equalsIgnoreCase("update")) {
			serviceService.updateService(service);    
		}
		else {
			serviceService.addService(service);
		}
		return "redirect:/admin/service";
	}

	@RequestMapping(value="/deleteservice", method = RequestMethod.GET)    
	public String deleteService(@RequestParam int id) {
		serviceService.deleteService(id);
		return "redirect:/admin/service";
	}
	
	@RequestMapping("/editservice")
	public String editService(@RequestParam int id, Model m) {
		ServiceEntity editservice = serviceService.getServicebyId(id);
		List<CategoryEntity> listcategory = categoryService.getCategoryNameList();
		m.addAttribute("listcategory",listcategory);
		m.addAttribute("command", editservice);
		m.addAttribute("method", "update");
		return "admin/add_or_editservice";
	}
	
	
	/* ========== Booking ==========*/
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

