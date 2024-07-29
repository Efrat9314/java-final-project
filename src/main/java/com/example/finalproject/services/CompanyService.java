package com.example.finalproject.services;

import com.example.finalproject.entities.Category;
import com.example.finalproject.entities.Company;
import com.example.finalproject.entities.Coupon;
import com.example.finalproject.repositories.IcompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyService extends ClientService{

    public CompanyService() {
    }

    public Company getCompanyDetails(int id){
       return companyRepository.findById(id).get();
    }

    public void addCoupon(int companyId,Coupon coupon){
        Company company = companyRepository.findById(companyId).get();
        company.getCoupons().add(coupon);
      }
    public void deleteCoupon(int companyId,int couponId){
        couponRepository.deleteCouponByCompany_IdAndId(companyId,couponId);
    }
    public ArrayList<Coupon> getCompanyCoupns(int companyId){
        return couponRepository.findCouponsByCompany_Id(companyId);
    }
    public ArrayList<Coupon> getCompanyCoupns(int companyId,Category category){
        return couponRepository.findCouponsByCompany_IdAndCategory(companyId,category);
    }


}
