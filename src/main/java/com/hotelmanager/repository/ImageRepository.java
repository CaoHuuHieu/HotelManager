package com.hotelmanager.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hotelmanager.entities.ImageEntity;

@Repository
public class ImageRepository {
	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public List<ImageEntity> getImageList(){
		Session session = sessionFactory.openSession();
		List<ImageEntity> list = session.createQuery("from ImageEntity ", ImageEntity.class).getResultList();
		return list;
	}
	
	@Transactional
	public ImageEntity getImageById(int id) {
		Session session = sessionFactory.openSession();
		ImageEntity iID = session.get(ImageEntity.class, id);
		return iID;
	}
	
	@Transactional
	public void addImage (ImageEntity image) {
		Session session = sessionFactory.openSession();
		session.save(image);
	}
	
	@Transactional
	public void deleteImage (int id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		ImageEntity image = session.find(ImageEntity.class, id);
		session.delete(image);
		session.getTransaction().commit();
		session.close();
		
	}
	
	@Transactional
	public void updateImage(ImageEntity image) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(image);
		session.getTransaction().commit();
		session.close();
	}
}