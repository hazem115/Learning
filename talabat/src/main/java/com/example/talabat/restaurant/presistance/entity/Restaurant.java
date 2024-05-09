package com.example.talabat.restaurant.presistance.entity;

import com.example.talabat.category.presistance.entity.Category;
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
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String refNo = UUID.randomUUID().toString();
    private String restaurantName;
    private String address;
    private float rating;

    @ManyToOne(cascade = CascadeType.MERGE, optional = false)
    private Category category;
}
