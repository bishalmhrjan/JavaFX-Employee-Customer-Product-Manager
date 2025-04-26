package com.example.diyashop.model;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

         public static void main(String[] args) {
            // Load Hibernate configuration and create SessionFactory
            SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

            // Open a session
            Session session = factory.openSession();

            // Start a transaction
            session.beginTransaction();

            // Your entity operations here (for example, save or load an entity)
            // session.save(yourEntity);

            // Commit the transaction
            session.getTransaction().commit();

            // Close the session
            session.close();

            // Close the SessionFactory
            factory.close();

            System.out.println("Hibernate setup is working correctly.");
        }
    }


