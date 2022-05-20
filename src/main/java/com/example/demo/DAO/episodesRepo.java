package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Episodes;

public interface episodesRepo extends JpaRepository<Episodes, Integer> {

}
