package com.dl.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dl.models.CreateNewLead;
import com.dl.repo.LeadRepository;

@Service
public class LeadService {

	private final LeadRepository leadRepository;

    public LeadService(LeadRepository leadRepository) {
        this.leadRepository = leadRepository;
    }

    public List<CreateNewLead> getAllLeads() {
        return leadRepository.findAll();
    }

    public CreateNewLead createLead(CreateNewLead lead) {
        return leadRepository.save(lead);
    }
    
    public CreateNewLead leadupdateLead(CreateNewLead lead) {
        return leadRepository.save(lead);
    }
    
    public CreateNewLead updateLead(Integer id, CreateNewLead leadDetails) {
        CreateNewLead lead = leadRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Lead not found for this id :: " + id));

        lead.setName(leadDetails.getName());
        lead.setCc(leadDetails.getCc());
        lead.setContactNo(leadDetails.getContactNo());
        lead.setEmail(leadDetails.getEmail());
        lead.setFeeCoated(leadDetails.getFeeCoated());
        lead.setDescription(leadDetails.getDescription());
        lead.setNextFollowUp(leadDetails.getNextFollowUp());
        lead.setLeadStatus(leadDetails.getLeadStatus());
        lead.setLeadSource(leadDetails.getLeadSource());
        lead.setTechStack(leadDetails.getTechStack());
        lead.setCourses(leadDetails.getCourses());
        lead.setClassMode(leadDetails.getClassMode());
        lead.setBatchTiming(leadDetails.getBatchTiming());

        return leadRepository.save(lead);
    }

    public void deleteLead(Integer id) {
        leadRepository.deleteById(id);
    }
    
    public long countUsers() {
        return leadRepository.count();
    }

}
