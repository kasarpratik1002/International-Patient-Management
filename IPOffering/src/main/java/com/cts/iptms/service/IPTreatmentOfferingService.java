package com.cts.iptms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cts.iptms.model.IPTreatmentPackage;
import com.cts.iptms.model.SpecialistDetail;
@Service
public interface IPTreatmentOfferingService {
	
	public List<IPTreatmentPackage> getIPTreatmentPackages();
	public List<IPTreatmentPackage> getIPTreatmentPackageByName(String packageName);
	public List<SpecialistDetail> getSpecialistDetails();
	
}
