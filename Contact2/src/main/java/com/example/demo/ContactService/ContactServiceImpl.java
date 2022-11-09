package com.example.demo.ContactService;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Contact.Contact;
import com.example.demo.Repo.ContactRepo;

@Service
@Transactional
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepo contactRepo;
	
	@Override
	public Contact createContact(Contact contact) {
		// TODO Auto-generated method stub
		
		return contactRepo.save(contact);
	}
	

	@Override
	public List<Contact> getAllContact() {
		// TODO Auto-generated method stub
		
		return contactRepo.findAll();
	}

//	@Override
//	public Contact getContactByID(int var) {
//		// TODO Auto-generated method stub
//		Optional<Contact> c = contactRepo.findById(var);
//		if(c.isPresent()) {
//			return c.get();
//		}
//		else {
//			return null ;
//		}
//		
//		
//	}

	@Override
	public List<Contact> getContactByName(String name) {
		// TODO Auto-generated method stub
		
		System.out.println("name : "+name);
		String n = name;
		
		List<Contact> cc = contactRepo.findByEmailID(n);
		if(cc.isEmpty()==true) {
			System.out.println("In if block for phone");
			 cc = contactRepo.findByPhone(n);
		}
		System.out.println(cc);
		return cc;
		
//		Contact cc = contactRepo.findByName(var); 
		
//		System.out.println("var: "+var);
//		
//		Optional<Contact> cc = Optional.of(contactRepo.findByname(var));
//		if(cc.isPresent()) {
//			System.out.println("cc : "+cc.get());
//			
//			
//			return cc.get();
//		}
//		else {
//			return null;
//		}
		
	}

}
