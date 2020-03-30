package com.mapping.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Pdetails")
public class PersonDetail {
	@Id
	@GeneratedValue
	@Column(name = "detailId_PK")
	private int personDetailID;

	@Column(name = "zipcode")
	private String zipCode;

	@Column(name = "job")
	private String job;

	@Column(name = "income")
	private String income;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "pesronId")
	private Person person;


	public int getPersonDetailID() {
		return personDetailID;
	}

	public void setPersonDetailID(int personDetailID) {
		this.personDetailID = personDetailID;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getIncome() {
		return income;
	}

	public void setIncome(String income) {
		this.income = income;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
