package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Business;

public interface BusinessRepository extends JpaRepository<Business, String>{

}
