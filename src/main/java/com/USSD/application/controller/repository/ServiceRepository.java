package com.USSD.application.controller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.xml.ws.Service;

public interface ServiceRepository extends JpaRepository<Service, Long> {
}
