package com.hotelmanager.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hotelmanager.dto.BookingDTO;
import com.hotelmanager.entities.BookingDetailEntity;
import com.hotelmanager.entities.BookingEntity;
import com.hotelmanager.entities.RoomEntity;
import com.hotelmanager.entities.UserEntity;
import com.hotelmanager.services.BookingDetailService;
import com.hotelmanager.services.BookingService;

import com.hotelmanager.services.RoomService;
import com.hotelmanager.services.UserService;

@RestController
@RequestMapping("/api")
public class AdminApiController {

	@Autowired
	BookingService bookingService;
	@Autowired
	RoomService roomService;
	@Autowired
	BookingDetailService bookingDetailService;
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/getRoomsByTypeAndStatus", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<RoomEntity>> getRoomsByTypeAndStatus(@RequestParam(required = false) String type, @RequestParam(required = false) String status ) {
		type = (type == null)?"0":type;
		status = (status == null)?"0":status;
		int typeNum = Integer.parseInt(type);
		int statusNum = Integer.parseInt(status);
		List<RoomEntity> list = roomService.getRoomsByTypeAndStatus(typeNum, statusNum);
		return new ResponseEntity<List<RoomEntity>>(list, HttpStatus.OK);
	}
	@RequestMapping(value="/countRoomByType", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Long>> countRoomByType(@RequestParam(required = false) String roomtype) {
		roomtype = (roomtype == null)?"0":roomtype;
		int roomType = Integer.parseInt(roomtype);
		List<Long> list = new ArrayList<Long>();
		for(int i = 0; i < 7; i++) {
			list.add(roomService.countRoomByRoomType(roomType, i));
		}
		return new ResponseEntity<List<Long>>(list, HttpStatus.OK);
	}
	@RequestMapping(value="/getAllRoom", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<RoomEntity>> getAllRoom() {
		List<RoomEntity> list = roomService.getAllRoom();
		return  new ResponseEntity<List<RoomEntity>>(list, HttpStatus.OK);
	}
	@RequestMapping(value="/getAllBooking", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<BookingEntity>> getAllBooking() {
		List<BookingEntity> list = bookingService.getAllBookKings();
		return  new ResponseEntity<List<BookingEntity>>(list, HttpStatus.OK);

	}
	@RequestMapping(value="/getAllBookingDetail", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<BookingDetailEntity>> getAllBookingDetail() {
		List<BookingDetailEntity> list = bookingDetailService.getAllBookingDetail();
		return  new ResponseEntity<List<BookingDetailEntity>>(list, HttpStatus.OK);

	}
	@ResponseBody
	@RequestMapping(value="/getBookingDetailByID", method = RequestMethod.GET)
	public ResponseEntity<BookingDetailEntity> getBookingDetailByRoomID(@RequestParam int roomID) {
		BookingDetailEntity bookingDetailEntity = bookingDetailService.getBookingDetailByRoomID(roomID);
		return  new ResponseEntity<BookingDetailEntity>(bookingDetailEntity, HttpStatus.OK);

	}
	@ResponseBody
	@RequestMapping(value="/getAllBookingDetailByID", method = RequestMethod.GET)
	public ResponseEntity<List<BookingDetailEntity>> getAllBookingDetailByRoomID(@RequestParam int roomID) {
		List<BookingDetailEntity> bookingDetailEntitys = bookingDetailService.getAllBookingDetailByRoomID(roomID);
		return  new ResponseEntity<List<BookingDetailEntity>>(bookingDetailEntitys, HttpStatus.OK);

	}
	/*
	 * @RequestMapping(value = "/datphong", method = RequestMethod.GET) public
	 * ResponseEntity<List<BookingDetailEntity>>
	 * laySoPhong(@RequestParam(name="roomid") int roomID) {
	 * List<BookingDetailEntity> list =
	 * bookingDetailService.getAllBookingDetailByRoomID(roomID); return new
	 * ResponseEntity<List<BookingDetailEntity>>(list, HttpStatus.OK); }
	 */

	@ResponseBody
	@RequestMapping(value = "/checkNewDateBooking", method = RequestMethod.GET)
	public String checkNewDateBooking( @RequestParam int idRoom, @RequestParam Date checkIn, @RequestParam Date checkOut) {
		Long count  = bookingDetailService.checkDateNewBooking(idRoom, checkIn, checkOut);
		return  count+"";
	}
	
	@ResponseBody
	@RequestMapping(value = "/findCustomer", method = RequestMethod.GET)
	public ResponseEntity<List<UserEntity>> findCustomer( @RequestParam String cccd) {
		List<UserEntity> custommer = userService.findCustommer(cccd);
		return  new ResponseEntity<List<UserEntity>>(custommer, HttpStatus.OK);
	}
	@ResponseBody
	@RequestMapping(value = "/addNewBooking", method = RequestMethod.POST)
	public ResponseEntity<BookingDTO> addNewBooking( @RequestParam BookingDTO bookingdto) {
		
		return  new ResponseEntity<BookingDTO>(bookingdto, HttpStatus.OK);
	}
}

	
