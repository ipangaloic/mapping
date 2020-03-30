package com.mapping.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Entity;

@Entity
@Table(name = "person")
public class Person {

	@Id
	@GeneratedValue
	@Column(name = "pesonId")
	private int personId;

	@Column(name = "pesonName")
	private String personName;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "pDetail_Fk")
	private PersonDetail pDetail;

	public PersonDetail getpDetail() {
		return pDetail;
	}

	public void setpDetail(PersonDetail pDetail) {
		this.pDetail = pDetail;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

}
