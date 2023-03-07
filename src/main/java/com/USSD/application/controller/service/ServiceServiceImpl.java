package com.USSD.application.controller.service;

//import com.USSD.application.controller.entity.Service;
import com.USSD.application.controller.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.xml.ws.Service;
import java.util.List;

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
