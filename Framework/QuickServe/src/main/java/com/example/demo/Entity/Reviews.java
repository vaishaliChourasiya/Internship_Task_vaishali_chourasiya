package com.example.demo.Entity;

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
public class Reviews {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String review_id;
	@ManyToOne
	@JoinColumn(name="service_id",referencedColumnName = "service_id",nullable = false)
	private Service serviceId;
	@ManyToOne
	@JoinColumn(name="user_id",referencedColumnName = "user_id",nullable = false)
	private Users userId;
	@Column(name="rating")
	private Integer rating;
	private String comment;
	@Temporal(TemporalType.TIMESTAMP)
	private Date created_at;
	@Temporal(TemporalType.TIMESTAMP)
	private Date updated_at;
	public Reviews() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reviews(Service serviceId, Users userId, int rating, String comment, Date created_at, Date updated_at) {
		super();
		this.serviceId = serviceId;
		this.userId = userId;
		this.rating = rating;
		this.comment = comment;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}
	public String getReview_id() {
		return review_id;
	}
	public void setReview_id(String review_id) {
		this.review_id = review_id;
	}
	public Service getServiceId() {
		return serviceId;
	}
	public void setServiceId(Service serviceId) {
		this.serviceId = serviceId;
	}
	public Users getUserId() {
		return userId;
	}
	public void setUserId(Users userId) {
		this.userId = userId;
	}
	public int getRating() {
		return rating;
	}
	 public void setRating(Integer rating) {
	        if (rating >= 1 && rating <= 5) {
	            this.rating = rating;  
	        } else {
	            throw new IllegalArgumentException("Rating must be between 1 and 5");
	        }
	    }
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
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
		return "Reviews [review_id=" + review_id + ", serviceId=" + serviceId + ", userId=" + userId + ", rating="
				+ rating + ", comment=" + comment + ", created_at=" + created_at + ", updated_at=" + updated_at + "]";
	}
	
	
}
