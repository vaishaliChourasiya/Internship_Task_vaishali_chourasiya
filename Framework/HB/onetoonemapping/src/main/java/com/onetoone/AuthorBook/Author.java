package com.onetoone.AuthorBook;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int a_id;
	private String a_name;
	@OneToOne(mappedBy = "author",cascade = CascadeType.ALL )
	private Book book;
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Author(String a_name, Book book) {
		super();
		this.a_name = a_name;
		this.book = book;
	}
	public int getA_id() {
		return a_id;
	}
	public void setA_id(int a_id) {
		this.a_id = a_id;
	}
	public String getA_name() {
		return a_name;
	}
	public void setA_name(String a_name) {
		this.a_name = a_name;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	@Override
	public String toString() {
		return "Author [a_id=" + a_id + ", a_name=" + a_name + ", book=" + book + "]";
	}
	

}
