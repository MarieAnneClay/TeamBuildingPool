package model;

import java.io.Serializable;
import javax.persistence.*;

import model.CRClass;

import java.sql.Timestamp;


/**
 * The persistent class for the codeReview database table.
 * 
 */
@Entity
@Table(name="codeReview")
@NamedQuery(name="CodeReview.findAll", query="SELECT c FROM CodeReview c")
public class CodeReview implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private Timestamp dateTime;

	private String description;

	private String name;
	@PrimaryKeyJoinColumn
	private CRClass crclass;

	public CodeReview() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getDateTime() {
		return this.dateTime;
	}

	public void setDateTime(Timestamp dateTime) {
		this.dateTime = dateTime;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}