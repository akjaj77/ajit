package com.iserveu.prepaidcard.Entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "cardholder")
public class CardHolderEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "createddate")
	private Date createddate;
	@Column(name = "updatedate")
	private Date updatedate;
	@Column(name = "honorific")
	private String honorific;
	@Column(name = "gender")
	private String gender;
	@Column(name = "firstname")
	private String firstname;
	@Column(name = "middlename")
	private String middlename;
	@Column(name = "lastname")
	private String lastname;
	@Column(name = "email")
	private String email;
	@Column(name = "address1")
	private String address1;
	@Column(name = "address2")
	private String address2;
	@Column(name = "city")
	private String city;
	@Column(name = "state")
	private String state;
	@Column(name = "zip")
	private String zip;
	@Column(name = "country")
	private String country;
	@Column(name = "birthdate")
	private Date birthdate;
	@Column(name = "description")
	private String description;
	@Column(unique= true,name = "phone")
	private String phone;
@JsonBackReference
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "cardholderEntity", fetch = FetchType.EAGER)
	private Set<CardEntity> cardEntity;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreateddate() {
		return createddate;
	}

	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}

	public Date getUpdatedate() {
		return updatedate;
	}

	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}

	public String getHonorific() {
		return honorific;
	}

	public void setHonorific(String honorific) {
		this.honorific = honorific;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
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

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
@JsonIgnore
	public Set<CardEntity> getCardEntity() {
		return cardEntity;
	}
@JsonIgnore
	public void setCardEntity(Set<CardEntity> cardEntity) {
		this.cardEntity = cardEntity;
	}
}
