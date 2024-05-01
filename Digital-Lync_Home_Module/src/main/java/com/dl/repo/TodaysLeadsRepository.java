package com.dl.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dl.model.TodaysLeads;

public interface TodaysLeadsRepository  extends JpaRepository<TodaysLeads, Long>{

	List<TodaysLeads> findByTodaysLeads(boolean todaysLeads);

	long countByTodaysLeads(boolean b);

	
}
