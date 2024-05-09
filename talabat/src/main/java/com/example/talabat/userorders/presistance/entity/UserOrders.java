package com.example.talabat.userorders.presistance.entity;

import com.example.talabat.user.presistance.entity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserOrders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String refNo = UUID.randomUUID().toString();
    private String restaurantName;
    private String orderDate;
    private String orderDesc;
    private double orderPrice;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "user_id")
    private User user;
    
}
