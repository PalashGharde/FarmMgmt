package com.asu.sd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.asu.sd.models.impl.MoistureSensor;
import com.asu.sd.repository.MoistureSensorRepository;

@Component
public class SensorService {
	
	@Autowired
	MoistureSensorRepository moistureSensorRepository;
	
	public List<MoistureSensor> getMoistureSensors(Long farmId) {
		return moistureSensorRepository.findByFarmId(farmId);
	}

}
