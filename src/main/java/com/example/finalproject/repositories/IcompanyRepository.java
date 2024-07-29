package com.example.finalproject.repositories;

import com.example.finalproject.entities.Company;
import com.example.finalproject.entities.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface IcompanyRepository extends JpaRepository<Company,Integer> {
}

