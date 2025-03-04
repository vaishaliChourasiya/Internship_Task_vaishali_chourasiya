package HB.HBMapping.EmbeddingObject;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Embeddable
public class Certificate {
	
	private int cId;
	private String Cname;
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Certificate(int cId,String cname) {
		super();
		this.cId=cId;
		this.Cname = cname;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	@Override
	public String toString() {
		return "Certificate [cId=" + cId + ", Cname=" + Cname + "]";
	}
	
}
