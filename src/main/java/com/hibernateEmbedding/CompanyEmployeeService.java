package com.hibernateEmbedding;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CompanyEmployeeService {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		 Company c1 = new Company();
		 c1.setCName("INFOSYS");
		 
		 
		 Company c2 = new Company();
		 c2.setCName("TATA");
		 
		  Employee e1 = new Employee();
		  e1.setEName("Onnurbee");
		  e1.setESal(500000);
		  e1.setELoc("HyB");
		  
		  Employee e2 = new Employee();
		  e2.setEName("Pravallika");
		  e2.setESal(350000);
		  e2.setELoc("Banglore");
		  
		  Employee e3 = new Employee();
		  e3.setEName("Sameera");
		  e3.setESal(600000);
		  e3.setELoc("Banglore");
		  
		  Employee e4 = new Employee();
		  e4.setEName("Charan");
		  e4.setESal(500000);
		  e4.setELoc("HyB");
		  
		  List<Employee> infoList = new ArrayList<Employee>();
		  infoList.add(e3);
		  infoList.add(e2);
		  
		  List<Employee> tataList = new ArrayList<Employee>();
		  tataList.add(e1);
		  tataList.add(e4);
		  
		  
		  
		  
		  c1.setEmp(infoList);
		  c2.setEmp(tataList);
		  
		  e1.setCmp(c2);
		  e2.setCmp(c1);
		  e3.setCmp(c2);
		  e4.setCmp(c1);
		  
		  
		  session.save(c1);
		  session.save(c2);
		  session.save(e1);
		  session.save(e2);
		  session.save(e3);
		  session.save(e4);
		  
		
		Transaction transaction = session.beginTransaction();
		transaction.commit();
		session.close();
		sessionFactory.close();
	}

}
