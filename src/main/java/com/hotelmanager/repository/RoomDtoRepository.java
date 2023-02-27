	package com.hotelmanager.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hotelmanager.entities.RoomDto;

@Repository
public class RoomDtoRepository {
	@Autowired
	SessionFactory sessionFactory;
	public List<RoomDto> getAllRoomByStatusAndType(int type, int status){
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("Select new com.hotelmanager.entities.RoomDto(r.id, r.room_no, r.room_name, t.name) From");
		return null;
	}

	@Transactional
	public List<RoomDto> getRoomList(){
		Session session = sessionFactory.openSession();
		List<RoomDto> list = session.createQuery("SELECT new com.hotelmanager.entities.RoomDto(r.id, r.room_no, r.room_name, r.num_people,r.price,r.id_roomtype,r.status, rt.name) FROM RoomEntity r, RoomTypeEntity rt WHERE r.id_roomtype = rt.id ", RoomDto.class).getResultList();
		return list;
	}
	
}
