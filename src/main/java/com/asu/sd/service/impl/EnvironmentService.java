package com.asu.sd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.asu.sd.models.impl.MoistureSensor;

@Component
public class EnvironmentService {
	
	@Autowired
	SensorService sensorService;

	@Scheduled(fixedRate = 10000)
	public void trigger() {
			System.out.println("Infitie loop started - EnvironmentService");
			Long farmId = (long) 7;
			long sensorId = 0;
			List<MoistureSensor> sensors= sensorService.getMoistureSensors(farmId); ////take  farmid input from user
			for(MoistureSensor sensor: sensors) {
				if(sensor.getReading()>=0.2f) {
					sensorId = sensor.getSensorId();
					System.out.println("Water is evaporating from soil moisture level decreases by 0.1");
					//sensorService.updateMoistureInSensor(sensorId , farmId, sensor.getReading()-0.1f);
				}
				
			}
	}

}
