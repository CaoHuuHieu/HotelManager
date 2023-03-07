package com.hotelmanager.services;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelmanager.entities.RoomEntity;
import com.hotelmanager.repository.RoomRepository;

@Service
public class RoomService {
	@Autowired
	RoomRepository roomRepository;
	@Transactional
	public Long countRoomByRoomType(int id_roomtype, int status) {
		return roomRepository.countRoomByRoomType(id_roomtype, status);
	}
	@Transactional
	public List<RoomEntity> getAllRoom(){
		return roomRepository.getAllRoom();
	}
	@Transactional
	public List<RoomEntity> getRoomsByTypeAndStatus(int type, int status) {
		
		return roomRepository.getRoomsByTypeAndStatus(type, status);
	}
	@Transactional
	public RoomEntity getRoombyID(int id) {
		return roomRepository.getRoombyID(id);
	}
	
	
}
