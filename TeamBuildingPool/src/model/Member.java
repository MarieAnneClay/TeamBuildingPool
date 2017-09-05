package model;
import java.util.Date;

public class Member {
	private String name;
	private String email;
	private Date birthdate;
	private CRClass crclass; 
	
	public Member() {
	}
	
	public Member(String name, String email, Date birthdate) {
		this.name=name;
		this.email=email;
		this.birthdate=birthdate;
	}
	
	public Member(String name, String email, Date birthdate, CRClass crclass) {
		this.name=name;
		this.email=email;
		this.birthdate=birthdate;
		this.crclass=crclass;
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
