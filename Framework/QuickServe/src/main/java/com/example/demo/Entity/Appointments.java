package com.example.demo.Entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
@Entity
public class Appointments {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String appointment_id;
	@ManyToOne
	@JoinColumn(name="service_id",referencedColumnName = "service_id",nullable=false)
	private Service serviceId;
	@ManyToOne
	@JoinColumn(name="user_id",referencedColumnName = "user_id",nullable = false)
	private Users userId;
	@Temporal(TemporalType.TIMESTAMP)
	private Date appointment_date;
	private String time_slot;
	@Enumerated(EnumType.STRING)
	private Status status;
	@Temporal(TemporalType.TIMESTAMP)
	private Date created_at;
	@Temporal(TemporalType.TIMESTAMP)
	private Date update_at;

	public enum Status {
		Book,
		Canncelled,
		Refund
	}

	public Appointments() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Appointments(Service serviceId, Users userId, Date appointment_date, String time_slot, Status status,
			Date created_at, Date update_at) {
		super();
		this.serviceId = serviceId;
		this.userId = userId;
		this.appointment_date = appointment_date;
		this.time_slot = time_slot;
		this.status = status;
		this.created_at = created_at;
		this.update_at = update_at;
	}

	public String getAppointment_id() {
		return appointment_id;
	}

	public void setAppointment_id(String appointment_id) {
		this.appointment_id = appointment_id;
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

	public Date getAppointment_date() {
		return appointment_date;
	}

	public void setAppointment_date(Date appointment_date) {
		this.appointment_date = appointment_date;
	}

	public String getTime_slot() {
		return time_slot;
	}

	public void setTime_slot(String time_slot) {
		this.time_slot = time_slot;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
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
		return "Appointments [appointment_id=" + appointment_id + ", serviceId=" + serviceId + ", userId=" + userId
				+ ", appointment_date=" + appointment_date + ", time_slot=" + time_slot + ", status=" + status
				+ ", created_at=" + created_at + ", update_at=" + update_at + "]";
	}
	
}
