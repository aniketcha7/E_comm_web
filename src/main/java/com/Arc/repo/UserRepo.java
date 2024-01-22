package com.Arc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Arc.entity.Userdata;

public interface UserRepo extends JpaRepository<Userdata, Long> {

}
