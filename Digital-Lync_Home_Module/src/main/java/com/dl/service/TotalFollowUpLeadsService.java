package com.dl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dl.model.TotalFollowUpLeads;
import com.dl.repo.TotalFollowUpLeadsRepository;

@Service
public class TotalFollowUpLeadsService {

	@Autowired
	private TotalFollowUpLeadsRepository totalFollowUpLeadsRepository;

	public TotalFollowUpLeadsService() {

	}

	public TotalFollowUpLeadsService(TotalFollowUpLeadsRepository totalFollowUpLeadsRepository) {

		this.totalFollowUpLeadsRepository = totalFollowUpLeadsRepository;
	}

	public List<TotalFollowUpLeads> getAllLeads() {
		return totalFollowUpLeadsRepository.findAll();
	}

	public List<TotalFollowUpLeads> getFollowUpLeads() {
		return totalFollowUpLeadsRepository.findByTotalFollowUpLeads(true);
	}

	public long getFollowUpLeadsCount() {
		return totalFollowUpLeadsRepository.countByTotalFollowUpLeads(true);
	}

	public TotalFollowUpLeads createLead(TotalFollowUpLeads newLead) {
		return totalFollowUpLeadsRepository.save(newLead);
	}
}
