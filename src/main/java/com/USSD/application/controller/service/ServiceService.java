package com.USSD.application.controller.service;

public interface ServiceService {
    Service getServiceById(Long id);

    List<Service> getAllServices();
}
