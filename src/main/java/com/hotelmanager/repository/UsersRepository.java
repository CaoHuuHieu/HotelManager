package com.hotelmanager.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hotelmanager.entities.UsersEntity;

@Repository
public class UsersRepository {
	@Autowired
	SessionFactory sessionFactory;
	@Transactional
	public List<UsersEntity>  checkLogin(String username, String password) {
		Session session = sessionFactory.openSession();
		String sql = "from UsersEntity u where u.username='"+username+"' and u.password='"+password+"'";
		List<UsersEntity> list = session.createQuery(sql,UsersEntity.class).getResultList();
		return list;
	}
	
	@Transactional
	public List<UsersEntity> getUsersList(){
		Session session = sessionFactory.openSession();
		List<UsersEntity> list = session.createQuery("from UsersEntity r",UsersEntity.class).getResultList();
		return list;
	}
	
	@Transactional
	public UsersEntity getUsersbyId(int id) {
		Session session = sessionFactory.openSession();
		UsersEntity userID = session.get(UsersEntity.class,id);
		return userID;
	}
	
	@Transactional
	public void addUsers (UsersEntity users) {
		Session session = sessionFactory.openSession();
		/*
		 * UsersEntity newusers = new
		 * UsersEntity(users.getUsername(),users.getPassword(),users.getFullname(),users
		 * .getBirthday(),users.getCreateday(),users.getGender(),users.getPhone_number()
		 * ,users.getAddress(),users.getRole());
		 */session.save(users);
	}
	
	@Transactional
	public void deleteUsers (int id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		UsersEntity usersEntity = session.find(UsersEntity.class, id);
		session.delete(usersEntity);
		session.getTransaction().commit();
		session.close();
		
	}
	
	@Transactional
	public void updateUsers(UsersEntity users) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(users);
		session.getTransaction().commit();
		session.close();
	}
	
}

