package tests;

public class Contact {
	private String contactID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	
	public Contact(String ctID, String ctFirst, String ctLast, String ctPhone, String ctAddress) {
		//contact objects. max character limits (10ch x4, 30ch)
		this.contactID = ctID;
		this.firstName = ctFirst;
		this.lastName = ctLast;
		this.phone = ctPhone;
		this.address = ctAddress;
	}


	public String getContactID() {
		return contactID;
	}

	public void setContactID(String IDcontact) {
		this.contactID = IDcontact;
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String nameFirst) {
		this.firstName = nameFirst;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String nameLast) {
		this.lastName = nameLast;
	}

	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String numPhone) {
		this.phone = numPhone;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String addressCt) {
		this.address = addressCt;
	}
}
