# 📦 JavaFX Desktop Application – Customer, Product & Employee Management
A robust desktop application built using Client-Server architecture with MVC pattern, implementing an e-commerce shop service with Hibernate backend and JavaFX frontend. This project demonstrates expertise in database management, Hibernate, algorithms, security, and clean code practices.
---

## 🚀 Features

✅Client-Server architecture with MVC pattern

✅ Role-based access control (Admin/Employee)

✅ Comprehensive CRUD operations for all entities

✅ Secure authentication system





## 🛠️ Technologies Used

Technologies
Java 17+

JavaFX (with CSS styling)

Hibernate ORM

MySQL Database

Maven (Dependency Management)
---

## 📦 Installation & Setup

1. **Clone the repository:**
   ```bash
    git clone https://github.com/bishalmhrjan/JavaFX-Employee-Customer-Product-Manager.git
    cd  bookonlineshop

2. **Configure persistence.xml:**


    Persistence File Details:

 

     <persistence-unit name="DiyaShop"  >
        <provider>org.hibernate.jpa.HibernatePersistenceProvider</provider>

        <class>com.example.diyashop.model.entity.Product</class>
        <class>com.example.diyashop.model.entity.Admin</class>
        <class>com.example.diyashop.model.entity.Employee</class>
        <class>com.example.diyashop.model.entity.Worker</class>
         <!-- Add more entity classes as needed -->

         <properties>
            <!-- SQLite DB config -->
            <property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/diyadesktop" />
            <property name="jakarta.persistence.jdbc.user" value="root"/>
            <property name="jakarta.persistence.jdbc.password" value="admin"/>
            <property name="javax.persistence.jdbc.driver" value="com.mysql.cj.jdbc.Driver" />

            <!-- Hibernate properties -->
            <property name="hibernate.dialect" value="org.hibernate.dialect.MySQL8Dialect" />
            <property name="hibernate.show_sql" value="true" />
            <property name="hibernate.format_sql" value="true" />
            <property name="hibernate.hbm2ddl.auto" value="update" />
        </properties>
    </persistence-unit>

   </persistence>


🧱  Domain Model
The system implements a hierarchical entity structure:

Worker (Base class)

Employee (Can manage products)

Admin (Full system access - products, employees, customers)

This design enables:

Clean role separation

Polymorphic behavior

Centralized access control

This design allows clean role separation and clear Employee and Admin.

Security Implementation
Role-based access control via Hibernate

Privilege differentiation:

Employees: Product management only

Admins: Full system control

🏗️ Backend Architecture
DAO pattern implementation with Hibernate

Advantages over JDBC:

Reduced boilerplate code

Improved maintainability

Object-relational mapping benefits

Complete CRUD operations for all entities


