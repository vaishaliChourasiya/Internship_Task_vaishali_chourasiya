package com.manytomany.EmpDepartment;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int d_id;
	private String d_name;
	@ManyToMany
	private List<Emp> emp;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(String d_name, List<Emp> emp) {
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
	public List<Emp> getEmp() {
		return emp;
	}
	public void setEmp(List<Emp> emp) {
		this.emp = emp;
	}
	@Override
	public String toString() {
		return "Department [d_id=" + d_id + ", d_name=" + d_name + ", emp=" + emp + "]";
	}
	
}
