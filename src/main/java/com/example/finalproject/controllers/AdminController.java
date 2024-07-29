package com.example.finalproject.controllers;

import com.example.finalproject.entities.Company;
import com.example.finalproject.entities.Customer;
import com.example.finalproject.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin")

public class AdminController {
@Autowired
AdminService adminService;
public void addCompany(Company company){
    companyRepository.save(company);
}
    public Company updateCompany(Company company){
        return companyRepository.save(company);
    }
    public void deleteCompany(int compayId){
        companyRepository.deleteById(compayId);
    }
    public List<Company> getAllCompanies(){
        return companyRepository.findAll();
    }
    public Company getCompany(int companyId){
        return companyRepository.findById(companyId).get();
    }
    public void addCustomer(Customer customer){
        customerRepository.save(customer);
    }
    public void updateCustomer(Customer customer){
        customerRepository.save(customer);
    }
    public void deleteCustomer(int customerId){
        customerRepository.deleteById(customerId);
    }
    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }
    public Company getCustomer(int companyId){
        return companyRepository.findById(companyId).get();
    }
}
