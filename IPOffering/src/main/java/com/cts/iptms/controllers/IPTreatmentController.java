package com.cts.iptms.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.cts.iptms.model.IPTreatmentPackage;
import com.cts.iptms.model.SpecialistDetail;
import com.cts.iptms.service.IPTreatmentOfferingService;

@RestController
public class IPTreatmentController {
	@Autowired
	IPTreatmentOfferingService service;

	@GetMapping("/IPTreatementPackages")
	public List<IPTreatmentPackage> getInPatientServicePackages(@RequestHeader(name = "Authorization") String token) {
		service.validateToken(token);
		return service.getIPTreatmentPackages();

	}

	@GetMapping("/IPTreatementPackageByName/{packageName}")
	public List<IPTreatmentPackage> getIPTreatmentPackageByName(@RequestHeader(name = "Authorization") String token,@PathVariable String packageName) {
		service.validateToken(token);
		return service.getIPTreatmentPackageByName(packageName);
		
	}

	@GetMapping("/Specialists")
	public List<SpecialistDetail> getSpecialistDetails(@RequestHeader(name = "Authorization") String token) {
		service.validateToken(token);
		return service.getSpecialistDetails();
		
	}
}
