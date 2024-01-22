package com.Arc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.Arc.entity.Userdata;
import com.Arc.repo.UserRepo;

@org.springframework.stereotype.Service
public class ServiceImp implements Service {
	
	@Autowired
	private UserRepo repo;

	@Override
	public Userdata saveuser(Userdata theUserdata) {
		
		return repo.save(theUserdata);
	}

	@Override
	public List<Userdata> getusers() {
		
		return repo.findAll();
	}

}
