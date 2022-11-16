package com.example.demo.Controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import javax.script.ScriptException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Service.ValidatorService;
import com.example.model.Contact;
import com.example.model.Contacts;
import com.example.model.SendContact;
import com.example.model.SendError;


@CrossOrigin(origins = "http://localhost:3001/")
@RestController
public class ContactController {
	
	@Autowired
	ValidatorService validatorService;
	
	@Autowired
	private RestTemplate restTemplate;

	@CrossOrigin(origins = "http://localhost:3001/")
	@GetMapping("/validate/{s}")
	public ResponseEntity<SendContact> getResult(@PathVariable String s) throws ScriptException, IOException, NoSuchMethodException {
		System.out.println("S : "+s);
		if(validatorService.myValidator(s)) {
			
			try {
				Contact contact = restTemplate.getForObject("http://localhost:5000/contacts/"+s, Contact.class);
//				System.out.println(contact.getContacts()[0].getName());
//				System.out.println(contact.getContacts()[0].getEmailID());
//				System.out.println(contact.getContacts()[0].getPhone());
				System.out.println("inside if");
				//ResponseEntity<Contacts> response = restTemplate.getForEntity( "http://localhost:8080/contacts/"+s, Contacts.class);
				
			
				SendContact sc = new SendContact();
				sc.setUserID(contact.getUserID());
				sc.setName(contact.getName());
				sc.setEmailID(contact.getEmailID());
				sc.setPhone(contact.getPhone());
				
				
				System.out.println(sc);
				
				System.out.println("response : "+contact.getEmailID());
				return ResponseEntity.of(Optional.of(sc));
				
			} catch (Exception e) {
				// TODO: handle exception
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
				
			}
//			Contact contact = restTemplate.getForObject("http://localhost:5000/contacts/"+s, Contact.class);
////			System.out.println(contact.getContacts()[0].getName());
////			System.out.println(contact.getContacts()[0].getEmailID());
////			System.out.println(contact.getContacts()[0].getPhone());
//			System.out.println("inside if");
//			//ResponseEntity<Contacts> response = restTemplate.getForEntity( "http://localhost:8080/contacts/"+s, Contacts.class);
//			
//		
//			SendContact sc = new SendContact();
//			sc.setUserID(contact.getUserID());
//			sc.setName(contact.getName());
//			sc.setEmailID(contact.getEmailID());
//			sc.setPhone(contact.getPhone());
//			
//			
//			System.out.println(sc);
//			
//			System.out.println("response : "+contact.getEmailID());
//			return ResponseEntity.of(Optional.of(sc));
		}
		else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
			//return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			
		}
		
	}
	
}
