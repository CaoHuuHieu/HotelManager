package com.hotelmanager.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelmanager.entities.BookingEntity;
import com.hotelmanager.repository.BookingRepository;

@Service
public class BookingService {
	@Autowired
	BookingRepository bookingRepository;
	@Transactional
	public List<BookingEntity> getAllBookKing(){
		return bookingRepository.getAllBookKing();
	}
}
