package com.dl.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dl.model.TotalFollowUpLeads;


public interface TotalFollowUpLeadsRepository extends JpaRepository<TotalFollowUpLeads, Long> {

	List<TotalFollowUpLeads> findByTotalFollowUpLeads(boolean totalFollowUpLeads);

	long countByTotalFollowUpLeads(boolean b);
}
