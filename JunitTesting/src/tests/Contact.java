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
	
	// contact demographics (CONSTRUCTOR)
	public Contact(String ctID, String ctFirst, String ctLast, String ctPhone, String ctAddress) {
		// contact ID
		ctID = String.valueOf(idGenerator.getAndIncrement());
		this.contactID = ctID;		
		this.firstName = ctFirst;		
		this.lastName = ctLast;
		this.phone = ctPhone;
		this.address = ctAddress;
	}


	// SETTERS AND GETTERS
	// required, uniqueID, max 10ch, not updatable, not null
	// contact ID is NOT updatable. no setter allowed
	public String getContactID() {
		return contactID;
	}
	
	// contact first name: required, max 10 ch, not null
	public void setFirstName(String nameFirst) {
		nameFirst = null;
		this.firstName = nameFirst;
	}
	
	public String getFirstName() {
		return firstName;
	}

	// contact last name: required, == 10 digits, not null
	public void setLastName(String nameLast) {
		nameLast = null;
		this.lastName = nameLast;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	// contact phone number: required, max 10ch, not null
	public void setPhone(String numPhone) {
		numPhone = null;
		this.phone = numPhone;
	}
	
	public String getPhone() {
		return phone;
	}

	// contact address: required, max 30ch, not null 
	public void setAddress(String addressCt) {
		addressCt = null;
		this.address = addressCt;
	}
	
	public String getAddress() {
		return address;
	}

}
