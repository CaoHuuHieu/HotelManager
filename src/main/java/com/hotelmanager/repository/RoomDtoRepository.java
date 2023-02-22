package com.hotelmanager.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.hotelmanager.entities.RoomDto;

public class RoomDtoRepository {
	@Autowired
	SessionFactory sessionFactory;
	public List<RoomDto> getAllRoomByStatusAndType(int type, int status){
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("Select new com.hotelmanager.entities.RoomDto(r.id, r.room_no, r.room_name, t.name) From")
	}
}
