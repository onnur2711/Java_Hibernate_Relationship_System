package com.hibernateEmbedding;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeProjectService {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		 
		Developer d1 = new Developer();
		d1.setDId(1);
		d1.setDName("Onnurbee");
		
		Developer d2 = new Developer();
		d2.setDId(2);
		d2.setDName("Pravallika");
		
		Developer d3 = new Developer();
		d3.setDId(3);
		d3.setDName("Charan");
		
		Developer d4 = new Developer();
		d4.setDId(4);
		d4.setDName("Sameera");
		
		
		 Project p1 = new Project();
		 p1.setPId(11);
		 p1.setPName("ECOMMERCE");
		 
		 Project p2 = new Project();
		 p2.setPId(22);
		 p2.setPName("BANK");
		 
		 Project p3 = new Project();
		 p3.setPId(33);
		 p3.setPName("web");
		 
		 Project p4 = new Project();
		 p4.setPId(44);
		 p4.setPName("Library");
		 
		 Project p5 = new Project();
		 p5.setPId(55);
		 p5.setPName("MOBILE");
		 
		 
		 List<Project> d1List = new ArrayList<Project>();
		 d1List.add(p2);
		 d1List.add(p4);
		 d1List.add(p5);
		 
		 
		 List<Project> d2List = new ArrayList<Project>();
		 d2List.add(p1);
		 d2List.add(p2);
		 d2List.add(p3);
		 
		 List<Project> d3List = new ArrayList<Project>();
		 d3List.add(p1);
		 d3List.add(p3);
		 d3List.add(p4);
		 
		 List<Project> d4List = new ArrayList<Project>();
		 d4List.add(p4);
		 d4List.add(p5);
		 
		 List<Developer> p1List = new ArrayList<Developer>();
		 p1List.add(d2);
		 p1List.add(d3);
		 
		 
		 List<Developer> p2List = new ArrayList<Developer>();
		 p2List.add(d1);
		 p2List.add(d2);
		 
		 //p3 list same as p1 so not required to list it agian already a list is there
		 
		 List<Developer> p4List = new ArrayList<Developer>();
		 p4List.add(d1);
		 p4List.add(d3);
		 p4List.add(d4);
		 
		 List<Developer> p5List = new ArrayList<Developer>();
		 p5List.add(d1);
		 p5List.add(d4);
		 
		 d1.setProjects(d1List);
		 d2.setProjects(d2List);
		 d3.setProjects(d3List);
		 d4.setProjects(d4List);
		 
		 p1.setDevelopers(p1List);
		 p2.setDevelopers(p2List);
		 p3.setDevelopers(p2List);
		 p4.setDevelopers(p4List);
		 p5.setDevelopers(p5List);
		 
		 session.save(d1);
		 session.save(d2);
		 session.save(d3);
		 session.save(d4);
		 session.save(p1);
		 session.save(p2);
		 session.save(p3);
		 session.save(p4);
		 session.save(p5);




		 
		
		Transaction transaction = session.beginTransaction();
		transaction.commit();
		session.close();
		sessionFactory.close();
	}

}
