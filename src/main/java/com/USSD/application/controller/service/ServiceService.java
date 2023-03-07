package com.USSD.application.controller.service;

import javax.xml.ws.Service;
import java.util.List;

public interface ServiceService {
    Service getServiceById(Long id);

    List<Service> getAllServices();
}
