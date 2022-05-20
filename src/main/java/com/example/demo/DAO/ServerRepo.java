package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Server;

public interface ServerRepo extends JpaRepository<Server, Integer> {

}
