package com.dl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dl.model.TotalFollowUpLeads;
import com.dl.service.TotalFollowUpLeadsService;

@RestController
@RequestMapping("/api/totalfollowuplead/followups")
public class TotalFollowUpLeadsController {
	
	@Autowired
	TotalFollowUpLeadsService totalFollowUpLeadsService;
	
	public TotalFollowUpLeadsController() {
		
	}
	
	public TotalFollowUpLeadsController(TotalFollowUpLeadsService totalFollowUpLeadsService) {
		super();
		this.totalFollowUpLeadsService = totalFollowUpLeadsService;
	}
	
		
	//http://localhost:8080/api/totalfollowuplead/followups/
    @GetMapping("/")
    public List<TotalFollowUpLeads> getFollowUpLeads() {
        return totalFollowUpLeadsService.getFollowUpLeads();
    }
    
    //http://localhost:8080/api/totalfollowuplead/followups/count
    @GetMapping("/count")
    public long getFollowUpLeadsCount() {
        return totalFollowUpLeadsService.getFollowUpLeadsCount();
    }
    
    //http://localhost:8080/api/totalfollowuplead/followups/leads
    @PostMapping("/leads")
    public TotalFollowUpLeads createLead(@RequestBody TotalFollowUpLeads newLead) {
        return totalFollowUpLeadsService.createLead(newLead);
    }
    
    //http://localhost:8080/api/totalfollowuplead/followups/getAllLeads
  	@GetMapping("/getAllLeads")
  	public List<TotalFollowUpLeads> getAllLeads() {
  		return totalFollowUpLeadsService.getAllLeads();
  	}
}
