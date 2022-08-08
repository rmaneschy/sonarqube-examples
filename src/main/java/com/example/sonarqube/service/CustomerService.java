package com.example.sonarqube.service;

import com.example.sonarqube.model.Customer;

public interface CustomerService {

    Iterable<Customer> findAll();
}
