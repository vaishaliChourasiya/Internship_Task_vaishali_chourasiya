package com.manytomany.EmpDepartment;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
@Entity
public class Emp {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int e_id;
	private String name;
	@ManyToMany(mappedBy = "emp")
	private List<Department> dept;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(String name, List<Department> dept) {
		super();
		this.name = name;
		this.dept = dept;
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
	public List<Department> getDept() {
		return dept;
	}
	public void setDept(List<Department> dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Emp [e_id=" + e_id + ", name=" + name + ", dept=" + dept + "]";
	}
	
	

}
