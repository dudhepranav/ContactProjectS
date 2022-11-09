package com.example.demo.ContactService;

import java.util.List;

import com.example.demo.Contact.Contact;

public interface ContactService {
	
	Contact createContact(Contact contact);
	List<Contact> getAllContact();
//	Contact getContactByID(int x);
	List<Contact> getContactByName(String name);
	

}
