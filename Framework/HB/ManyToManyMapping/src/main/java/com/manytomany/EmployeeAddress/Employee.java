package com.manytomany.EmployeeAddress;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int e_id;
	private String name;
	@ManyToMany
	private List<Address> address;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, List<Address> address) {
		super();
		this.name = name;
		this.address = address;
	}
	public int getE_id() {
		return e_id;
	}
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [e_id=" + e_id + ", name=" + name + ", address=" + address + "]";
	}
	

}
