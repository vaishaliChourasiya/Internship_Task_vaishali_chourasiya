package HB.HBMapping.Annotation;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserAnnotation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String city;
	private String contact;
	public UserAnnotation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserAnnotation(String name, String city, String contact) {
		super();
		this.name = name;
		this.city = city;
		this.contact = contact;
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
	@Override
	public String toString() {
		return "UserAnnotation [id=" + id + ", name=" + name + ", city=" + city + ", contact=" + contact + "]";
	}
	
	

}
