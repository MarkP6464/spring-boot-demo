package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{
	public Category findByName(String name);
}
