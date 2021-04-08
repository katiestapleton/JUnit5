/*
 * @author Katie Stapleton
 * SNHU 320 Testing
 * Module 3 - Milestone
 */

package tests;

public class ContactService {

	/* Contacts: contactID, firstName, lastName, phone, address;
	 * string x5. 
	 * max characters: 10ch x4, 30ch
	 */
	
	Contact contact00 = new Contact("", "", "", "", "");
	Contact contact01 = new Contact("0987654321", "Constantin", "Bourdillon", "8885551111", "111 Cras rutrum vehicula sed Rd");
	Contact contact02 = new Contact("ID01234567", "Yamaguchi", "Yoshihiro", "8885552222", "222 Mauris in vulputate quam St");

		
	// create new contact with unique contact ID
	public void createContact() {
		contact00.setContactID("1234567890");
		contact00.setFirstName("Alexandria");
		contact00.setLastName("Clanchetts");
		contact00.setPhone("8885550000");
		contact00.setAddress("000 Phasellus elementum biam Ln");
		//"Alexandria", "Clanchetts", "8885550000"
		
	}
	
	// delete contact using contact ID
	public void deleteContact() {

	}
	
	// update contact info using contact ID.
	// ID is NOT updated
	public void updateContact() {
		
		contact00 = contact01;
	}	
	
}