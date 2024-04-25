package com.dl.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dl.models.CreateNewLead;


@Repository
public interface LeadRepository extends JpaRepository<CreateNewLead, Integer> {

	
	
}
