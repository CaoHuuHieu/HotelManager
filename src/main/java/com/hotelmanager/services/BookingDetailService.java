package com.hotelmanager.services;

import java.sql.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelmanager.entities.BookingDetailEntity;
import com.hotelmanager.repository.BookingDetailRepository;

@Service
public class BookingDetailService {
	@Autowired
	BookingDetailRepository bookingDetailRepository;
	@Transactional
	public List<BookingDetailEntity> getAllBookingDetail(){
		return bookingDetailRepository.getAllBookingDetail();
	}
	
	@Transactional
	public BookingDetailEntity getBookingDetailByRoomID(int roomID){
		return bookingDetailRepository.getBookingDetailByRoomID(roomID);
	}
	@Transactional
	public List<BookingDetailEntity> getAllBookingDetailByRoomID(int roomID){
		return bookingDetailRepository.getAllBookingDetailByRoomID(roomID);
	}
	@Transactional
	public Long checkDateNewBooking(int roomID, Date checkIn, Date checkOut) {
		return bookingDetailRepository.checkDateNewBooking(roomID, checkIn, checkOut);
	}
	
	@Transactional
	public void addNewBookingDetail(BookingDetailEntity detailEntity) {
		bookingDetailRepository.addNewBookingDetail(detailEntity);
	}
	
}
