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
	SessionFactory sessionFactory ;
	
	@Transactional
	public List<BookingEntity> getAllBooking(){
		Session session = sessionFactory.openSession();
		List<BookingEntity> list = session.createQuery("from BookingEntity",BookingEntity.class).getResultList();
		return list;
	}
	
	@Transactional
	public void addNewBooking (BookingEntity bookingEntity) {
		Session session = sessionFactory.openSession();
		session.save(bookingEntity);
	}
	
	@Transactional
	public void deleteBooking (int id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		BookingEntity bookEntity = session.find(BookingEntity.class, id);
		session.delete(bookEntity);
		session.getTransaction().commit();
		session.close();
	}
	
	@Transactional
	public void updateBooking(BookingEntity bookingEntity) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(bookingEntity);
		session.getTransaction().commit();
		session.close();
	}
	
}