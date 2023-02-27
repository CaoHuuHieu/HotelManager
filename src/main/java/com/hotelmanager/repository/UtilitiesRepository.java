package com.hotelmanager.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hotelmanager.entities.UtilitiesEntity;

@Repository
public class UtilitiesRepository {
	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public UtilitiesEntity getUtilitiesById(int id) {
		Session session = sessionFactory.openSession();
		UtilitiesEntity uID = session.get(UtilitiesEntity.class, id);
		return uID;
	}
	
	@Transactional
	public List<UtilitiesEntity> getUtilitiesList(){
		Session session = sessionFactory.openSession();
		List<UtilitiesEntity> list = session.createQuery("from UtilitiesEntity u",UtilitiesEntity.class).getResultList();
		return list;
	}
	
	@Transactional
	public void addUtilities (UtilitiesEntity utilities) {
		Session session = sessionFactory.openSession();
		UtilitiesEntity newroom = new UtilitiesEntity(utilities.getName(), utilities.getThumbnail(), utilities.getDescription());
		session.save(newroom);
	}
	
	@Transactional
	public void deleteUtilities (int id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		UtilitiesEntity utiEntity = session.find(UtilitiesEntity.class, id);
		session.delete(utiEntity);
		session.getTransaction().commit();
		session.close();
		
	}
	
	@Transactional
	public void updateUtilities(UtilitiesEntity utilities) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(utilities);
		session.getTransaction().commit();
		session.close();
	}
	
}
