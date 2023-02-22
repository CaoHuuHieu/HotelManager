package com.hotelmanager.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelmanager.repository.RoomRepository;

@Service
public class RoomService {
	@Autowired
	RoomRepository roomRepository;
	@Transactional
	public Long countRoomByStatus(int status) {
		return roomRepository.countRoomByStatus(status);
	}
}
