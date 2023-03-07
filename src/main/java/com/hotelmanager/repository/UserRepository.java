package com.hotelmanager.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hotelmanager.entities.UserEntity;

@Repository
public class UserRepository {
	@Autowired
	SessionFactory sessionFactoty;
	
	@Transactional
	public List<UserEntity> findCustommer(String cccd) {
		Session session =  sessionFactoty.openSession();
		return session.createQuery("from UserEntity where cccd="+cccd, UserEntity.class).getResultList();
	}
	
	@Transactional
	public UserEntity getUserByID(int id) {
		Session session =  sessionFactoty.openSession();
		return session.createQuery("from UserEntity where id="+id, UserEntity.class).getSingleResult();
	}
	@Transactional
	public void addNewUser(UserEntity customer) {
		Session session =  sessionFactoty.openSession();
		session.save(customer);
	}
	
}
