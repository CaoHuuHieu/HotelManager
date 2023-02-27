package com.hotelmanager.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hotelmanager.entities.CategoryEntity;

@Repository
public class CategoryRepository {
	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public List<CategoryEntity> getCategoryNameList(){
		Session session = sessionFactory.openSession();
		List<CategoryEntity> list = session.createQuery("from CategoryEntity ", CategoryEntity.class).getResultList();
		return list;
	}
}
