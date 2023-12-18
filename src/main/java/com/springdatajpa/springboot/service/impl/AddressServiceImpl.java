package com.springdatajpa.springboot.service.impl;

import com.springdatajpa.springboot.entity.Address;
import com.springdatajpa.springboot.repository.AddressRepository;
import com.springdatajpa.springboot.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public List<Address> findAllAddresses() {
        return addressRepository.findAll();
    }

    @Override
    public Address findAddressById(Long Id) {
       Optional<Address> address = addressRepository.findById(Id);
        return address.orElse(null);
    }
}
