/*
 * @author Katie Stapleton
 * SNHU 320 Testing
 * Module 3 - Milestone
 */

package tests;

import java.util.ArrayList;

public class ContactService {

	
	// stores contacts 
	ArrayList<Contact> contactList = new ArrayList<Contact>();
	/* Contacts: contactID, firstName, lastName, phone, address
	 * string x5. 
	 * max characters: 10ch x4, 30ch
	 */
	

	
	// create new contact with unique contact ID
	public void createContact(String contactID, String firstName, String lastName, String phone, String address) {
       Contact contact = new Contact(contactID, firstName, lastName, phone, address);
       contactList.add(contact);
	}
	
	// read (without user displays)
	public void readContact() {
		
	}
	
	// delete contact using contact ID
	public void deleteContact(String contactID) {
		int i;
		for (i = 0; i < contactList.size(); i++) {
		
		
		contactList.remove(i);
		break;
		}
		if((i+1) == contactList.size()) {
			
		}
	}
	
	// update contact info using contact ID.
	// ID is NOT updated
	public void updateContact() {

	
	}
	
	// error checking for full contact list
	/*
	 * for (int index) {
	 
	 //Display the full list of contacts to the console for error checking.
public void displayContactList() {
for(int counter = 0; counter < contactList.size(); counter++) {
System.out.println("\t Contact ID: " + contactList.get(counter).getContactID());
System.out.println("\t First Name: " + contactList.get(counter).getFirstName());
System.out.println("\t Last Name: " + contactList.get(counter).getLastName());
System.out.println("\t Phone Number: " + contactList.get(counter).getNumber());
System.out.println("\t Address: " + contactList.get(counter).getAddress() + "\n");
}
	 
	 EXTRA STUFF
	 	
	//Contact contact00 = new Contact("", "", "", "", "");
	Contact contact01 = new Contact("0987654321", "Constantin", "Bourdillon", "8885551111", "111 Cras rutrum vehicula sed Rd");
	Contact contact02 = new Contact("ID01234567", "Yamaguchi", "Yoshihiro", "8885552222", "222 Mauris in vulputate quam St");
		String original = contact02.getContactID();
		String update = contact02.getContactID();
		
		contact02.setFirstName("Yamaguchi");
		contact02.setLastName("Yoshihiro");
		contact02.setPhone("8885552222");
		contact02.setAddress("222 Mauris in vulputate quam St");
				String original = contact01.getContactID();
		String delete = contact01.getContactID();
		
		contact01.setFirstName("");
		contact01.setLastName("");
		contact01.setPhone("");
		contact01.setAddress("");
		
				Contact contact00 = new Contact("", "", "", "", "");
		
		String original = contact00.getContactID();
		String update = contact01.getContactID();
		
		contact00.setFirstName("Alexandria");
		contact00.setLastName("Clanchetts");
		contact00.setPhone("8885550000");
		contact00.setAddress("000 Phasellus elementum biam Ln");
		
	}
		
	}*/
	
}