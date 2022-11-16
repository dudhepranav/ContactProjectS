package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Contact.Contact;
import com.example.demo.ContactService.ContactService;
import com.example.demo.Repo.ContactRepo;

@CrossOrigin(origins = "http://localhost:3001/")
@RestController
public class Controller {
	
	@Autowired
	private ContactService contactService;
	
	@PostMapping("/contacts")
	public Contact createContact(@RequestBody Contact contact) {
		return contactService.createContact(contact);
		
	}
	
	
	@GetMapping("/contacts")
	public List<Contact> getAllProduct(){
		return contactService.getAllContact();
		
	}
	
	
//	@CrossOrigin(origins = "http://localhost:3001/")
//	@GetMapping("/contacts/{var}")
//	public ResponseEntity< List<Contact>> getContactByVar(@PathVariable String var) {
//		
//		if( this.contactService.getContactByName(var).size() <= 0) {
//			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//	
//		}
//		return ResponseEntity.of(Optional.of(this.contactService.getContactByName(var)));
//		
////		return contactService.getContactByName(var);
//	}
//	
	@CrossOrigin(origins = "http://localhost:3001/")
	@GetMapping("/contacts/{var}")
	public ResponseEntity<Contact> getContactByVar(@PathVariable String var) {
		
		if( this.contactService.getContactByName(var).size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	
		}
		return ResponseEntity.of(Optional.of(this.contactService.getContactByName(var).get(0)));
		
//		return contactService.getContactByName(var);
	}
	
//	@GetMapping("/contacts/{id}")
//	public Contact getProductByID(@PathVariable int id) {
//		return contactService.getContactByID(id);
//	}

}
