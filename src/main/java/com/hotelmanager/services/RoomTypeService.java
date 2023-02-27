package com.hotelmanager.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelmanager.entities.RoomTypeEntity;
import com.hotelmanager.repository.RoomTypeRepository;
@Service 
public class RoomTypeService {
	@Autowired
	RoomTypeRepository roomTypeRepository;
	

	@Transactional
	public List<RoomTypeEntity> getRoomTypeList(){
		return roomTypeRepository.getRoomTypeList();
	}
	
}
