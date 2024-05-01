package com.dl.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TotalFollowUpLeads {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private boolean totalFollowUpLeads;

	public TotalFollowUpLeads() {

	}

	public TotalFollowUpLeads(Long id, boolean totalFollowUpLeads) {
		super();
		this.id = id;
		this.totalFollowUpLeads = totalFollowUpLeads;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isTotalFollowUpLeads() {
		return totalFollowUpLeads;
	}

	public void setTotalFollowUpLeads(boolean totalFollowUpLeads) {
		this.totalFollowUpLeads = totalFollowUpLeads;
	}

}
