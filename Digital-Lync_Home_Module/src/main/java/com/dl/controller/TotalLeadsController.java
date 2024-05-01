package com.dl.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dl.model.TodaysLeads;
import com.dl.service.TodaysLeadsLeadService;

@RestController
@RequestMapping("/api/leads")
public class TotalLeadsController {

	private final TodaysLeadsLeadService todaysLeadsLeadService;

	public TotalLeadsController(TodaysLeadsLeadService todaysLeadsLeadService) {
		this.todaysLeadsLeadService = todaysLeadsLeadService;
	}
	
	//http://localhost:8080/api/leads/getAllLeads
	@GetMapping("/getAllLeads")
	public List<TodaysLeads> getAllLeads() {
		return todaysLeadsLeadService.getAllLeads();
	}
}
