package com.dl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dl.model.OpportunityLeads;
import com.dl.repo.OpportunityLeadsRepository;

@Service
public class OpportunityLeadService {

	@Autowired
	private OpportunityLeadsRepository opportunityLeadsRepository;
	
	public OpportunityLeadService() {
		
	}

	public OpportunityLeadService(OpportunityLeadsRepository opportunityLeadsRepository) {
		super();
		this.opportunityLeadsRepository = opportunityLeadsRepository;
	}
	
	public List<OpportunityLeads> getAllLeads() {
		return opportunityLeadsRepository.findAll();
	}

	public List<OpportunityLeads> getFollowUpLeads() {
		return opportunityLeadsRepository.findByOpportunityLeads(true);
	}

	public long getFollowUpLeadsCount() {
		return opportunityLeadsRepository.countByOpportunityLeads(true);
	}

	public OpportunityLeads createLead(OpportunityLeads newLead) {
		return opportunityLeadsRepository.save(newLead);
	}
}
