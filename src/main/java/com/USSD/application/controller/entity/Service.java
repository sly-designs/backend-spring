package com.USSD.application.controller.entity;

import jakarta.persistence.Entity;
@Table(name = "services")
@Entity
public class Service {



    private Long id;

    private String name;
    private String description;

    public Service() {

    }
}
