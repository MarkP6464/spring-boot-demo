package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Country;

public interface CountryRepo extends JpaRepository<Country, Integer>{
	public Country findByName(String name);
}
