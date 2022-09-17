package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="employees")
public class employee {
	@Id
	private int id;
	private String lastName;
	private String firstName;
	private String email;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public employee(int id, String lastName, String firstName, String email) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.email = email;
	}
	@Override
	public String toString() {
		return "employee [id=" + id + ", lastName=" + lastName + ", firstName=" + firstName + ", email=" + email + "]";
	}
	public employee() {
	}
}
