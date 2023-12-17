package com.learningspringboot.services;

import com.learningspringboot.domain.Customer;
import com.learningspringboot.dtos.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {

    CustomerDto getCustomer(String Id);
    List<CustomerDto> getAllCustomers();

    Customer createCustomer(Customer customer);
    Customer updateCustomer(Customer customer, String id);
    boolean deleteCustomer(String id);
}
