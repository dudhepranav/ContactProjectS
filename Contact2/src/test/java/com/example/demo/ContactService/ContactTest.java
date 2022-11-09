package com.example.demo.ContactService;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.Contact.Contact;
import com.example.demo.Controller.Controller;
import com.example.demo.Repo.ContactRepo;

@SpringBootTest
class ContactTest {

	@Autowired
	private ContactRepo contactRepo;
	
	@Autowired
	private ContactService contactService;
	
	
	//To check getContactByName using name entity
	@Test
	void test() {
		Contact c = new Contact();
		c.setUserID(1);
		c.setName("Pranav");
		c.setEmailID("pranav@gmail.com");
		c.setPhone("+917276455274");
		
		contactRepo.save(c);
		
		assertThat(1).isEqualTo(contactService.getContactByName("pranav@gmail.com").size());
		
		//assertThat(1).isEqualTo((int)contactRepo.count());
		//assertThat(1).isEqualTo(contactRepo.getById(1).getUserID());
	//	assertThat("Pranav").isEqualTo(contactService.getContactByID(1).getName());
		
		
		
	}
	
	
	//To check repo size is updated or not
	@Test
	void test2() {
		Contact c = new Contact();
		c.setUserID(1);
		c.setName("Pranav");
		c.setEmailID("pranav@gmail.com");
		c.setPhone("+917276455274");
		
		contactRepo.save(c);
		
		assertThat(1).isEqualTo((int)contactRepo.count());
		
	}
	
	
	//To check getContactByName return value's get name is matching with the namw that we are setting
	@Test
	void test3() {
		Contact c = new Contact();
		c.setUserID(1);
		c.setName("Pranav");
		c.setEmailID("pranav@gmail.com");
		c.setPhone("+917276455274");
		
		contactRepo.save(c);
	
		
		assertThat("Pranav").isEqualTo(contactService.getContactByName("pranav@gmail.com").get(0).getName());
	}
	
	////To check getContactByName using phoneNumber entity
	@Test
	void test4() {
		Contact c = new Contact();
		c.setUserID(1);
		c.setName("Pranav");
		c.setEmailID("pranav@gmail.com");
		c.setPhone("+917276455274");
		
		contactRepo.save(c);
		assertThat(1).isEqualTo(contactService.getContactByName("+917276455274").size());
	}

	//To check get all contact method of contactService
	@Test
	void test5() {
	
		Contact c = new Contact();
		c.setUserID(1);
		c.setName("Pranav");
		c.setEmailID("pranav@gmail.com");
		c.setPhone("+917276455274");
		
		contactRepo.save(c);
		
		assertThat(1).isEqualTo(contactService.getAllContact().size());
	}
	
	
	//To check create contact method of contactService
	@Test
	void test6() {
		Contact c = new Contact();
		c.setUserID(1);
		c.setName("Pranav");
		c.setEmailID("pranav@gmail.com");
		c.setPhone("+917276455274");
		
		contactService.createContact(c);
		
		assertThat(1).isEqualTo(contactRepo.count());
	}
	
	
	//To check for getEmailId function with getContactByName as email entity
	@Test
	void test7() {
		Contact c = new Contact();
		c.setUserID(1);
		c.setName("Pranav");
		c.setEmailID("pranav@gmail.com");
		c.setPhone("+917276455274");
		
		contactRepo.save(c);
		
		
		assertThat("pranav@gmail.com").isEqualTo(contactService.getContactByName("pranav@gmail.com").get(0).getEmailID());
		
		
	}
	
	//To check for getPhone function with getContactByName with phone entitiy
	@Test
	void test8() {
		Contact c = new Contact();
		c.setUserID(1);
		c.setName("Pranav");
		c.setEmailID("pranav@gmail.com");
		c.setPhone("+917276455274");
		
		contactRepo.save(c);
		
		
		assertThat("+917276455274").isEqualTo(contactService.getContactByName("+917276455274").get(0).getPhone());
		
		
	}
	
	
}
