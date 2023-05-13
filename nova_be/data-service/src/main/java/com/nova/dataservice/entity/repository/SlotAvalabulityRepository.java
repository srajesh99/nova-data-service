package com.nova.dataservice.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nova.dataservice.entity.SlotAvailability;

@Repository
public interface SlotAvalabulityRepository extends JpaRepository<SlotAvailability, Long>{

}
