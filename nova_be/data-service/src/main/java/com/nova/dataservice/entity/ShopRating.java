package com.nova.dataservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "shop_rating")
public class ShopRating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "consumer_id")
    private UserDetails consumer;

    @ManyToOne
    @JoinColumn(name = "shop_id")
    private ShopDetails shop;

    private int rating;

    private String comment;
    // Add other fields and getters/setters
}

