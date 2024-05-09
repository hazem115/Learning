package com.example.Hahhahaahah.hattem.presistance.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.UUID;

@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Hattem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String refNo = UUID.randomUUID().toString();
    private String name;
    private String email;
    private String phone;
    private String address;
    private String city;

}
