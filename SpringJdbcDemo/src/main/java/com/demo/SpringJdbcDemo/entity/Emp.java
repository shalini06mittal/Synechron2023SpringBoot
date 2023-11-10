package com.demo.SpringJdbcDemo.entity;

public class Emp {
	
	private int eid;
	private String ename;
	private String city;
	public Emp() {
		// TODO Auto-generated constructor stub
	}
	public Emp(int eid, String ename, String city) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.city = city;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", city=" + city + "]";
	}
	
}
