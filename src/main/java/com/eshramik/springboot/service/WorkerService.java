package com.eshramik.springboot.service;

import java.util.List;

import com.eshramik.springboot.model.Worker;

public interface WorkerService {
	
	void saveWorker(Worker user);

	boolean isUserExist(Worker worker);

	void saveUser(Worker worker);

	List<Worker> findAllUsers();

}
