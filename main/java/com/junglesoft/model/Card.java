package com.junglesoft.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
@Entity(name = "tb_card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String number;
    @Column(name="available_limit", scale = 13, precision = 2)
    private BigDecimal limit;
}
