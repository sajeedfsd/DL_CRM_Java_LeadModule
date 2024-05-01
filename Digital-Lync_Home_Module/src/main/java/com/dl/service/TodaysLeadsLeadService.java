package com.dl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dl.model.TodaysLeads;
import com.dl.repo.TodaysLeadsRepository;

@Service
public class TodaysLeadsLeadService {

	@Autowired
	private TodaysLeadsRepository todaysLeadsRepository;

	public TodaysLeadsLeadService() {

	}

	public TodaysLeadsLeadService(TodaysLeadsRepository todaysLeadsRepository) {
		this.todaysLeadsRepository = todaysLeadsRepository;
	}

	public List<TodaysLeads> getAllLeads() {
		return todaysLeadsRepository.findAll();
	}

	public List<TodaysLeads> getFollowUpLeads() {
		return todaysLeadsRepository.findByTodaysLeads(true);
	}

	public long getFollowUpLeadsCount() {
		return todaysLeadsRepository.countByTodaysLeads(true);
	}

	public TodaysLeads createLead(TodaysLeads newLead) {
		return todaysLeadsRepository.save(newLead);
	}
	
}
