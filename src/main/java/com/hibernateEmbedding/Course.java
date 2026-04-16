package com.hibernateEmbedding;

import javax.persistence.Embeddable;

@Embeddable
public class Course {
	private int cId;
	private String cName;
	private int cFee;
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getcFee() {
		return cFee;
	}
	public void setcFee(int cFee) {
		this.cFee = cFee;
	}
	public Course(int cId, String cName, int cFee) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cFee = cFee;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
