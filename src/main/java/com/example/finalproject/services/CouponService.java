package com.example.finalproject.services;

import com.example.finalproject.entities.Coupon;
import com.example.finalproject.repositories.IcouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CouponService  {
    @Autowired
    private IcouponRepository couponRepository;
    public List<Coupon> getAllCoupons(){
        return couponRepository.findAll();
    }
    public Coupon getCouponById(int id){
        return couponRepository.findById(id).get();
    }
    public Coupon addCoupon(Coupon coupon){
        return couponRepository.save(coupon);
    }
    public void deleteCoupon(int id){
        couponRepository.deleteById(id);
    }
//    public Coupon updateCoupon(Coupon coupon){
//
//    }

}
