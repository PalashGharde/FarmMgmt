package com.asu.sd.repository;

import org.springframework.stereotype.Repository;

import com.asu.sd.models.impl.Sprinkler;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface SprinklerRepository extends JpaRepository<Sprinkler, Long>{
	
	@Query("select s from Sprinkler s where s.farmId=?1")
	List<Sprinkler> findByFarmId(Long farmId);

}
