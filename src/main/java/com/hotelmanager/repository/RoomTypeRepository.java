package com.hotelmanager.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hotelmanager.entities.RoomTypeEntity;
@Repository
public class RoomTypeRepository {
	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public List<RoomTypeEntity> getRoomTypeList(){
		Session session = sessionFactory.openSession();
		List<RoomTypeEntity> list = session.createQuery("from RoomTypeEntity ", RoomTypeEntity.class).getResultList();
		return list;
	}
	
	@Transactional
	public void addRoomType(RoomTypeEntity roomType) {
		Session session = sessionFactory.openSession();
		session.save(roomType);
	}
	@Transactional
	public void updateRoomType(RoomTypeEntity roomType) {
		Session session = sessionFactory.getCurrentSession();
		session.update(roomType);
	}
	@Transactional
	public void deleteRoomType(RoomTypeEntity roomType) {
		Session session = sessionFactory.openSession();
		session.delete(session);
	}
}