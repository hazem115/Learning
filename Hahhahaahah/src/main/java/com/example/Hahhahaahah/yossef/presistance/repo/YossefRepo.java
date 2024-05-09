package com.example.Hahhahaahah.yossef.presistance.repo;

import com.example.Hahhahaahah.yossef.presistance.entity.Yossef;
import org.springframework.data.jpa.repository.JpaRepository;

public interface YossefRepo extends JpaRepository<Yossef, Long> {
    Yossef getByRefNo(String refNo);
}
