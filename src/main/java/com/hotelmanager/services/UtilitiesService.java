package com.hotelmanager.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelmanager.entities.UtilitiesEntity;
import com.hotelmanager.repository.UtilitiesRepository;

@Service
public class UtilitiesService {
	@Autowired
	UtilitiesRepository utilitiesRepository;
	
	@Transactional
	public UtilitiesEntity getUtilitiesById(int id) {
		return utilitiesRepository.getUtilitiesById(id);
	}
	
	@Transactional
	public List<UtilitiesEntity> getUtilitiesList(){
		return utilitiesRepository.getUtilitiesList();
	}
	
	@Transactional
	public void addUtilities (UtilitiesEntity utilities) {
		utilitiesRepository.addUtilities(utilities);
	}
	
	@Transactional
	public void deleteUtilities (int id) {
		utilitiesRepository.deleteUtilities(id);
	}
	
	@Transactional
	public void updateUtilities(UtilitiesEntity utilities) {
		utilitiesRepository.updateUtilities(utilities);
	}
}
