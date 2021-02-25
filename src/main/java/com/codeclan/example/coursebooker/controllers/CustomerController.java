package com.codeclan.example.coursebooker.controllers;

import com.codeclan.example.coursebooker.models.Customer;
import com.codeclan.example.coursebooker.repositories.BookingRepository;
import com.codeclan.example.coursebooker.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/customers")
    public ResponseEntity<List<Customer>> getAllCustomers(
            @RequestParam(name = "course_id", required = false) Long id,
            @RequestParam(name = "town", required = false) String town)

    { if (id != null) {
        return  new ResponseEntity<>(customerRepository.findCustomerByBookingsCourseId(id), HttpStatus.OK);
    } else if (town != null) {
        return new ResponseEntity<>(customerRepository.findCustomerByTownIgnoreCase(town), HttpStatus.OK);
    }
        return new ResponseEntity<>(customerRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/customers/{id}")
    public ResponseEntity getCustomer(@PathVariable Long id){
        return new ResponseEntity(customerRepository.findById(id), HttpStatus.OK);
    }


}
