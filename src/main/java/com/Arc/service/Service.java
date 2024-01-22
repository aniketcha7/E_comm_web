package com.Arc.service;

import java.util.List;

import com.Arc.entity.Userdata;

public interface Service {
	
	Userdata saveuser(Userdata theUserdata);
	
	List<Userdata> getusers();

}
