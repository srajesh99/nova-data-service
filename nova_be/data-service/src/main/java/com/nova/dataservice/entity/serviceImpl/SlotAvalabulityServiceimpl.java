package com.nova.dataservice.entity.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nova.dataservice.entity.SlotAvailability;
import com.nova.dataservice.entity.repository.SlotAvalabulityRepository;
import com.nova.dataservice.entity.service.SlotAvalabulityService;

@Service
public class SlotAvalabulityServiceimpl implements SlotAvalabulityService{

	@Autowired
	SlotAvalabulityRepository avalabulityRepository;
	
	@Override
	public SlotAvailability saveSlotAvalabulity(SlotAvailability availability) {
		// TODO Auto-generated method stub
		return avalabulityRepository.save(availability);
	}

}
