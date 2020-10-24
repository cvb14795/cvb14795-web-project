package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {

	@Id  //指定primary key 等同AUTO_INCREMENT
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String name;
	@Column(name="rent_spec")
	private String rentSpec;
	@Column(name="rent_date")
	private String rentDate;
	private String phone;
	
	public Person(){
		
	}
	
	public Person(Integer id, String name, String rentSpec, String rentDate, String phone) {
		this.id = id;
		this.name = name;
		this.rentSpec = rentSpec;
		this.rentDate = rentDate;
		this.phone = phone;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRentSpec() {
		return rentSpec;
	}
	public void setRentSpec(String rentSpec) {
		this.rentSpec = rentSpec;
	}
	public String getRentDate() {
		return rentDate;
	}
	public void setRentDate(String rentDate) {
		this.rentDate = rentDate;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	
	
	
}
