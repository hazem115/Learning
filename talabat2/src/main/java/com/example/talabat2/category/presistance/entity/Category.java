package com.example.talabat2.category.presistance.entity;

import com.example.talabat2.restaurant.presistance.entity.Restaurant;
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
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String refNo = UUID.randomUUID().toString();
    private String categoryName;


    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;

}
