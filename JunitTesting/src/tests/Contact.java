package tests;

public class Contact {
	String contactID;
	String firstName;
	String lastName;
	String phone;
	String address;
	
	
	public Contact(String ctID, String ctFirst, String ctLast, String ctPhone, String ctAddress) {
		//contact objects. max character limits (10ch x4, 30ch)
		this.contactID = ctID;
		this.firstName = ctFirst;
		this.lastName = ctLast;
		this.phone = ctPhone;
		this.address = ctAddress;
	}

}

/*
		contactID = "1234567890";
		firstName = "Alexandria";
		lastName = "Hutchinson";
		phone = "8885551111";
		address = "1234 pretium neque placerat St";
*/