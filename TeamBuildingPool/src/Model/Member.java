package Model;
import java.util.Date;

public class Member {
	private String name;
	private String email;
	private Date birthdate;
	private CRClass crclass; 
	
	public Member() {
	}
	
	public Member(String n, String e, Date b) {
		name=n;
		email=e;
		birthdate=b;
	}
	
	public Member(String n, String e, Date b, CRClass c) {
		name=n;
		email=e;
		birthdate=b;
		crclass=c;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public CRClass getCrclass() {
		return crclass;
	}

	public void setCrclass(CRClass crclass) {
		this.crclass = crclass;
	}
	
}
