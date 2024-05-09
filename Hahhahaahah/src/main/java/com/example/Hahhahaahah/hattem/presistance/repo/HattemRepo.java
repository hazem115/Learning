package com.example.Hahhahaahah.hattem.presistance.repo;

import com.example.Hahhahaahah.hattem.presistance.entity.Hattem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HattemRepo extends JpaRepository<Hattem , Long> {

    Hattem findByRefNo(String refNo);
}
