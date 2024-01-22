package com.Arc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Userdata {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	
    private String username;
    
    private String email;
    
    private String firstName;
    
    private String lastName;

}
