package com.hotelmanager.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelmanager.entities.UserEntity;
import com.hotelmanager.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	@Transactional
	public List<UserEntity> findCustommer(String cccd) {
		return userRepository.findCustommer(cccd);
	}
	@Transactional
	public UserEntity getUserByID(int id) {
		return userRepository.getUserByID(id);
	}
	@Transactional
	public void addNewUser(UserEntity customer) {
		userRepository.addNewUser(customer);
	}
}
