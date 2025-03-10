package onetomanymapping.QuestionAnswer;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Department {
	@Id
	Employee e1=new Employee();
	private int dept_id;
	private String name;
	@OneToMany(mappedBy = "dept",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Employee> emp;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department( String name, List<Employee> emp) {
		super();
	
		this.name = name;
		this.emp = emp;
	}
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Employee> getEmp() {
		return emp;
	}
	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}
	@Override
	public String toString() {
		return "Department [dept_id=" + dept_id + ", name=" + name + ", emp=" + emp + "]";
	}
	

}
