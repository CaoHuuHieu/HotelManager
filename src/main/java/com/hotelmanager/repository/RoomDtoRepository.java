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
		Query<RoomDto> query = null;
		String sql = "Select new com.hotelmanager.entities.RoomDto(r.id, r.room_no, r.room_name, t.name, r.status) "
				+ "From RoomEntity r , RoomTypeEntity t where r.id_roomtype=t.id ";
		if(status == 0) {
			if(type != 0){
				sql += "and r.id_roomtype="+type;
			}
		}else {
			
			if(type == 0) 
				sql += "and r.status="+status;
			else
				sql += "and r.status="+status +" and id_roomtype="+type;
		}
		query = session.createQuery(sql, RoomDto.class);
		return query.getResultList();
	}
}
