package com.hotelmanager.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelmanager.entities.RoomDto;
import com.hotelmanager.entities.RoomEntity;
import com.hotelmanager.entities.RoomTypeEntity;
import com.hotelmanager.repository.RoomDtoRepository;

@Service
public class RoomDtoService {
	@Autowired
	private RoomDtoRepository roomDtoRepository;
	
	@Transactional
	public List<RoomDto> getRoomList(){
		return roomDtoRepository.getRoomList();
	}
	
}
