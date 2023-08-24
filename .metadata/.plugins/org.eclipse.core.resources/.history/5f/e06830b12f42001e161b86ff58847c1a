package com.eazybytes.school.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import com.eazybytes.school.controller.ContactController;
import com.eazybytes.school.model.Contact;

@Service
//@RequestScope
@SessionScope
public class ContactService {
	private int counter=0;
	
	public ContactService() {
		System.err.println("Contact Service Bean initialized");
	}
	public int getCounter() {
		return counter;
	}
	public void setCounter(int counter) {
		this.counter = counter;
	}
	private static Logger log = LoggerFactory.getLogger(ContactController.class);
	/**
	 * Save contact details into DB
	 * @param contact
	 * @return boolean
	 * */
	public boolean saveMessageDetails(Contact contact) {
		System.out.println("saveMessageDetails");
		boolean isSave = true;
		log.info(contact.toString());
		return isSave;
		
	}
}
