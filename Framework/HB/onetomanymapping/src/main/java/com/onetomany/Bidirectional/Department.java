package com.onetomany.Bidirectional;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int d_id;
	private String d_name;
	@OneToMany(mappedBy = "dept",cascade =  CascadeType.ALL)
	private List<Employee> emp;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(String d_name, List<Employee> emp) {
		super();
		this.d_name = d_name;
		this.emp = emp;
	}
	public int getD_id() {
		return d_id;
	}
	public void setD_id(int d_id) {
		this.d_id = d_id;
	}
	public String getD_name() {
		return d_name;
	}
	public void setD_name(String d_name) {
		this.d_name = d_name;
	}
	public List<Employee> getEmp() {
		return emp;
	}
	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}
	@Override
	public String toString() {
		return "Department [d_id=" + d_id + ", d_name=" + d_name + ", emp=" + emp + "]";
	}
	

}
