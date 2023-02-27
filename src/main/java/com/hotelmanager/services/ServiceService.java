package com.hotelmanager.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelmanager.entities.ServiceEntity;
import com.hotelmanager.repository.ServiceRepository;

@Service
public class ServiceService {
	@Autowired
	ServiceRepository serviceRepository;
	
	@Transactional
	public List<ServiceEntity> getServiceList(){
		return serviceRepository.getServiceList();
	}
	
	@Transactional
	public ServiceEntity getServicebyId(int id) {
		return serviceRepository.getServicebyId(id);
	}
	
	@Transactional
	public void addService (ServiceEntity Service) {
		serviceRepository.addService(Service);
	}
	
	@Transactional
	public void deleteService (int id) {
		serviceRepository.deleteService(id);
	}
	
	@Transactional
	public void updateService(ServiceEntity Service) {
		serviceRepository.updateService(Service);
	}
}
