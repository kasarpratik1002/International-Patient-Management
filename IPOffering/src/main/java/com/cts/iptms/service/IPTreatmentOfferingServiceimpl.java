package com.cts.iptms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.iptms.exceptionhandling.PackageDetailNotFoundException;
import com.cts.iptms.model.IPTreatmentPackage;
import com.cts.iptms.model.SpecialistDetail;
import com.cts.iptms.repositories.IPTreatmentPackageRepository;
import com.cts.iptms.repositories.SpecialistDetailsRepository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class IPTreatmentOfferingServiceimpl implements IPTreatmentOfferingService {

	@Autowired
	IPTreatmentPackageRepository iprepository;

	@Autowired
	SpecialistDetailsRepository specialistrepository;
	private static final String START = "START";
	@Override
	public List<IPTreatmentPackage> getIPTreatmentPackages() {
		log.info(START);
		List<IPTreatmentPackage> all = iprepository.findAll();
		log.debug("Package details: {}", all);
		log.info("END");
		return all;
	}

	@Override
	public List<IPTreatmentPackage> getIPTreatmentPackageByName(String packageName) {
		log.info(START);
		List<IPTreatmentPackage> ipTreatmentPackage = iprepository.findByName(packageName);
		if (ipTreatmentPackage.isEmpty()) {
			throw new PackageDetailNotFoundException(packageName);
		}
		log.debug("Package details: {}", ipTreatmentPackage);
		log.info("END");
		return ipTreatmentPackage;
	}
	@Override
	public List<SpecialistDetail> getSpecialistDetails() {
		log.info(START);

		List<SpecialistDetail> specialists = specialistrepository.findAll();
		log.debug("Specialists details: {}", specialists);
		log.info("END");
		return specialists;
	}
}
