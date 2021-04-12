/*
 * @author Katie Stapleton
 * SNHU 320 Testing
 * Module 3 - Milestone
 */

package tests;

import java.util.concurrent.atomic.AtomicLong;

public class Contact {
	private final String contactID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	private static AtomicLong idGenerator = new AtomicLong();
	
	
	// contact demographics w/ requirements. CONSTRUCTOR
	// note: null values remain null for data integrity/placeholder
	public Contact(String IDcontact, String nameFirst, String nameLast, String phoneContact, String addressContact) {

		// contact ID generated when constructor is called. unique
		IDcontact = String.valueOf(idGenerator.getAndIncrement());
		this.contactID = IDcontact;	
		
		// first name requirements
		if (nameFirst.isBlank()) {
			nameFirst = null;
		} else if (nameFirst.length() > 10) {
			nameFirst = nameFirst.substring(0,10);
		}
		this.firstName = nameFirst;	
		
		// last name requirements
		if (nameLast.isBlank()) {
			nameLast = null;
		} else if (nameLast.length() > 10) {
			nameLast = nameLast.substring(0,10);
		}
		this.lastName = nameLast;
		
		// phone requirements
		String pattern = "\\d{10}";
		if (phoneContact.isBlank()) {
			phoneContact = null;
		} else if (phoneContact != pattern) {
			phoneContact = "5555555555";
		} 
		this.phone = phoneContact;
		
		//address requirements
		if (addressContact.isBlank()) {
			addressContact = null;
		} else if (addressContact.length() > 10) {
			addressContact = addressContact.substring(0,10);
		}
		this.address = addressContact;
	}


	// SETTERS AND GETTERS
	// contact ID. no setter: computer generated and cannot be changed
	public String getContactID() {
		return contactID;
	}
	
	// first name
	public void setFirstName(String nameFirst) {
		if (nameFirst.isBlank()) {
			nameFirst = null;
		} else if (nameFirst.length() > 10) {
			nameFirst = nameFirst.substring(0,10);
		}
		this.firstName = nameFirst;
	}
	
	public String getFirstName() {
		return firstName;
	}

	
	// last name
	public void setLastName(String nameLast) {
		if (nameLast.isBlank()) {
			nameLast = null;
		} else if (nameLast.length() > 10) {
			nameLast = nameLast.substring(0,10);
		}
		this.lastName = nameLast;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	
	// phone
	public void setPhone(String phoneContact) {
		String pattern = "\\d{10}";
		if (phoneContact.isBlank()) {
			phoneContact = null;
		} else if (phoneContact != pattern) {
			phoneContact = "5555555555";
		} 
		this.phone = phoneContact;
	}
	
	public String getPhone() {
		return phone;
	}

	
	// address
	public void setAddress(String addressContact) {
		if (addressContact.isBlank()) {
			addressContact = null;
		} else if (addressContact.length() > 10) {
			addressContact = addressContact.substring(0,10);
		}
		this.address = addressContact;
	}
	
	public String getAddress() {
		return address;
	}

}
