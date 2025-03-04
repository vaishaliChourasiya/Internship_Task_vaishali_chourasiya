package com.onetomany.AuthorBook.Unidirectional;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int b_id;
	private String name;
	
	public Book1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book1(String name) {
		super();
		this.name = name;
		
	}
	public int getB_id() {
		return b_id;
	}
	public void setB_id(int b_id) {
		this.b_id = b_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Book1 [b_id=" + b_id + ", name=" + name + "]";
	}
	
	
	
	

}
