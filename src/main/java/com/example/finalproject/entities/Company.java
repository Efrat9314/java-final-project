package com.example.finalproject.entities;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Company {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @OneToMany
    private List<Coupon> coupons;
    @Embedded
    private Creditional creditional;

    public Company() {
    }

    public int getId() {
        return id;
    }

    public Company(String name, List<Coupon> coupons, Creditional creditional) {
        this.name = name;
        this.coupons = coupons;
        this.creditional = creditional;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Coupon> getCoupons() {
        return coupons;
    }

    public void setCoupons(List<Coupon> coupons) {
        this.coupons = coupons;
    }

    public Creditional getCreditional() {
        return creditional;
    }

    public void setCreditional(Creditional creditional) {
        this.creditional = creditional;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", coupons=" + coupons +
                ", creditional=" + creditional +
                '}';
    }
}
