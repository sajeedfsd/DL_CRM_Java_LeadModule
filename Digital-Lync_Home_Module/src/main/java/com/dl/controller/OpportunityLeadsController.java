package com.dl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dl.model.OpportunityLeads;
import com.dl.service.OpportunityLeadService;

@RestController
@RequestMapping("/api/oppportunityleads/followups")
public class OpportunityLeadsController {

	@Autowired
	private OpportunityLeadService opportunityLeadService;
	
	public OpportunityLeadsController() {
		
	}

	public OpportunityLeadsController(OpportunityLeadService opportunityLeadService) {
		super();
		this.opportunityLeadService = opportunityLeadService;
	}
	
	 //http://localhost:8080/api/oppportunityleads/followups/
    @GetMapping("/")
    public List<OpportunityLeads> getFollowUpLeads() {
        return opportunityLeadService.getFollowUpLeads();
    }
    
    //http://localhost:8080/api/oppportunityleads/followups/count
    @GetMapping("/count")
    public long getFollowUpLeadsCount() {
        return opportunityLeadService.getFollowUpLeadsCount();
    }
    
    //http://localhost:8080/api/oppportunityleads/followups/leads
    @PostMapping("/leads")
    public OpportunityLeads createLead(@RequestBody OpportunityLeads newLead) {
        return opportunityLeadService.createLead(newLead);
    }
    
    //http://localhost:8080/api/oppportunityleads/followups/getAllLeads
  	@GetMapping("/getAllLeads")
  	public List<OpportunityLeads> getAllLeads() {
  		return opportunityLeadService.getAllLeads();
  	}
	
}
