package com.example.GasStation.transactions.presistance.entity;

import com.example.GasStation.customer.presistance.entity.Customer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String refNo = UUID.randomUUID().toString();
    private Long empId;
    private Long pumpId;
    private String fuelType;
    private Double totalCost;
    private String paymentMethod;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

}
