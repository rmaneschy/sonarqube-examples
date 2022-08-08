package com.example.sonarqube;

import com.example.sonarqube.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SonarqubeApplicationTests {

    @Autowired CustomerService service;

    @Test
    void contextLoads() {
        assertNotNull(service);
    }

}
