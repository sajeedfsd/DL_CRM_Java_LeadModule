package com.dl.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dl.models.CreateNewLead;
import com.dl.service.LeadService;

// http://localhost:8080/api/students
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class LeadController {

	private final LeadService leadService;

    public LeadController(LeadService leadService) {
        this.leadService = leadService;
    }
    
    //http://localhost:8080/api/getAllLeads
    @GetMapping("/getAllLeads")
    public List<CreateNewLead> getAllLeads() {
        return leadService.getAllLeads();
    }

    //http://localhost:8080/api/createLead
    @PostMapping("/createLead")
    public CreateNewLead createLead(@RequestBody CreateNewLead lead) {
        return leadService.createLead(lead);
    }
    
    //http://localhost:8080/api/createLead
    @PutMapping("/updateLead")
    public CreateNewLead updateLead(@RequestBody CreateNewLead lead) {
        return leadService.leadupdateLead(lead);
    }
    
    @PutMapping("/updateLead/{id}")
    public CreateNewLead updateLead(@PathVariable(value = "id") Integer leadId, @RequestBody CreateNewLead lead) {
        return leadService.updateLead(leadId, lead);
    }

//    @DeleteMapping("/{id}")
//    public void deleteLead(@PathVariable Integer id) {
//        leadService.deleteLead(id);
//    }
    
    // http://localhost:8080/api/1
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteLead(@PathVariable Integer id) {
        leadService.deleteLead(id);
        return ResponseEntity.ok("Lead with ID :" + id + " deleted successfully");
    }
    
    //http://localhost:8080/api/users/count
    @GetMapping("/users/count")
    public long countUsers() {
        return leadService.countUsers();
    }

}
