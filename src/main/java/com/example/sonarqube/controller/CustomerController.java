package com.example.sonarqube.controller;

import com.example.sonarqube.model.Customer;
import com.example.sonarqube.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(produces= { MediaType.APPLICATION_JSON_VALUE })
    public Iterable<Customer> getAllCustomers() {
        return service.findAll();
    }
}
