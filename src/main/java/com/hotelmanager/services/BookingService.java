package com.hotelmanager.services;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelmanager.entities.BookingEntity;
import com.hotelmanager.repository.BookingRepository;

@Service
public class BookingService {
	@Autowired
	BookingRepository bookingRepository;
	@Transactional
	public List<BookingEntity> getAllBookKings(){
		return bookingRepository.getAllBooking();
	}
	
	
	@Transactional
	public void addNewBooking(BookingEntity bookingEntity) {
		bookingRepository.addNewBooking(bookingEntity);
	}
	@Transactional
	public void deleteBooking (int id) {
		bookingRepository.deleteBooking(id);
	}
	
	@Transactional
	public void updateBooking (BookingEntity bookingEntity) {
		bookingRepository.updateBooking(bookingEntity);
	}
}
