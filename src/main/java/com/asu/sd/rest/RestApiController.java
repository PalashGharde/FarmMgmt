package com.asu.sd.rest;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.asu.sd.models.impl.FarmDetails;
import com.asu.sd.models.impl.MoistureSensor;
import com.asu.sd.repository.FarmDetailsRepository;
import com.asu.sd.service.impl.SensorService;

@RestController
@RequestMapping("/rest")
public class RestApiController {
	
	@Autowired
	FarmDetailsRepository farmDetailsRepository;
	
	@Autowired
	SensorService sensorService;
	
//    @GetMapping("/hello")
//    public String hello() {
////    	farmDetailsRepository.save(new FarmDetails().setFarmId(null))
//    	FarmDetails fm1= new FarmDetails();
//    	fm1.setOwner("SR3");
//    	fm1.setEmail("sr3@asu.edu");
//    	FarmDetails fm2 = new FarmDetails();
//    	fm2.setOwner("SR4");
//    	fm2.setEmail("sr4@asu.edu");
//    	farmDetailsRepository.save(fm1);
//    	farmDetailsRepository.save(fm2);
//    	String str = "WHAZZUP!!!!!\n Hello Palash, Sriranjan, Ravi";
//        return str;
//    }
//
//	@GetMapping("/getOwner")
//    public List<String> getFarmOwnerNames() {
//    	List<FarmDetails> farmDetailsList = farmDetailsRepository.findAll();
//    	return farmDetailsList.stream().map(FarmDetails::getOwner).collect(Collectors.toList());
//    }

	@GetMapping("/getSoilMoistureSensors")
	public List<MoistureSensor> getMoistureSensors(@RequestParam("farmId") Long farmId) {
		return sensorService.getMoistureSensors(farmId);
	}

}
