package com.hotelmanager.repository;

import javax.management.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class RoomRepository {
	@Autowired
	SessionFactory sessionFactory;
	public Long countRoomByStatus(int status) {
		Session session = sessionFactory.openSession();
		@SuppressWarnings("rawtypes")
		org.hibernate.query.Query query = session.createQuery("select count(p.id) from RoomEntity p where status=:status");
		query.setString("status", status+"");
		 return (Long)query.uniqueResult();
	}
	public List<> countRoomByStatus(int status) {
		Session session = sessionFactory.openSession();
		@SuppressWarnings("rawtypes")
		org.hibernate.query.Query query = session.createQuery("select count(p.id) from RoomEntity p where status=:status");
		query.setString("status", status+"");
		 return (Long)query.uniqueResult();
	}
}
