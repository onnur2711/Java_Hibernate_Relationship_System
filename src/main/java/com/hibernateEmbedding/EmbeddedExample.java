package com.hibernateEmbedding;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbeddedExample {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Course c1 = new Course();
		c1.setcId(1);
		c1.setcName("java");
		c1.setcFee(30000);
		
		Course c2 = new Course();
		c2.setcId(2);
		c2.setcName("Python");
		c2.setcFee(30000);
		
		Student s1 = new Student();
		s1.setsName("Onnurbee");
		s1.setsContact(9652890664L);
		s1.setC(c1);
		
		
		Student s2 = new Student();
		s2.setsName("Sameera");
		s2.setsContact(7893800854L);
		s2.setC(c1);
		
		
		
		Transaction transaction = session.beginTransaction();
		
		session.save(s1);
		session.save(s2);
		transaction.commit();
		
		session.close();
		sessionFactory.close();
	}

}