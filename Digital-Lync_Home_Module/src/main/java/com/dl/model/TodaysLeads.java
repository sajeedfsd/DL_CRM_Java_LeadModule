package com.dl.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TodaysLeads {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private boolean todaysLeads;

	public TodaysLeads() {

	}

	public TodaysLeads(Long id, boolean todaysLeads) {
		super();
		this.id = id;
		this.todaysLeads = todaysLeads;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isTodaysLeads() {
		return todaysLeads;
	}

	public void setTodaysLeads(boolean todaysLeads) {
		this.todaysLeads = todaysLeads;
	}

}
