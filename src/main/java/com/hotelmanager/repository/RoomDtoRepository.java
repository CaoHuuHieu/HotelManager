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
	@Transactional
	  public List<RoomDto> getAllRoomByStatusAndType(int type, int status){
		Session session = sessionFactory.openSession(); 
		Query query = null;
		if(status == 0 && type == 0) {
			query = session.createQuery("Select new com.hotelmanager.entities.RoomDto(r.id, r.room_no, r.room_name, t.name, r.status)"
			  		+ " From RoomEntity r , RoomTypeEntity t where r.id_roomtype=t.id");
		}else {
			query = session.createQuery("Select new com.hotelmanager.entities.RoomDto(r.id, r.room_no, r.room_name, t.name, r.status)"
				  		+ " From RoomEntity r , RoomTypeEntity t where r.id_roomtype=t.id and r.status=:status and t.id=:type");
				  query.setParameter("status", status);
				  query.setParameter("type", type);
		}
		 return query.getResultList();
	  
	  }
	 
}
