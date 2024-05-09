package com.example.giftcard.client.presistance.repo;

import com.example.giftcard.client.presistance.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepo extends JpaRepository<Client, Long> {
}
