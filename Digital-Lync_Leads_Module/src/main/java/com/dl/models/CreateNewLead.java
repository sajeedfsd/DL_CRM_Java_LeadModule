package com.dl.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CreateNewLead {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private Long cc; // country code
	private Long contactNo;
	private String email;
	private Double feeCoated;

	@Enumerated(EnumType.STRING)
	private LeadStatus leadStatus;
	
	@Enumerated(EnumType.STRING)
	private LeadSource leadSource;
	
	@Enumerated(EnumType.STRING)
	private TechStack techStack;
	
	@Enumerated(EnumType.STRING)
	private Courses courses;
	
	@Enumerated(EnumType.STRING)
	private ClassMode classMode;
	
	@Enumerated(EnumType.STRING)
	private BatchTiming batchTiming;

	public CreateNewLead() {

	}

	public CreateNewLead(Integer id, String name, Long cc, Long contactNo, String email, Double feeCoated,
			LeadStatus leadStatus, LeadSource leadSource, TechStack techStack, Courses courses, ClassMode classMode,
			BatchTiming batchTiming) {
		this.id = id;
		this.name = name;
		this.cc = cc;
		this.contactNo = contactNo;
		this.email = email;
		this.feeCoated = feeCoated;
		this.leadStatus = leadStatus;
		this.leadSource = leadSource;
		this.techStack = techStack;
		this.courses = courses;
		this.classMode = classMode;
		this.batchTiming = batchTiming;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getCc() {
		return cc;
	}

	public void setCc(Long cc) {
		this.cc = cc;
	}

	public Long getContactNo() {
		return contactNo;
	}

	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getFeeCoated() {
		return feeCoated;
	}

	public void setFeeCoated(Double feeCoated) {
		this.feeCoated = feeCoated;
	}

	public LeadStatus getLeadStatus() {
		return leadStatus;
	}

	public void setLeadStatus(LeadStatus leadStatus) {
		this.leadStatus = leadStatus;
	}

	public LeadSource getLeadSource() {
		return leadSource;
	}

	public void setLeadSource(LeadSource leadSource) {
		this.leadSource = leadSource;
	}

	public TechStack getTechStack() {
		return techStack;
	}

	public void setTechStack(TechStack techStack) {
		this.techStack = techStack;
	}

	public Courses getCourses() {
		return courses;
	}

	public void setCourses(Courses courses) {
		this.courses = courses;
	}

	public ClassMode getClassMode() {
		return classMode;
	}

	public void setClassMode(ClassMode classMode) {
		this.classMode = classMode;
	}

	public BatchTiming getBatchTiming() {
		return batchTiming;
	}

	public void setBatchTiming(BatchTiming batchTiming) {
		this.batchTiming = batchTiming;
	}

	@Override
	public String toString() {
		return "CreateNewLead [id=" + id + ", name=" + name + ", cc=" + cc + ", contactNo=" + contactNo + ", email="
				+ email + ", feeCoated=" + feeCoated + ", leadStatus=" + leadStatus + ", leadSource=" + leadSource
				+ ", techStack=" + techStack + ", courses=" + courses + ", classMode=" + classMode + ", batchTiming="
				+ batchTiming + "]";
	}


}
