package com.dl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dl.model.TodaysLeads;
import com.dl.repo.OpportunityLeadsRepository;

public class OpportunityLeadService {

	@Autowired
	private OpportunityLeadsRepository opportunityLeadsRepository;
	
	public OpportunityLeadService() {
		
	}

	public OpportunityLeadService(OpportunityLeadsRepository opportunityLeadsRepository) {
		super();
		this.opportunityLeadsRepository = opportunityLeadsRepository;
	}
	
	public List<OpportunityLeadsRepository> getAllLeads() {
		return opportunityLeadsRepository.findAll();
	}

	public List<OpportunityLeadsRepository> getFollowUpLeads() {
		return opportunityLeadsRepository.findByTodaysLeads(true);
	}

	public long getFollowUpLeadsCount() {
		return opportunityLeadsRepository.countByTodaysLeads(true);
	}

	public OpportunityLeadsRepository createLead(OpportunityLeadsRepository newLead) {
		return opportunityLeadsRepository.save(newLead);
	}
}
