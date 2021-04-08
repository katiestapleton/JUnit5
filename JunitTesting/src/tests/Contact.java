/*
 * @author Katie Stapleton
 * SNHU 320 Testing
 * Module 3 - Milestone
 */

package tests;

public class Contact {
	private String contactID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	// contact demographics (constructor)
	public Contact(String ctID, String ctFirst, String ctLast, String ctPhone, String ctAddress) {
		this.contactID = ctID;
		this.firstName = ctFirst;
		this.lastName = ctLast;
		this.phone = ctPhone;
		this.address = ctAddress;
	}


	// contact ID: required, uniqueID, max 10ch, not null, not updatable
	public void setContactID(String IDcontact) {
		
		this.contactID = IDcontact;
	}

	public String getContactID() {
		return contactID;
	}
	
	// contact first name: required, max 10 ch, not null
	public void setFirstName(String nameFirst) {
		this.firstName = nameFirst;
	}
	
	public String getFirstName() {
		return firstName;
	}

	// contact last name: required, == 10 digits, not null
	public void setLastName(String nameLast) {
		this.lastName = nameLast;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	// contact phone number: required, max 10ch, not null
	public void setPhone(String numPhone) {
		this.phone = numPhone;
	}
	
	public String getPhone() {
		return phone;
	}

	// contact address: required, max 30ch, not null 
	public void setAddress(String addressCt) {
		this.address = addressCt;
	}
	
	public String getAddress() {
		return address;
	}

}
