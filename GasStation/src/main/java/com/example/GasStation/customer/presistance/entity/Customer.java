package com.example.GasStation.customer.presistance.entity;

import com.example.GasStation.transactions.presistance.entity.Transaction;
import jakarta.persistence.*;
import lombok.*;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String refNo = UUID.randomUUID().toString();
    private String name;
    private String address;
    private String phone;

    @OneToMany(mappedBy = "customer", orphanRemoval = true)
    private Set<Transaction> transactions = new LinkedHashSet<>();

}
