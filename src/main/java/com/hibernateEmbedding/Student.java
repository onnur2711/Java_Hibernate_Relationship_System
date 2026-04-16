package com.hibernateEmbedding;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sId;
	private String sName;
	private long sContact;
	
	@Embedded
	private Course c;

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public long getsContact() {
		return sContact;
	}

	public void setsContact(long sContact) {
		this.sContact = sContact;
	}

	public Course getC() {
		return c;
	}

	public void setC(Course c) {
		this.c = c;
	}

	public Student(int sId, String sName, long sContact, Course c) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sContact = sContact;
		this.c = c;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
