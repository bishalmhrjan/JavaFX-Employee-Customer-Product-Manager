package com.example.diyashop.model.backend.manager;

import com.example.diyashop.model.backend.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.Serializable;
import java.util.List;

public class GenericManager<T, ID extends Serializable> {
    private Class<T> entityType;

    public  GenericManager(Class<T> entityType){
        this.entityType = entityType;
    }

    public void save(T entity) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            System.out.println("is session open " + session.isOpen());
            System.out.println("entity is " + entity);

            session.save(entity);
            session.flush();

            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null && transaction.isActive()) {
                try {
                    transaction.rollback();
                    System.out.println("Transaction rolled back successfully");
                } catch (RuntimeException rollbackEx) {
                    System.out.println("Could not rollback transaction: " + rollbackEx.getMessage());
                    rollbackEx.printStackTrace();
                }
            }
            ex.printStackTrace();
        }
    }


    public T getById(ID id){
        Transaction transaction = null;
        T entity = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            transaction = session.beginTransaction();
            entity = session.get(entityType,id);
            transaction.commit();
        }  catch (Exception ex){
            rollback(transaction);
            ex.printStackTrace();
        }
        return entity;
    }

    private void rollback(Transaction transaction){
        if(transaction != null && transaction.isActive()){
            try{
                System.out.println("transaction is   active");

                transaction.rollback();
                System.out.println("Transaction rolled back successfully");

            } catch (RuntimeException ex){
                System.out.println("could not rollback \n"+ex.getMessage());
                ex.printStackTrace();
            }
        }else{
            System.out.println("transaction is not active");
        }
    }

    public void  delete(ID id){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            transaction =session.beginTransaction();
            T entity = session.get(entityType,id);
            if(entity != null){
                session.delete(entity);
                System.out.println("Entity is deleted");
            }
            transaction.commit();
        } catch(Exception ex){
            rollback(transaction);
            ex.printStackTrace();
        }

    }


    public List<T> getAll() {
        Transaction transaction = null;
        List<T> entities = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            transaction = session.beginTransaction();
            entities =session.createQuery("from"+entityType.getName()).list();
            transaction.commit();
        } catch (Exception ex){
            rollback(transaction);
            ex.printStackTrace();}


        return entities;
    }

}