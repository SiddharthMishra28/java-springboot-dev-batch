package com.springdatajpa.springboot.controller;

import com.springdatajpa.springboot.entity.Address;
import com.springdatajpa.springboot.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/{id}")
    public ResponseEntity<Address> getUser(@PathVariable Long id){
        return new ResponseEntity<Address>(addressService.findAddressById(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Address>> getAllUsers(){
        return new ResponseEntity<>(addressService.findAllAddresses(), HttpStatus.OK);
    }
}
