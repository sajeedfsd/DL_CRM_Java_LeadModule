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

    public void deleteLead(Integer id) {
        leadRepository.deleteById(id);
    }
    
    public long countUsers() {
        return leadRepository.count();
    }

}
