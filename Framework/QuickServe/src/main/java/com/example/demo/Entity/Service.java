
package com.example.demo.Entity;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Service {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String service_id;
	@ManyToOne
	@JoinColumn(name="business_id",referencedColumnName = "business_id",nullable = false)
	private Business businessId;
	@ManyToOne
	@JoinColumn(name="subcategory_id",referencedColumnName = "subcategory_id",nullable = false)
	private Subcategories subcategoryId;
	@Column(name="subcategory_name")
	private String name;
	
	private String description;
	@Column(name="price",scale = 2)
	private BigDecimal price;
	@Temporal(TemporalType.TIMESTAMP)
	private Date created_at;
	@Temporal(TemporalType.TIMESTAMP)
	private Date update_at;
	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Service(Business businessId, Subcategories subcategoryId, String name, String description, BigDecimal price,
			Date created_at, Date update_at) {
		super();
		this.businessId = businessId;
		this.subcategoryId = subcategoryId;
		this.name = name;
		this.description = description;
		this.price = price;
		this.created_at = created_at;
		this.update_at = update_at;
	}
	public String getService_id() {
		return service_id;
	}
	public void setService_id(String service_id) {
		this.service_id = service_id;
	}
	public Business getBusinessId() {
		return businessId;
	}
	public void setBusinessId(Business businessId) {
		this.businessId = businessId;
	}
	public Subcategories getSubcategoryId() {
		return subcategoryId;
	}
	public void setSubcategoryId(Subcategories subcategoryId) {
		this.subcategoryId = subcategoryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
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
		return "Service [service_id=" + service_id + ", businessId=" + businessId + ", subcategoryId=" + subcategoryId
				+ ", name=" + name + ", description=" + description + ", price=" + price + ", created_at=" + created_at
				+ ", update_at=" + update_at + "]";
	}
	
	
	

}
