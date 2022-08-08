package com.example.sonarqube.service.impl;

import com.example.sonarqube.repository.CustomerRepository;
import com.example.sonarqube.model.Customer;
import com.example.sonarqube.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository dao;

    @Override
    public Iterable<Customer> findAll() {
        return dao.findAll();
    }
}
