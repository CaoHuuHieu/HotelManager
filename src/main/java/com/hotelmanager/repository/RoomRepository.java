package com.hotelmanager.repository;

import java.util.List;

import javax.management.Query;
import javax.transaction.Transactional;
import javax.validation.constraints.Email;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hotelmanager.entities.RoomDto;
import com.hotelmanager.entities.RoomEntity;

@Repository

public class RoomRepository {
	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public RoomEntity getRoombyID(int id) {
		Session session = sessionFactory.openSession();
		RoomEntity roomid = session.get(RoomEntity.class, id);
		return roomid;
	}
	
	
	@Transactional public List<RoomEntity> getRoomList(){ 
		Session session = sessionFactory.openSession();
		List<RoomEntity> list = session.createQuery("from RoomEntity r", RoomEntity.class).getResultList();
		return list; 
	}
	
	
	@Transactional
	public void addRoom (RoomEntity room) {
		Session session = sessionFactory.openSession();
		RoomEntity newroom = new RoomEntity(room.getRoom_no(),room.getRoom_name(), room.getId_roomtype(),room.getNum_people() ,room.getPrice());
		session.save(newroom);
	}
	
	@Transactional
	public void deleteRoom (int id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		RoomEntity roomEntity = session.find(RoomEntity.class, id);
		session.delete(roomEntity);
		session.getTransaction().commit();
		session.close();
		
	}
	
	@Transactional
	public void updateRoom(RoomEntity roome) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(roome);
		session.getTransaction().commit();
		session.close();
	}
	
}
