package com.example.demo.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Contact.Contact;

public interface ContactRepo extends JpaRepository<Contact, Integer>{

	public List<Contact> findByName(String name);
	public List<Contact> findByPhone(String phone);
	public List<Contact> findByEmailID(String emailID);
	
}
