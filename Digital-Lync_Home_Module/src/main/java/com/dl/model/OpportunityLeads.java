package com.dl.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class OpportunityLeads {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private boolean opportunityLeads;
	
	public OpportunityLeads() {
		
	}
	
	public OpportunityLeads(Long id, boolean opportunityLeads) {
		super();
		this.id = id;
		this.opportunityLeads = opportunityLeads;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isOpportunityLeads() {
		return opportunityLeads;
	}

	public void setOpportunityLeads(boolean opportunityLeads) {
		this.opportunityLeads = opportunityLeads;
	}
	
	
}
