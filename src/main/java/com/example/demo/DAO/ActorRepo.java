package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Actor;

public interface ActorRepo extends JpaRepository<Actor, Integer>{

}
