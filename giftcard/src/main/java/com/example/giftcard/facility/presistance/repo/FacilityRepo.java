package com.example.giftcard.facility.presistance.repo;

import com.example.giftcard.facility.presistance.entity.Facility;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacilityRepo extends JpaRepository<Facility, Long> {
}
