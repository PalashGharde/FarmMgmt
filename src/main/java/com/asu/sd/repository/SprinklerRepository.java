package com.asu.sd.repository;

import org.springframework.stereotype.Repository;

import com.asu.sd.models.impl.Sprinkler;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface SprinklerRepository extends JpaRepository<Sprinkler, Long>{

}
