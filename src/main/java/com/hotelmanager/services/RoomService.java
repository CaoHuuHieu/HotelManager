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
	public Long countRoomByRoomType(int id_roomtype, int status) {
		return roomRepository.countRoomByRoomType(id_roomtype, status);
	}
	
}
