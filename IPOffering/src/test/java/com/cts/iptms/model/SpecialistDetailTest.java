package com.cts.iptms.model;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class SpecialistDetailTest {

	SpecialistDetail specialistdetail = new SpecialistDetail();

	

	@Test
	void testSetId() {
		specialistdetail.setId(101);
		assertEquals(101, specialistdetail.getId());
	}

	@Test
	void testGetId() {
		specialistdetail.setId(101);
		assertEquals(101, specialistdetail.getId());
	}

	@Test
	void testSetName() {
		specialistdetail.setName("Dr. XYZ");
		assertEquals("Dr. XYZ", specialistdetail.getName());
	}

	@Test
	void testGetName() {
		specialistdetail.setName("Dr. XYZ");
		assertEquals("Dr. XYZ", specialistdetail.getName());
	}

	@Test
	void testSetAreaOfExpertise() {
		specialistdetail.setAreaOfExpertise("Urology");
		assertEquals("Urology", specialistdetail.getAreaOfExpertise());
	}

	@Test
	void testGetAreaOfExpertise() {
		specialistdetail.setAreaOfExpertise("Urology");
		assertEquals("Urology", specialistdetail.getAreaOfExpertise());

	}

	@Test
	void testSetExperienceInYear() {
		specialistdetail.setExperience(10);
		assertEquals(10, specialistdetail.getExperience());
	}

	@Test
	void testGetExperienceInYear() {
		specialistdetail.setExperience(10);
		assertEquals(10, specialistdetail.getExperience());
	}

	@Test
	void testSetContactNumber() {
		specialistdetail.setContactNumber(123456789);
		
		assertEquals(123456789L, specialistdetail.getContactNumber());
	}

	@Test
	void testGetContactNumber() {
		specialistdetail.setContactNumber(1234567890);
		assertEquals(1234567890L, specialistdetail.getContactNumber());
	}

}
