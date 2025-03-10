package com.onetomany.AuthorBook.Unidirectional;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Author1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int a_id;
	private String name;
	@OneToMany(cascade =  CascadeType.ALL)
	@JoinColumn(name="a_id")
	private List<Book1> book;
	public Author1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Author1(String name, List<Book1> book) {
		super();
		this.name = name;
		this.book = book;
	}
	public int getA_id() {
		return a_id;
	}
	public void setA_id(int a_id) {
		this.a_id = a_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Book1> getBook() {
		return book;
	}
	public void setBook(List<Book1> book) {
		this.book = book;
	}
	@Override
	public String toString() {
		return "Author1 [a_id=" + a_id + ", name=" + name + ", book=" + book + "]";
	}
	

}
