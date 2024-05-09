package com.example.talabat2.userorders.presistance.entity;

import com.example.talabat2.restaurant.presistance.entity.Restaurant;
import com.example.talabat2.user.presistance.entity.User;
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
public class UserOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String refNo = UUID.randomUUID().toString();
    private String userName;
    private String restaurantName;
    private String orderDate;
    private String orderPrice;
    private String orderDiscount;
    private String orderTotal;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;

}
