package com.hotelmanager.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelmanager.entities.ImageEntity;
import com.hotelmanager.repository.ImageRepository;

@Service
public class ImageService {
	@Autowired
	ImageRepository imageRepository;
	
	@Transactional
	public List<ImageEntity> getImageList(){
		return imageRepository.getImageList();
	}
	
	@Transactional
	public ImageEntity getImageById(int id) {
		return imageRepository.getImageById(id);
	}
	
	@Transactional
	public void addImage (ImageEntity image) {
		imageRepository.addImage(image);
	}
	
	@Transactional
	public void deleteImage (int id) {
		imageRepository.deleteImage(id);
	}
	
	@Transactional
	public void updateImage(ImageEntity image) {
		imageRepository.updateImage(image);
	}
}
