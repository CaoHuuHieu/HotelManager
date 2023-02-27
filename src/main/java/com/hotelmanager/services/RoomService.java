package com.hotelmanager.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelmanager.entities.RoomEntity;
import com.hotelmanager.repository.RoomRepository;

@Service
public class RoomService {
	@Autowired
	RoomRepository roomRepository;
	

	@Transactional public List<RoomEntity> getRoomList(){
		return roomRepository.getRoomList(); 
	}
	
	@Transactional
	public RoomEntity getRoombyID(int id) {
		return roomRepository.getRoombyID(id);
	}
	@Transactional
	public void addRoom (RoomEntity room) { 
		 roomRepository.addRoom(room); 
	}
	@Transactional
	public void deleteRoom (int id) { 
		 roomRepository.deleteRoom(id); 
	}
	
	@Transactional
	public void updateRoom (RoomEntity roome) { 
		 roomRepository.updateRoom(roome); 
	}
}
