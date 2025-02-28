package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Service;

public interface ServiceRepository extends JpaRepository<Service, String> {

}
