package com.example.finalproject.services;

import com.example.finalproject.entities.Company;
import com.example.finalproject.entities.Customer;

import java.util.List;

public class AdminService extends ClientService{

    public AdminService() {
    }
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
