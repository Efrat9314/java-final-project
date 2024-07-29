package com.example.finalproject;

import com.example.finalproject.entities.Creditional;
import com.example.finalproject.entities.Customer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Transactional
class FinalProjectApplicationTests {
    @PersistenceContext
    private EntityManager entityManager;

    @Test
    void contextLoads() {
        System.out.println("begining!");
        Customer c1=new Customer("efrat","yanay",new Creditional("efrat9314","1234"),null);
        entityManager.persist(c1);
        System.out.println("finish!");
    }

}
