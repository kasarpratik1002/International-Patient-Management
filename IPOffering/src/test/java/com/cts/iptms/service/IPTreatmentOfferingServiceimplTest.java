package com.cts.iptms.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.cts.iptms.exceptionhandling.PackageDetailNotFoundException;
import com.cts.iptms.model.IPTreatmentPackage;
import com.cts.iptms.model.SpecialistDetail;
import com.cts.iptms.repositories.IPTreatmentPackageRepository;
import com.cts.iptms.repositories.SpecialistDetailsRepository;

@ExtendWith(MockitoExtension.class)
class IPTreatmentOfferingServiceimplTest {

	
	
	@Mock
	IPTreatmentPackageRepository iptreatmentPackageRepository;
	@Mock
	SpecialistDetailsRepository specialistDetailsRepository;

	@InjectMocks
	IPTreatmentOfferingServiceimpl iptreatmentOfferingServiceimpl;

	@Test
	void testGetIPTreatmentPackages() {
		List<IPTreatmentPackage> ipTreatmentPackages = new ArrayList<IPTreatmentPackage>();
		when(iptreatmentPackageRepository.findAll()).thenReturn(ipTreatmentPackages);

		assertEquals(ipTreatmentPackages, iptreatmentOfferingServiceimpl.getIPTreatmentPackages());

	}

	@Test
	void testGetIPTreatmentPackageByName() {
		

			List<IPTreatmentPackage> listIPTreatmentPackage=new ArrayList<IPTreatmentPackage>();
		when(iptreatmentPackageRepository.findByName("package1")).thenReturn(listIPTreatmentPackage);
		when(iptreatmentPackageRepository.findByName("package6")).thenReturn(null);
		assertEquals(listIPTreatmentPackage,
				iptreatmentPackageRepository.findByName("package1"));
		assertEquals(null,
				iptreatmentPackageRepository.findByName("package6"));
	
	
	}

	@Test
	void testGetIPTreatmentPackageByNameWithmoreDetails() {
		IPTreatmentPackage iPTreatmentPackage1 = new IPTreatmentPackage();
		
		IPTreatmentPackage iPTreatmentPackage2 = new IPTreatmentPackage();

			List<IPTreatmentPackage> listIPTreatmentPackage=new ArrayList<IPTreatmentPackage>();
			listIPTreatmentPackage.add(iPTreatmentPackage1);
			listIPTreatmentPackage.add(iPTreatmentPackage2);
		when(iptreatmentPackageRepository.findByName("package1")).thenReturn(listIPTreatmentPackage);
		when(iptreatmentPackageRepository.findByName("package6")).thenReturn(null);
		assertEquals(listIPTreatmentPackage,
				iptreatmentOfferingServiceimpl.getIPTreatmentPackageByName("package1")	);
		assertEquals(null,
				iptreatmentPackageRepository.findByName("package6"));
	
	
	}
	
	
	@Test()
	void testPackageDetailException() {
		assertThrows(PackageDetailNotFoundException.class,
				() -> iptreatmentOfferingServiceimpl.getIPTreatmentPackageByName("Package 6"));
	}
	
	@Test
	void testGetSpecialists() {
		List<SpecialistDetail> specialistDetails = new ArrayList<SpecialistDetail>();
		when(specialistDetailsRepository.findAll()).thenReturn(specialistDetails);

		assertEquals(specialistDetails, iptreatmentOfferingServiceimpl.getSpecialistDetails());

	}

}
