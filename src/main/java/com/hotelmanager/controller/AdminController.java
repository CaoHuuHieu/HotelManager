package com.hotelmanager.controller;


import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hotelmanager.dto.BookingDTO;
import com.hotelmanager.entities.BookingDetailEntity;
import com.hotelmanager.entities.BookingEntity;
import com.hotelmanager.entities.ImageEntity;
import com.hotelmanager.entities.RoomEntity;
import com.hotelmanager.entities.RoomTypeEntity;
import com.hotelmanager.entities.UserEntity;
import com.hotelmanager.services.BookingDetailService;
import com.hotelmanager.services.BookingService;
import com.hotelmanager.services.ImageService;
import com.hotelmanager.services.RoomService;
import com.hotelmanager.services.RoomTypeService;
import com.hotelmanager.services.UserService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	RoomTypeService roomTypeService;
	@Autowired
	RoomService roomService;
	@Autowired
	BookingService bookingService;
	@Autowired
	UserService userService;
	@Autowired
	ImageService imageService;
	@Autowired
	BookingDetailService bookingDetailService;
	@RequestMapping("")
	public String getAllProduct() {
		return "login";
	}
	@RequestMapping("/room")
	public String room() {
		return "admin/roomlist";
	}	
	/*
	 * @RequestMapping("/addroom") public String addRoom() { return
	 * "admin/add_or_editroom"; }
	 */
	
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
	
	@RequestMapping(value = "/datphong", method = RequestMethod.GET)
	public String laySoPhong(Model view, @RequestParam(name="roomid") int roomID) {
		view.addAttribute("idroom", roomID);
		List<BookingDetailEntity> list  = bookingDetailService.getAllBookingDetailByRoomID(roomID);
		view.addAttribute("bookingDetails", list);
		view.addAttribute("bookingdto", new BookingDTO());
		return "admin/datphong";
	}
	@RequestMapping(value = "/addNewBooking", method = RequestMethod.POST)
	public String addNewBooking(@ModelAttribute("bookingdto") BookingDTO bookingDto, BindingResult bindingResult) {
		
		UserEntity staff = userService.getUserByID(2);
		UserEntity customer = null;
		List<UserEntity> users = userService.findCustommer(bookingDto.getCccd());
		if( users.size() > 0) {
			customer = users.get(0);
		}else {
			customer = new UserEntity(bookingDto.getFullName(), bookingDto.getBirthDay(),bookingDto.getPhone_number(),  bookingDto.getAddress(), bookingDto.getEmail(), bookingDto.getCccd() );
			System.out.println("Helllo cao huuuuuuuuuuuuuuuuuuuuuuuuuuu" +customer.toString());
			userService.addNewUser(customer);
			
		}
		Date bookingAt = Date.valueOf(LocalDate.now());
		BookingEntity bookingEntity = new BookingEntity(staff, customer, bookingDto.getCheckIn(), bookingDto.getCheckOut(), bookingAt, 0);
		bookingService.addNewBooking(bookingEntity);
		
		RoomEntity roomEntity = roomService.getRoombyID(bookingDto.getIdRoom());
		int price = roomEntity.getPrice();
		BookingDetailEntity bookingDetailEntity = new BookingDetailEntity(bookingEntity, roomEntity, price);
		
		bookingDetailService.addNewBookingDetail(bookingDetailEntity);
		
		return  "redirect:datphong?roomid="+bookingDto.getIdRoom();
	}
	 
}

