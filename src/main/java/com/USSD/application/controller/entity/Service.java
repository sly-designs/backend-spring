package com.USSD.application.controller.entity;

import jakarta.persistence.*;

@Table(name = "services")
@Entity
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String description;

    public Service() {

    }
}
