package com.asu.sd.repository;

import org.springframework.stereotype.Repository;

import com.asu.sd.models.impl.FarmDetails;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface FarmDetailsRepository extends JpaRepository<FarmDetails, Long>{

}
