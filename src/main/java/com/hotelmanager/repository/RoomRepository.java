package com.hotelmanager.repository;


import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hotelmanager.entities.RoomEntity;

@Repository
public class RoomRepository {
	@Autowired
	SessionFactory sessionFactory;
	@Transactional
	public Long countRoomByRoomType(int id_roomtype, int status) {
		Session session = sessionFactory.openSession();
		Query query = null; 
		if(id_roomtype == 0) {
			if(status == 0)
				query = session.createQuery("select count(p.id) from RoomEntity p");
			else {
				query = session.createQuery("select count(p.id) from RoomEntity p where p.status=:status ");
				 query.setParameter("status", status);
			}
		}else {
			if(status == 0)
				query = session.createQuery("select count(p.id) from RoomEntity p where p.roomTypeEntity.id=:id_roomtype");
			else {
				query = session.createQuery("select count(p.id) from RoomEntity p where p.status=:status and p.roomTypeEntity.id=:id_roomtype");
				 query.setParameter("status", status);
			}
			 query.setParameter("id_roomtype", id_roomtype);
		}
		return (Long) query.uniqueResult();
	}
	@Transactional
	public List<RoomEntity> getAllRoom(){
		Session session =  sessionFactory.openSession();
		return session.createQuery("from RoomEntity", RoomEntity.class).getResultList();
	}
	@Transactional
	public List<RoomEntity> getRoomsByTypeAndStatus(int type, int status) {
		Session session = sessionFactory.openSession();
		Query<RoomEntity> query = null; 
		if(type == 0) {
			if(status == 0)
				query = session.createQuery(" from RoomEntity p", RoomEntity.class);
			else {
				query = session.createQuery("from RoomEntity p where p.status=:status", RoomEntity.class);
				query.setParameter("status", status);
			}
		}else {
			if(status == 0)
				query = session.createQuery("from RoomEntity p where p.roomTypeEntity.id=:id_roomtype", RoomEntity.class);
			else {
				query = session.createQuery("from RoomEntity p where p.status=:status and p.roomTypeEntity.id=:id_roomtype", RoomEntity.class);
				 query.setParameter("status", status);
			}
			 query.setParameter("id_roomtype", type);
		}
		return  query.getResultList();
	}
	
	@Transactional
	public RoomEntity getRoombyID(int id) {
		Session session = sessionFactory.openSession();
		RoomEntity roomid = session.get(RoomEntity.class, id);
		return roomid;
	}

}
