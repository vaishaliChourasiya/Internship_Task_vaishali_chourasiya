package com.example.demo.Entity;

import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
@Entity
public class Subcategories {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String subcategory_id;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="categoryid" ,referencedColumnName = "category_id",nullable = false)
	private Categories categoryid;
	@Column(name="subcategory_name")
	private String name;
	@Temporal(TemporalType.TIMESTAMP)
	private Date created_at;
	@Temporal(TemporalType.TIMESTAMP)
	private Date updated_at;
	public Subcategories() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Subcategories(Categories categoryid, String name, Date created_at, Date updated_at) {
		super();
		this.categoryid = categoryid;
		this.name = name;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}
	public String getSubcategory_id() {
		return subcategory_id;
	}
	public void setSubcategory_id(String subcategory_id) {
		this.subcategory_id = subcategory_id;
	}
	public Categories getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(Categories categoryid) {
		this.categoryid = categoryid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	@Override
	public String toString() {
		return "Subcategories [subcategory_id=" + subcategory_id + ", categoryid=" + categoryid + ", name=" + name
				+ ", created_at=" + created_at + ", updated_at=" + updated_at + "]";
	}

}
