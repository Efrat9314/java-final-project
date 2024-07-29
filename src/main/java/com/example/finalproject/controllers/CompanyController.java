package com.example.finalproject.controllers;

import com.example.finalproject.entities.Category;
import com.example.finalproject.entities.Company;
import com.example.finalproject.entities.Coupon;
import com.example.finalproject.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/companies")
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @GetMapping("/{id}")
    public Company getCompanyDetails(@PathVariable int id) {
        return companyService.getCompanyDetails(id);
    }
    @PostMapping("/{id}/coupons")
    public void addCoupon(@PathVariable int customerId,@RequestBody Coupon coupon) {
         companyService.addCoupon(customerId,coupon);
    }
    @DeleteMapping("/{id1}/coupon/{id2}")
    public void deleteCoupon(@PathVariable int companyId,@PathVariable int couponId){
        companyService.deleteCoupon(companyId,couponId);
    }
    @GetMapping("/getcompanycoupns/{id}")
    public ArrayList<Coupon> getCompanyCoupns(@PathVariable int companyId){
        System.out.println("controller here");
        return companyService.getCompanyCoupns(companyId);
    }
    @GetMapping("/getCouponsByCategory/{id}")
    public ArrayList<Coupon> getCompanyCoupns(@PathVariable int companyId, @RequestBody Category category){
        return companyService.getCompanyCoupns(companyId,category);
    }
}
