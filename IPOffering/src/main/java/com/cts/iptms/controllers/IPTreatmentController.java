package com.cts.iptms.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cts.iptms.model.IPTreatmentPackage;
import com.cts.iptms.model.SpecialistDetail;
import com.cts.iptms.service.IPTreatmentOfferingService;

@RestController
public class IPTreatmentController {
	@Autowired
	IPTreatmentOfferingService service;
	
	
	
	@GetMapping("/IPTreatementPackages")
	public List<IPTreatmentPackage> getInPatientServicePackages() {
		 List<IPTreatmentPackage> packages = service.getIPTreatmentPackages();
		return packages;
	}
	
	
	@GetMapping("/IPTreatementPackageByName/{packageName}")
	public List<IPTreatmentPackage> getIPTreatmentPackageByName(@PathVariable String packageName) {
		List<IPTreatmentPackage> ipTreatmentPackageByName = service.getIPTreatmentPackageByName(packageName);
		return ipTreatmentPackageByName;
	}
	
	
	
	@GetMapping("/Specialists")
	public List<SpecialistDetail> getSpecialistDetails(){
		List<SpecialistDetail> specialistDetails = service.getSpecialistDetails();
		return specialistDetails;
	}
}
