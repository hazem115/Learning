package com.example.Hahhahaahah.hazem.presistance.repo;

import com.example.Hahhahaahah.hazem.presistance.entity.Hazem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HazemRepo extends JpaRepository<Hazem, Long> {

    Hazem getByRefNo(String refNo);
    Hazem getByName(String name);
    Hazem getByEmail(String email);
    Hazem getByPhone(String phone);
    Hazem getByIdAndName(Long id, String name);
}
