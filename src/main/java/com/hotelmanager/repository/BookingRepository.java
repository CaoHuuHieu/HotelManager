package com.hotelmanager.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hotelmanager.entities.BookingEntity;

@Repository
public class BookingRepository {
	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public List<BookingEntity> getAllBookKing(){
		List<BookingEntity> list = null;
		Session session = sessionFactory.openSession();
		list = session.createQuery("From BookingEntity", BookingEntity.class).getResultList();
		return list;
	}
}
