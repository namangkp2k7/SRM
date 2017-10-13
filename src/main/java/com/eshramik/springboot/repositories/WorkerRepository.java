package com.eshramik.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.eshramik.springboot.model.Worker;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Long> {
	
	Worker findByEmailID(String emailID);
}
