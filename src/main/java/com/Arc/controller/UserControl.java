package com.Arc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Arc.entity.Userdata;
import com.Arc.service.Service;

@RestController
public class UserControl {


@Autowired
private Service theService;

@PostMapping("/save")
public Userdata Createemp(@RequestBody Userdata theUserdata)
{
	return theService.saveuser(theUserdata);
}

@GetMapping("getdata")
public List<Userdata> GetData(){
	
	return theService.getusers();
	
}

}
