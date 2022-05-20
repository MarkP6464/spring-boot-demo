package com.example.demo.DAO;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Modified;

public interface modifiedRepo extends JpaRepository<Modified, UUID>{

}
