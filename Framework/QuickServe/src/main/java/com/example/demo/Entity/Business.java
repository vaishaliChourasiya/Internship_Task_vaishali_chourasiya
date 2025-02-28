package com.example.demo.Entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Business {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String business_id;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="userid",referencedColumnName = "user_id",nullable = false)
	private Users userid;
	@Column(name="business_name",nullable=false)
	private String name;
	@Column(name="address",nullable=false)
	private String address;
	@Column(name="contact_info",nullable = false)
	private String contact_info;
	@Column(name="logo_url",nullable=false)
	private String logo_url;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_at",nullable = false)
	private Date created_at;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_at",nullable = false)
	private Date updated_at;
	public Business() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getBusiness_id() {
		return business_id;
	}
	public void setBusiness_id(String business_id) {
		this.business_id = business_id;
	}
	
	public Users getUserid() {
		return userid;
	}
	public void setUserid(Users userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact_info() {
		return contact_info;
	}
	public void setContact_info(String contact_info) {
		this.contact_info = contact_info;
	}
	public String getLogo_url() {
		return logo_url;
	}
	public void setLogo_url(String logo_url) {
		this.logo_url = logo_url;
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
	public Business(String user_id, String name, String address, String contact_info, String logo_url, Date created_at,
			Date updated_at) {
		super();
		this.userid = userid;
		this.name = name;
		this.address = address;
		this.contact_info = contact_info;
		this.logo_url = logo_url;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}
	@Override
	public String toString() {
		return "Business [business_id=" + business_id + ", user_id=" + userid + ", name=" + name + ", address="
				+ address + ", contact_info=" + contact_info + ", logo_url=" + logo_url + ", created_at=" + created_at
				+ ", updated_at=" + updated_at + "]";
	}
	

}
