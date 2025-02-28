package com.example.demo.Entity;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
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
public class Payments {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String payment_id;
	@ManyToOne
	@JoinColumn(name="appointment_id",referencedColumnName = "appointment_id",nullable=false)
	private Appointments appointmentId;
	@Column(nullable = false,scale = 2)
	private BigDecimal amount;
	@Enumerated(EnumType.STRING)
	private PaymentMethod paymentmethod;
	@Enumerated(EnumType.STRING)
	private Status status;
	@Temporal(TemporalType.TIMESTAMP)
	private  Date created_at;
	@Temporal(TemporalType.TIMESTAMP)
	private Date update_At;

	public enum PaymentMethod{
		card,
		cash,
		upi
	}
	public enum Status{
		paid,
		cancelled,
		refund
	}
	public Payments() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Payments(Appointments appointmentId, BigDecimal amount, PaymentMethod paymentmethod, Status status,
			Date created_at, Date update_At) {
		super();
		this.appointmentId = appointmentId;
		this.amount = amount;
		this.paymentmethod = paymentmethod;
		this.status = status;
		this.created_at = created_at;
		this.update_At = update_At;
	}
	public String getPayment_id() {
		return payment_id;
	}
	public void setPayment_id(String payment_id) {
		this.payment_id = payment_id;
	}
	public Appointments getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(Appointments appointmentId) {
		this.appointmentId = appointmentId;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public PaymentMethod getPaymentmethod() {
		return paymentmethod;
	}
	public void setPaymentmethod(PaymentMethod paymentmethod) {
		this.paymentmethod = paymentmethod;
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
	public Date getUpdate_At() {
		return update_At;
	}
	public void setUpdate_At(Date update_At) {
		this.update_At = update_At;
	}
	@Override
	public String toString() {
		return "Payments [payment_id=" + payment_id + ", appointmentId=" + appointmentId + ", amount=" + amount
				+ ", paymentmethod=" + paymentmethod + ", status=" + status + ", created_at=" + created_at
				+ ", update_At=" + update_At + "]";
	}
	
}
