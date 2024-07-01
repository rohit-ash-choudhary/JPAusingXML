package com.sp.main.JPAusingXML;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.sp.entity.Account;

public class App {

    public static void main(String[] args) {

        // Create a new Account instance
        Account acc = new Account();
        acc.setAccount_num(144); // Ensure to use Long values
        acc.setFirst_name("Rohit");
        acc.setLast_name("Choudhary");
        acc.setAccount_balance(100000L); // Ensure to use Long values
        acc.setCity("New York");

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("main-persistence");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        
        try
        {
        	entityTransaction.begin();
        	
        	entityManager.persist(acc);
        	
        	entityTransaction.commit();
        	
        	System.out.println("success");
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        	
        	entityTransaction.rollback();
        	System.out.println("fail");
        }
        finally
        {
        	entityManager.close();
        	entityManagerFactory.close();
        }
    }
}
