package com.dl.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dl.model.OpportunityLeads;

public interface OpportunityLeadsRepository extends JpaRepository<OpportunityLeads, Long> {

	List<OpportunityLeads> findByOpportunityLeads(boolean opportunityLeads);

	long countByOpportunityLeads(boolean b);
}
