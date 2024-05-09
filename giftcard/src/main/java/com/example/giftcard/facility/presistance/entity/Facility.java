package com.example.giftcard.facility.presistance.entity;

import com.example.giftcard.client.presistance.entity.Client;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Facility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String refNo = UUID.randomUUID().toString();
    private String name;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "client_id")
    private Client client;

}
