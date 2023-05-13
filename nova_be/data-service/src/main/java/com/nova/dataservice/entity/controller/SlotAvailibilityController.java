package com.nova.dataservice.entity.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nova.dataservice.entity.SlotAvailability;
import com.nova.dataservice.entity.service.SlotAvalabulityService;

@RestController
public class SlotAvailibilityController {
	
	@Autowired
	SlotAvalabulityService avalabulityService;
	
	
	public ResponseEntity<Object>  saveSlotAvalabulity(@RequestBody SlotAvailability availability) {
//		avalabulityService.saveSlotAvalabulity(availability);
		
		SlotAvailability  data = avalabulityService.saveSlotAvalabulity(availability);
		return new ResponseEntity<>("sucess", HttpStatus.OK);
	}
 
}
