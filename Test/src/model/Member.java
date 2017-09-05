package model;

import java.io.Serializable;
import javax.persistence.*;

import model.CRClass;

import java.util.Date;


/**
 * The persistent class for the member database table.
 * 
 */
@Entity
@Table(name="member")
@NamedQuery(name="Member.findAll", query="SELECT m FROM Member m")
public class Member implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Temporal(TemporalType.DATE)
	private Date birthdate;

	@Column(name="crclass_id")
	private int crclassId;

	private String email;
	@Column (name="name")
	private String name;
	
	@PrimaryKeyJoinColumn
	private CRClass crclass;

	public Member() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getBirthdate() {
		return this.birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public int getCrclassId() {
		return this.crclassId;
	}

	public void setCrclassId(int crclassId) {
		this.crclassId = crclassId;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}