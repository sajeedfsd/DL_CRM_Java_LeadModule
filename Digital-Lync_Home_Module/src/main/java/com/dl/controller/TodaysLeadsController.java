package com.dl.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dl.model.TodaysLeads;
import com.dl.model.TotalFollowUpLeads;
import com.dl.service.TodaysLeadsLeadService;

@RestController
@RequestMapping("/api/todaysleads/followups")
public class TodaysLeadsController {

	private final TodaysLeadsLeadService todaysLeadsLeadService;

    public TodaysLeadsController(TodaysLeadsLeadService todaysLeadsLeadService) {
        this.todaysLeadsLeadService = todaysLeadsLeadService;
    }
    
    //http://localhost:8080/api/todaysleads/followups/
    @GetMapping("/")
    public List<TodaysLeads> getFollowUpLeads() {
        return todaysLeadsLeadService.getFollowUpLeads();
    }
    
    //http://localhost:8080/api/todaysleads/followups/count
    @GetMapping("/count")
    public long getFollowUpLeadsCount() {
        return todaysLeadsLeadService.getFollowUpLeadsCount();
    }
    
    //http://localhost:8080/api/todaysleads/followups/leads
    @PostMapping("/leads")
    public TodaysLeads createLead(@RequestBody TodaysLeads newLead) {
        return todaysLeadsLeadService.createLead(newLead);
    }
    
    //http://localhost:8080/api/todaysleads/followups/getAllLeads
  	@GetMapping("/getAllLeads")
  	public List<TodaysLeads> getAllLeads() {
  		return todaysLeadsLeadService.getAllLeads();
  	}
}
