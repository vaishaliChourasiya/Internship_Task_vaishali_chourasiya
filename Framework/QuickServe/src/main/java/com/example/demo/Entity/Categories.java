package com.example.demo.Entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
@Entity
public class Categories {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String category_id;
	@Column(name="category_name",nullable=false)
	private String c_name;
	@Temporal(TemporalType.TIMESTAMP)
	private Date created_at;
	@Temporal(TemporalType.TIMESTAMP)
	private Date update_at;
	public Categories() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Categories(String c_name, Date created_at, Date update_at) {
		super();
		this.c_name = c_name;
		this.created_at = created_at;
		this.update_at = update_at;
	}
	public String getCategory_id() {
		return category_id;
	}
	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Date getUpdate_at() {
		return update_at;
	}
	public void setUpdate_at(Date update_at) {
		this.update_at = update_at;
	}
	@Override
	public String toString() {
		return "Categories [category_id=" + category_id + ", c_name=" + c_name + ", created_at=" + created_at
				+ ", update_at=" + update_at + "]";
	}
	
	

}
