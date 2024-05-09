package com.example.giftcard.giftcard.presistance.entity;

import com.example.giftcard.client.presistance.entity.Client;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GiftCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String refNo = UUID.randomUUID().toString();
    private double price;
    private int qty;
    private String clientPhone;
    private String clientName;
    public boolean forMe = false;
    private String giftSerial = RandomStringUtils.random(8, true, true);

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "user_id")
    private Client user;

}
