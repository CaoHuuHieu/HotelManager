package com.hotelmanager.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hotelmanager.entities.ServiceEntity;

@Repository
public class ServiceRepository {
	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public List<ServiceEntity> getServiceList(){
		Session session = sessionFactory.openSession();
		List<ServiceEntity> list = session.createQuery("from ServiceEntity s", ServiceEntity.class).getResultList();
		return list;
	}
	
	@Transactional
	public ServiceEntity getServicebyId(int id) {
		Session session = sessionFactory.openSession();
		ServiceEntity serviceID = session.get(ServiceEntity.class,id);
		return serviceID;
	}
	
	@Transactional
	public void addService (ServiceEntity service) {
		Session session = sessionFactory.openSession();
		ServiceEntity newService = new ServiceEntity(service.getCategory(),service.getTitle(), service.getThumbnail(), service.getDescription(), service.getPrice(),service.getAmount());
		session.save(newService);
	}
	
	@Transactional
	public void deleteService (int id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		ServiceEntity serviceEntity = session.find(ServiceEntity.class, id);
		session.delete(serviceEntity);
		session.getTransaction().commit();
		session.close();
		
	}
	
	@Transactional
	public void updateService(ServiceEntity service) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(service);
		session.getTransaction().commit();
		session.close();
	}
	
}
