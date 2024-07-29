package com.example.finalproject.services;

import com.example.finalproject.repositories.IcompanyRepository;
import com.example.finalproject.repositories.IcouponRepository;
import com.example.finalproject.repositories.IcustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract class ClientService {
    @Autowired
    protected IcustomerRepository customerRepository;
    @Autowired
    protected IcompanyRepository companyRepository;
    @Autowired
    protected IcouponRepository couponRepository;


}
