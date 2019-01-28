package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Shops {
	@Id
	private String pname;
	private String sname;
	private String place;
	public Shops(String pname, String sname, String place) {
		this.pname = pname;
		this.sname = sname;
		this.place = place;
	}
	public Shops() {
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	@Override
	public String toString() {
		return "Shops [pname=" + pname + ", sname=" + sname + ", place=" + place + "]";
	}
	
	

}
