package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class Contacts {
	
	private List<Contact> myContacts;

	public List<Contact> getMyContacts() {
		return myContacts;
	}

	public void setMyContacts(List<Contact> myContacts) {
		this.myContacts = myContacts;
	}

	@Override
	public String toString() {
		return "Contacts [myContacts=" + myContacts + "]";
	}

	
	
	
	
	

}
