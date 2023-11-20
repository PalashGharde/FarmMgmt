package com.asu.sd.repository;

import org.springframework.stereotype.Repository;

import com.asu.sd.models.impl.MoistureSensor;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface MoistureSensorRepository extends JpaRepository<MoistureSensor, String>{

	@Query(value="select s from MoistureSensor s where s.farmId=?1")
	List<MoistureSensor> findByFarmId(Long farmId);

	@Transactional
	@Modifying
	@Query("update MoistureSensor s set s.reading=:NewMoisture where s.sensorId=:SensorId and s.farmId=:FarmId")
	void updateMoistureInSensor(@Param(value = "SensorId") Long sensorId,@Param(value = "FarmId") Long farmId, @Param(value = "NewMoisture") float new_moisture);
	
}
