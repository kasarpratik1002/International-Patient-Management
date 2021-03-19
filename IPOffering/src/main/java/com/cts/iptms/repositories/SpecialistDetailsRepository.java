package com.cts.iptms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.iptms.model.SpecialistDetail;
@Repository
public interface SpecialistDetailsRepository extends JpaRepository<SpecialistDetail, Integer> {

}
