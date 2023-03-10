package com.hotelmanager.controller;

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

import com.hotelmanager.entities.BookingEntity;
import com.hotelmanager.entities.RoomDto;
import com.hotelmanager.services.BookingService;
import com.hotelmanager.services.RoomDtoService;
import com.hotelmanager.services.RoomService;

@RestController
@RequestMapping("/api")
public class AdminApiController {
	@Autowired
	RoomDtoService roomDtoService;
	@Autowired
	BookingService bookingService;
	@Autowired
	RoomService roomService;
	@RequestMapping(value="/getRoomList", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<RoomDto>> getRoomList(@RequestParam(required = false) String roomtype, @RequestParam(required = false) String status) {
		roomtype = (roomtype == null)?"0":roomtype;
		status = (status == null)?"0":status;
		int roomType = Integer.parseInt(roomtype);
		int stats =  Integer.parseInt(status);
		List<RoomDto> list = roomDtoService.getAllRoomByStatusAndType(roomType, stats);
		return new ResponseEntity<List<RoomDto>>(list, HttpStatus.OK);
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
	
	@RequestMapping(value="/bookingList", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<BookingEntity>> getBookingList(@RequestParam(required = false) String phonebooking, @RequestParam(required = false) String typebooking,  @RequestParam(required = false) String datecheckin,  @RequestParam(required = false) String datecheckout) {
		List<BookingEntity> list = bookingService.getAllBookKing();
		System.out.println("Helllo c??c b???n "+list);
		return  new ResponseEntity<List<BookingEntity>>(list, HttpStatus.OK);

	}
}
