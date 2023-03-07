package com.USSD.application.controller.service;

import org.springframework.beans.factory.annotation.Autowired;

public class ServiceServiceImpl implements ServiceService{
    @Autowired
    private ServiceRepository serviceRepository;

    @Override
    public Service getServiceById(Long id) {
        return serviceRepository.findById(id).orElse(null);
    }

    @Override
    public List<Service> getAllServices() {
        return serviceRepository.findAll();
    }
}
