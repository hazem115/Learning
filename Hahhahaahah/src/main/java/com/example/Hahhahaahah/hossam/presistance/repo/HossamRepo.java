package com.example.Hahhahaahah.hossam.presistance.repo;

import com.example.Hahhahaahah.hossam.presistance.entity.Hossam;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HossamRepo extends JpaRepository<Hossam, Long> {

    Hossam getByRefNo(String refNo);
}
