package com.example.finalproject.controllers;

import com.example.finalproject.entities.Customer;
import com.example.finalproject.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping
    private List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }
    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable int id){
        return customerService.getCustomerById(id);
    }
    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer){
        return customerService.addCustomer(customer);
    }
    @DeleteMapping("/{id}")
    public void deleteCustomer(int id){
        customerService.deleteCustomer(id);
    }

}
