package StudentAddress;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="student_address")
public class Address {
	@Id
	private int addressId;
	private String city;
	private String state;
	@OneToOne(mappedBy = "address",cascade  =CascadeType.ALL )
	private Student student;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int addressId, String city, String state, Student student) {
		super();
		this.addressId = addressId;
		this.city = city;
		this.state = state;
		this.student = student;
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", city=" + city + ", state=" + state + ", student=" + student + "]";
	}
	
	
	


	
}
