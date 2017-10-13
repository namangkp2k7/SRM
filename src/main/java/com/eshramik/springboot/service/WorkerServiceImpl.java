package com.eshramik.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eshramik.springboot.model.Worker;
import com.eshramik.springboot.repositories.WorkerRepository;

@Service("workerService")
@Transactional
public class WorkerServiceImpl implements WorkerService {
	
	@Autowired
	private WorkerRepository workerRepository;
	
	public void saveUser(Worker user) {
		workerRepository.save(user);
	}

	@Override
	public void saveWorker(Worker user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isUserExist(Worker worker) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Worker> findAllUsers() {
		// TODO Auto-generated method stub
		return workerRepository.findAll();
	}

}
