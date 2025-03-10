package EmployeeAddress;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="emp_address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addressId;
	private String city;
	@OneToOne(mappedBy = "address")
	private Employee emp;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", city=" + city + ", emp=" + emp + "]";
	}
	

}
