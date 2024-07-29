package com.example.finalproject.services;

import com.example.finalproject.entities.Coupon;
import com.example.finalproject.entities.Customer;
import com.example.finalproject.repositories.IcustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService extends ClientService {
    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }
    public Customer getCustomerById(int id){
        return customerRepository.findById(id).get();
    }
    public Customer addCustomer(Customer customer){
        return customerRepository.save(customer);
    }
    public void deleteCustomer(int id){
        customerRepository.deleteById(id);
    }

    public ArrayList<Coupon> getCustomerCoupns(int customerId){
        return customerRepository.findCustomerCoupons(customerId);
    }

}
