package com.example.finalproject;

import com.example.finalproject.entities.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Transactional
@Component
public class Test implements CommandLineRunner {
    @PersistenceContext
    EntityManager entityManager;
    Creditional creditional1 =new Creditional("comp","1245");
    Company company1=new Company("comp1",null,creditional1);
    Coupon coupon1=new Coupon(company1,Category.Vacation,"title1","desc1",LocalDate.now(),LocalDate.now(),10,850.2,"src/pic1");
    Customer customer1=new Customer("shira","levi",new Creditional("shira69@gmail.com","1234"), null);


    Company company=new Company("metrix", null,new Creditional("shira69@gmail.com","1345"));

    @Override
    public void run(String... args) throws Exception {

        System.out.println("begining!");
        entityManager.persist(coupon1);
        entityManager.persist(company);
        entityManager.persist(customer1);
        System.out.println("finish!");
    }
}
