package com.springdatajpa.springboot.service;

import com.springdatajpa.springboot.entity.Address;
import com.springdatajpa.springboot.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AddressService {

    List<Address> findAllAddresses();

    Address findAddressById(Long id);
}
