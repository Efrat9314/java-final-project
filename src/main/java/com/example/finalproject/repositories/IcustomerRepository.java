package com.example.finalproject.repositories;

import com.example.finalproject.entities.Category;
import com.example.finalproject.entities.Coupon;
import com.example.finalproject.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;

public interface IcustomerRepository extends JpaRepository<Customer,Integer> {
    @Query("select customer.coupons from Customer customer where customer.id=?1")
    ArrayList<Coupon> findCustomerCoupons(int customerId);
}
