package com.learningspringboot.services.impl;

import com.learningspringboot.domain.Address;
import com.learningspringboot.domain.Customer;
import com.learningspringboot.dtos.CustomerDto;
import com.learningspringboot.services.CustomerService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    private List<Customer> customers = new ArrayList<>();

    public CustomerServiceImpl(){
        customers.add(new Customer(UUID.randomUUID().toString().substring(0, 10), "sid", "mishra", "sid@test.com", "0987654321", new Date(1990, 9, 28), new Address(12, "Princeton road", "near orbis school", "Delhi", "Delhi", "India", "763214")));
        customers.add(new Customer(UUID.randomUUID().toString().substring(0, 10), "alex", "arson", "alex@test.com", "1234567890", new Date(1989, 9, 23), new Address(5, "Solar Street", "Llama library", "Brisbane", "Queensland", "Australia", "4BA657")));
        customers.add(new Customer(UUID.randomUUID().toString().substring(0, 10), "bahruz", "karmili", "baha@test.com", "1029384756", new Date(1965, 3, 27), new Address()));
    }
    @Override
    public CustomerDto getCustomer(String Id) {
        Customer c = customers.stream().filter(customer -> customer.getId().equals(Id)).findFirst().get();
        CustomerDto dto = null;
        if (c.getId() != null) {
            dto = new CustomerDto();
            dto.setId(c.getId());
            dto.setEmail(c.getEmail());
            dto.setFirstName(c.getFirstName());
            dto.setLastName(c.getLastName());
            dto.setDob(c.getDob());
        }
        return dto;
    }

    @Override
    public List<CustomerDto> getAllCustomers() {
        List<CustomerDto> customerDtos = new ArrayList<>();
        customerDtos = customers.stream().map(c -> {
            CustomerDto dto = new CustomerDto();
            dto.setId(c.getId());
            dto.setEmail(c.getEmail());
            dto.setFirstName(c.getFirstName());
            dto.setLastName(c.getLastName());
            dto.setDob(c.getDob());
            return dto;
        }).toList();
        return customerDtos;
    }

    @Override
    public Customer createCustomer(Customer customer) {
        customers.add(customer);
        return customer;
    }

    @Override
    public Customer updateCustomer(Customer customer, String id) {
        Customer cus = customers.stream().filter(c -> c.getId().equals(id)).findFirst().get();
        if(cus.getId()!=null){
           int index = customers.indexOf(cus);
           cus.setFirstName(customer.getFirstName());
           cus.setLastName(customer.getLastName());
           cus.setEmail(customer.getEmail());
           cus.setPhoneNumber(customer.getPhoneNumber());
           cus.setDob(customer.getDob());
           cus.setAddress(customer.getAddress());
           customers.set(index, cus);
        }
        return cus;
    }

    @Override
    public boolean deleteCustomer(String id) {
        Customer cus = customers.stream().filter(c -> c.getId().equals(id)).findFirst().get();
        if(cus.getId()!=null){
            int index = customers.indexOf(cus);
            customers.remove(cus);
            return true;
        }
        return false;
    }
}
