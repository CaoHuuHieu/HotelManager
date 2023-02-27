package com.hotelmanager.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelmanager.entities.CategoryEntity;
import com.hotelmanager.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	CategoryRepository categoryRepository;
	
	@Transactional
	public List<CategoryEntity> getCategoryNameList(){
		return categoryRepository.getCategoryNameList();
	}
}
