package HB.Criteria;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String contact;
	private String city;
	private String gender;
	private String status;
	
	public UserDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDetail(String name, String contact, String city, String gender, String status) {
		super();
		this.name = name;
		this.contact = contact;
		this.city = city;
		this.gender = gender;
		this.status = status;
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

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "UserDetail [id=" + id + ", name=" + name + ", contact=" + contact + ", city=" + city + ", gender="
				+ gender + ", status=" + status + "]";
	}
	
	
}
