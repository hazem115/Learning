package com.example.giftcard.giftcard.presistance.repo;

import com.example.giftcard.giftcard.presistance.entity.GiftCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GiftCardRepo extends JpaRepository<GiftCard, Long> {
}
