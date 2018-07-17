package com.mackittipat.macmemoryleak.controller;

import com.mackittipat.macmemoryleak.domain.Customer;
import com.mackittipat.macmemoryleak.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class CustomerController {

    private static final Logger log = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    private CustomerRepository customerRepository;

    @RequestMapping("/customers")
    public List<Customer> findCustomers(@RequestParam List<Integer> idList) {
        return customerRepository.findByIdIn(idList);
    }

}
