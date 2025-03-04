package com.manytomany.EmployeeAddress;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int a_id;
	private String city;
	private String state;
	@ManyToMany(mappedBy = "address",cascade = CascadeType.ALL)

	private List<Employee> emp;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address( String city, String state, List<Employee> emp) {
		super();
		
		this.city = city;
		this.state = state;
		this.emp = emp;
	}
	public int getA_id() {
		return a_id;
	}
	public void setA_id(int a_id) {
		this.a_id = a_id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public List<Employee> getEmp() {
		return emp;
	}
	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}
	@Override
	public String toString() {
		return "Address [a_id=" + a_id + ", city=" + city + ", state=" + state + ", emp=" + emp + "]";
	}
	

}
