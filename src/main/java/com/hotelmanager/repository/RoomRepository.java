package com.hotelmanager.repository;


import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
				query = session.createQuery("select count(p.id) from RoomEntity p where p.id_roomtype=:id_roomtype");
			else {
				query = session.createQuery("select count(p.id) from RoomEntity p where p.status=:status and id_roomtype=:id_roomtype");
				 query.setParameter("status", status);
			}
			 query.setParameter("id_roomtype", id_roomtype);
		}
		return (Long) query.uniqueResult();
	}

}
