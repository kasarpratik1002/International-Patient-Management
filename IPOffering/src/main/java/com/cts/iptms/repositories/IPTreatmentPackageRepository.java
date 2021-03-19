package com.cts.iptms.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cts.iptms.model.IPTreatmentPackage;
@Repository
public interface IPTreatmentPackageRepository extends JpaRepository<IPTreatmentPackage, Integer> {
	
	//List<IPTreatmentPackage> findByName(String packageName);
	@Query(value=" from IPTreatmentPackage p where p.packageDetail.treatmentPackageName=:packageName")
	List<IPTreatmentPackage> findByName(@Param("packageName") String packageName);
}
