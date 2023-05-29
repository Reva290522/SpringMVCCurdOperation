package com.soft.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_details")
public class User {

	@Id 
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String Address;
	private String phno;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String name, String address, String phno) {
		super();
		this.id = id;
		this.name = name;
		this.Address = address;
		this.phno = phno;
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
		return Address;
	}
	public void setAddress(String address) {
		this.Address = address;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", Address=" + Address + ", phno=" + phno + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getAddress()=" + getAddress() + ", getPhno()=" + getPhno()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
