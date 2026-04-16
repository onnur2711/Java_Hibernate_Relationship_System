# Java_Hibernate_Relationship_System

## Project Overview

This project is a Java-based backend application built using Hibernate ORM to demonstrate real-world entity relationships and database operations.

It models an Employee Management System where employees are associated with companies, projects, and personal details like passports using different types of relationships.

---

##  Features

1. One-to-One Relationship

  * Employee ↔ Passport

2. One-to-Many Relationship

  * Company → Employees

3. Many-to-Many Relationship

  * Employee ↔ Projects

-> Embedded Objects

  * Address details inside entities

-> CRUD Operations

  * Create, Read, Update, Delete using Hibernate

## Tech Stack

* Java (JDK 8)
* Hibernate ORM
* MySQL (or any relational DB)
* Maven
* Eclipse IDE

##  Project Structure

* `entity` classes → Employee, Company, Project, Passport, etc.
* `service` classes → Business logic for handling relationships
* `hibernate.cfg.xml` → Hibernate configuration
* `App.java` → Main class to run the application

---

##  Configuration

Update your database configuration in:

hibernate.cfg.xml

Example:
<property name="hibernate.connection.url">jdbc:mysql://localhost:3306/your_db</property>
<property name="hibernate.connection.username">root</property>
<property name="hibernate.connection.password">your_password</property>


##  How to Run

1. Clone the repository:
2. 
git clone https://github.com/your-username/your-repo-name.git

2. Open in Eclipse or any IDE

3. Configure database in `hibernate.cfg.xml`

4. Run:
5. App.java

##  Sample Functionality

* Add Employees and assign them to a Company
* Link Employees with multiple Projects
* Assign Passport details to Employees
* Store embedded Address information

##  Learning Outcomes

* Understanding Hibernate ORM
* Implementing entity relationships
* Managing database operations using Java
* Structuring a backend project

##  Author

Your Name
GitHub: https://github.com/onnur2711
LinkedIn: linkedin.com/in/onnurbee-dudekula

## ⭐ If you like this project

Give it a star ⭐ on GitHub!
