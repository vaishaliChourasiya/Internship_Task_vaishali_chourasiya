package com.example.demo.Entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
@Entity
@Table(name="users")
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String user_id;
	@Column(name="name",nullable = false)
	private String name;
	@Column(name="mobile_no.",nullable = false)
	private String mobile;
	@Column(name="email",unique = true,nullable = false)
	private String email;
	@Column(name="password",nullable = false)
	private String password;
	@Enumerated(EnumType.STRING)
	@Column(name="role",nullable = false)
	private Role role;
	@Temporal(TemporalType.TIMESTAMP)
	private Date created_at;
	@Temporal(TemporalType.TIMESTAMP)
	private Date update_at;
	
	  public enum Role {
	        ADMIN,
	        SERVICE_PROVIDER,
	        CUSTOMER
	    }

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(String name, String mobile, String email, String password, Role role, Date created_at,
			Date update_at) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.password = password;
		this.role = role;
		this.created_at = created_at;
		this.update_at = update_at;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
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
		return "Users [user_id=" + user_id + ", name=" + name + ", mobile=" + mobile + ", email=" + email
				+ ", password=" + password + ", role=" + role + ", created_at=" + created_at + ", update_at="
				+ update_at + "]";
	}
	

}
