package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Reviews;

public interface ReviewsRepository extends JpaRepository<Reviews, String> {

}
