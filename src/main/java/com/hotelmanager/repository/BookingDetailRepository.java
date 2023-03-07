package com.hotelmanager.repository;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hotelmanager.entities.BookingDetailEntity;

@Repository
public class BookingDetailRepository {
	@Autowired
	SessionFactory sessionFactory;
	@Transactional
	public List<BookingDetailEntity> getAllBookingDetail(){
		Session session = sessionFactory.openSession();
		return session.createQuery("from BookingDetailEntity", BookingDetailEntity.class).getResultList();
	}

	/*
	 * @Transactional public BookingDetailEntity getBookingDetailByRoomID(int
	 * roomID) { Session session = sessionFactory.openSession(); return
	 * session.createQuery("from BookingDetailEntity where roomEntity.id="+roomID,
	 * BookingDetailEntity.class).getSingleResult(); }
	 */
	@Transactional
	public BookingDetailEntity getBookingDetailByRoomID(int roomID) {
		Session session = sessionFactory.openSession();
		Date current_date =  Date.valueOf(LocalDate.now());
		System.out.println("currrent day:   "+current_date);
		Query<BookingDetailEntity> query =  session.createQuery("from BookingDetailEntity"
				+ " where roomEntity.id="+roomID+" and bookingEntity.checkin <= :current_date "
						+ "and bookingEntity.checkout >= :current_date", BookingDetailEntity.class);
		query.setParameter("current_date", current_date);
		return query.getSingleResult();
		
	}
	@Transactional
	public List<BookingDetailEntity> getAllBookingDetailByRoomID(int roomID) {
		Session session = sessionFactory.openSession();
		Query<BookingDetailEntity> query = session.createQuery("from BookingDetailEntity where roomEntity.id="+roomID+" and bookingEntity.checkout >= :current_date", BookingDetailEntity.class);
		Date current_date =  Date.valueOf(LocalDate.now());
		query.setParameter("current_date", current_date);
		return query.getResultList();
	}
	@Transactional
	public Long checkDateNewBooking(int roomID, Date checkIn, Date checkOut) {
		Session session = sessionFactory.openSession();
		Query query =  session.createQuery("Select count(id) from BookingDetailEntity where roomEntity.id=:roomID  and ((bookingEntity.checkin > :checkIn and bookingEntity.checkin < :checkOut) or ( bookingEntity.checkout < :checkOut and bookingEntity.checkout >:checkIn))");
		query.setParameter("roomID", roomID);
		  query.setParameter("checkIn", checkIn); 
		  query.setParameter("checkOut", checkOut);
		 Long count  = (Long) query.uniqueResult();
		return count;
	}
	@Transactional
	public void addNewBookingDetail(BookingDetailEntity detailEntity) {
		Session session = sessionFactory.openSession();
		session.save(detailEntity);
	}
	
}
