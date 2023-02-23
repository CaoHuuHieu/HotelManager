package com.hotelmanager.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelmanager.entities.RoomDto;
import com.hotelmanager.repository.RoomDtoRepository;
@Service
public class RoomDtoService {
	@Autowired
	RoomDtoRepository roomDtoRepository;
	@Transactional
	  public List<RoomDto> getAllRoomByStatusAndType(int type, int status){
		  return  roomDtoRepository.getAllRoomByStatusAndType(type, status);
	  }
	
}
