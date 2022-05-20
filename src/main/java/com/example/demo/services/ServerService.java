package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.ServerRepo;
import com.example.demo.entities.Server;
import com.example.demo.entities.ServerData;

@Service
public class ServerService {
	@Autowired
	ServerRepo serverRepo;
	
	public void saveForServerData(Server svData) {
		svData.getServerDatas().forEach(t -> t.setServer(svData));
		
	}
}
