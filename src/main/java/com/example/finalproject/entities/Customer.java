package com.example.finalproject.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue
    private int id;
    private String firstName;
    private String lastName;
    @Embedded
    private Creditional creditional;
    @OneToMany
    private List<Coupon> coupons;

    public Customer() {
    }

    public Customer(String firstName, String lastName, Creditional creditional, List<Coupon> coupons) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.coupons = coupons;
        this.creditional = creditional;
    }

    public int getId() {
        return id;
    }

      public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", creditional=" + creditional +
                ", coupons=" + coupons +
                '}';
    }
}
