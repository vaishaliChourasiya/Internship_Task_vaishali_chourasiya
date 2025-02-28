package com.example.demo.Entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
@Entity
public class Notifications {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String notification_id;
	@ManyToOne
	@JoinColumn(name="user_id",referencedColumnName = "user_id",nullable = false)
	private Users userId;
	private String message;
	private boolean isRead;
	@Temporal(TemporalType.TIMESTAMP)
	private Date created_at;
	public Notifications() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Notifications(Users userId, String message, boolean isRead, Date created_at) {
		super();
		this.userId = userId;
		this.message = message;
		this.isRead = isRead;
		this.created_at = created_at;
	}
	public String getNotification_id() {
		return notification_id;
	}
	public void setNotification_id(String notification_id) {
		this.notification_id = notification_id;
	}
	public Users getUserId() {
		return userId;
	}
	public void setUserId(Users userId) {
		this.userId = userId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isRead() {
		return isRead;
	}
	public void setRead(boolean isRead) {
		this.isRead = isRead;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	@Override
	public String toString() {
		return "Notifications [notification_id=" + notification_id + ", userId=" + userId + ", message=" + message
				+ ", isRead=" + isRead + ", created_at=" + created_at + "]";
	}
	
}
