package com.hotelmanager.services;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelmanager.entities.UsersEntity;
import com.hotelmanager.repository.UsersRepository;

@Service
public class UsersService {
	@Autowired
	UsersRepository usersRepository;
	
	@Transactional
	public List<UsersEntity>  checkLogin(String username, String password){
		return usersRepository.checkLogin(username, password);
	}
	
	@Transactional
	public List<UsersEntity> getUsersList(){
		return usersRepository.getUsersList();
	}
	
	@Transactional
	public UsersEntity getUsersbyId(int id) {
		return usersRepository.getUsersbyId(id);
	}
	
	@Transactional
	public void addUsers (UsersEntity users) {
		usersRepository.addUsers(users);
	}
	
	@Transactional
	public void deleteUsers (int id) {
		usersRepository.deleteUsers(id);
	}
	
	@Transactional
	public void updateUsers(UsersEntity users) {
		usersRepository.updateUsers(users);
	}
}
