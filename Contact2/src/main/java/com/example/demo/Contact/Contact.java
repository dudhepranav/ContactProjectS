package com.example.demo.Contact;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name = "contacts")
public class Contact {
	
	@Id
	private int userID;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "emailID")
	private String emailID;
	
	@Column(name="Phone")
	private String phone;
	
	
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
