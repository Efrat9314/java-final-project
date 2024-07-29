package com.example.finalproject.repositories;

import com.example.finalproject.entities.Category;
import com.example.finalproject.entities.Coupon;
import com.example.finalproject.entities.Creditional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface IcouponRepository extends JpaRepository<Coupon,Integer> {
    ArrayList<Coupon> findCouponsByCompany_Id(int companyId);
    ArrayList<Coupon> findCouponsByCompany_IdAndCategory(int companyId, Category category);
    ArrayList<Coupon> findCouponsByCompany_IdAndPrice(int companyId,double maxPrice);
    void deleteCouponByCompany_IdAndId(int companyId,int couponId);
}
