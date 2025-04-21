package com.example.diyashop.model.backend;

 import com.example.diyashop.model.entity.Customer;
 import com.example.diyashop.model.entity.Product;
 import com.example.diyashop.model.entity.Worker;
import org.hibernate.SessionFactory;
 import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class HibernateUtil {
    private static  final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            Configuration configuration = new Configuration();
            //configuration.addAnnotatedClass(com.example.diyashop.model.entity.Product.class);

            configuration.addAnnotatedClass(Customer.class)
                            .addAnnotatedClass(CustomerFilialeTable.class)
                                    .addAnnotatedClass(FilialeShop.class)
                                            .addAnnotatedClass(Product.class)
                                                    .addAnnotatedClass(ProductInTracker.class)
                                                            .addAnnotatedClass(Reciept.class)
                                                                    .addAnnotatedClass(RecieptItem.class)
                                                                            .addAnnotatedClass(Worker.class) ;



            configuration.configure("/hibernate.cfg.xml");

            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();
            SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            // Check if the Customer entity is registered
            if (sessionFactory.getMetamodel().getEntities().stream()
                    .anyMatch(e -> e.getName().equals("Customer"))) {
                System.out.println("Customer entity is correctly mapped.");
            } else {
                System.out.println("Customer entity is NOT mapped.");
            }

            return sessionFactory;
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed: " + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
  }

  public static  void shutDown(){
        getSessionFactory().close();
  }
}
