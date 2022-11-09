package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.Contact.Contact;
import com.example.demo.ContactService.ContactService;
import com.example.demo.Repo.ContactRepo;

//@SpringBootTest
class Contact2ApplicationTests {
	
	
//	@Test
//	void xyz() {
//		
//	}
//	
//	
//	@Autowired
//	private ContactRepo contactRepo;
//	
//	@Autowired
//	private ContactService contactService;
//	
//	
//	@Test
//	void test1() {
//		Contact c = new Contact();
//		c.setUserID(2);
//		c.setName("Dudhe");
//		c.setEmailID("dudhe@gmail.com");
//		c.setPhone("+910000001");
//		
//		contactRepo.save(c);
//		assertThat(2).isEqualTo(c.getUserID());
//	}
//	
	
	//check for contact getting save
//	@Test
//	void checkforSaveRepo() {
//		Contact c = new Contact();
//		c.setUserID(2);
//		c.setName("Dudhe");
//		c.setEmailID("dudhe@gmail.com");
//		c.setPhone("+910000001");
//		
//		contactRepo.save(c);
//		assertThat(2).isEqualTo(c.getUserID());
//	}
	
//
//	//check for contact getting for id
//	@Test
//	void checkgetContactByIDforID() {
//		Contact c = new Contact();
//		c.setUserID(2);
//		c.setName("Dudhe");
//		c.setEmailID("dudhe@gmail.com");
//		c.setPhone("+910000001");
//		
//		contactRepo.save(c);
//		
//		
//		assertThat(2).isEqualTo(contactService.getContactByID(c.getUserID()).getUserID());
//		//assertThat(2).isEqualTo(c.getUserID());
//		//assertThat(1).isEqualTo((int)contactRepo.count());
//		//assertThat(1).isEqualTo(contactService.getAllContact().size());
//		
//	}
//	
//	//check for contact getting by id
//	@Test
//	void checkgetContactByIDforName() {
//		Contact c = new Contact();
//		c.setUserID(2);
//		c.setName("Dudhe");
//		c.setEmailID("dudhe@gmail.com");
//		c.setPhone("+910000001");
//		
//		contactRepo.save(c);
//		
//		
//		assertThat("Dudhe").isEqualTo(contactService.getContactByID(c.getUserID()).getName());
//	}
//	
//
//	//check for size of repo
//	@Test
//	void checkSizeofRepo() {
//		Contact c = new Contact();
//		c.setUserID(2);
//		c.setName("Dudhe");
//		c.setEmailID("dudhe@gmail.com");
//		c.setPhone("+910000001");
//		
//		contactRepo.save(c);
//		assertThat(1).isEqualTo((int)contactRepo.count());
//		
//	}
//	
//	//check for all contact
//	@Test
//	void checkGetAllContact() {
//		Contact c = new Contact();
//		c.setUserID(2);
//		c.setName("Dudhe");
//		c.setEmailID("dudhe@gmail.com");
//		c.setPhone("+910000001");
//		
//		contactRepo.save(c);
//		assertThat(1).isEqualTo(contactService.getAllContact().size());
//		
//	}
}
