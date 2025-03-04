package CrudHql;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
@Entity
public class User {
	@Id
	private int id;
	private String name;
	private String city;
	private String contact;
	@Temporal(TemporalType.DATE)
	private Date dob;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String name, String city, String contact, Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.contact = contact;
		this.dob = dob;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", city=" + city + ", contact=" + contact + ", dob=" + dob + "]";
	}
	
	

}
