package HB.Mapping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Address {

	@Id
	private int aid;
	private String city;
	private String state;
	private String country;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int aid, String city, String state, String country) {
		super();
		this.aid = aid;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	
}
