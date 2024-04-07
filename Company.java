package com.tnsif.companyservice;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Company
{
	@Id
	@Column(name="cid")
	private int id;
	@Column(name="cname")
    private String name;
	@Column(name="caddress")
    private String address;
	
	public Company() {
		super();
		//ToDo Auto-generated constructor stub
	}
	
	public Company(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
}

