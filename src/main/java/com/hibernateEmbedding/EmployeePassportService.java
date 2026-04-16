package com.hibernateEmbedding;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeePassportService {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Citizen c1=new Citizen();
		c1.setName("Onnur");
		c1.setContact(96529064L);
		
		Citizen c2 = new Citizen();
		c2.setName("pravalli");
		c2.setContact(9494608804L);
 
		
		Passport p1 = new Passport();
		p1.setPNo("abcd1234efgh");
		
		Passport p2 = new Passport();
		p2.setPNo("efgh8907efdg");
		
		
		c1.setPassport(p2);
		c2.setPassport(p1);
		
		p1.setCitizen(c2);
		p1.setCitizen(c1);
		
		session.save(c1);
		session.save(c2);
		session.save(p1);
		session.save(p2);
		
		Transaction transaction = session.beginTransaction();
		transaction.commit();
		
		session.close();
		sessionFactory.close();
		
		
		
	}

}