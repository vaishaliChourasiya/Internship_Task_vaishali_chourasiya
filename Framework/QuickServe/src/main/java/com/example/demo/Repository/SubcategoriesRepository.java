package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Subcategories;

public interface SubcategoriesRepository extends JpaRepository<Subcategories, String> {

}
