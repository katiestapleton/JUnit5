/*
 * @author Katie Stapleton
 * SNHU 320 Testing
 * Module 3 - Milestone
 */


package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

// Hamcrest is not implemented, hence assertThat does not function
// import static org.hamcrest.CoreMatchers.*;

class ContactTest {

	// Constructors provides data to perform the tests
	// check if within requirements
	Contact contactGood = new Contact("ID01234567", "Yamaguchi", "Yoshihiro", "8885552222", "222 Mauris in vulputate quam St");
    // check if outside requirements
	Contact contactBad = new Contact("0987654321012345", "Allexandriasa", "Bourdilmonsh-Smidth", "888555111100", "111 Cras rutrum vehicula sedtra Road");
	// check if outside requirements: null operations 
	Contact contactNull = new Contact(null, null, null, null, null);
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		// allocation, such as establish server links, communications, connections, files etc
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		// deallocation, as such disconnect connections/system/etc
		// "clean" the system
	}

	@BeforeEach
	void setUp() throws Exception {
	    // methods to run before each case
	}

	@AfterEach
	void tearDown() throws Exception {
		// methods to run after each case, even with exceptions
		// clean after each given case
	}

	// Test Contact ID Requirements
	@Test
	@DisplayName("Contact: Contact ID requirements")
	// Contact Id: required, unique, max 10 characters
	void testContactID() {
		assertAll("contact ID requirements: unique, max 10ch, not null, required",
			// Unique ID issue: Need to create method to scan through IDs
			// () -> assertNotEquals((contactGood.getContactID()), "Contact ID must be unique"),
			() -> assertTrue((contactGood.getContactID()).length() <= 10, "Contact ID is limited to 10 characters maximum"),
			() -> assertNotNull(contactGood.getContactID(), "Contact ID cannot be null"),
			() -> assertFalse((contactGood.getContactID()).isBlank(), "Contact ID cannot be blank")
			);
		fail("Contact ID does not meet all requirements");
	}

	// Test Contact First Name Requirements
	@Test
	@DisplayName("Contact: First Name requirements")
	void testFirstName() {
		
		assertAll("first name requirements: max 10 ch, not null, required",
				() -> assertTrue((contactGood.getFirstName()).length() <= 10, "First Name is limited to 10 characters maximum"),
				() -> assertNotNull(contactGood.getFirstName(), "First Name cannot be null"), 
				() -> assertFalse((contactGood.getFirstName()).isBlank(), "First Name cannot be blank")
				);
		fail("First name does not meet all requirements");
	}

	// Test Contact Last Name Requirements
	@Test
	@DisplayName("Contact: Last Name Requirements")
	void testLastName() {
		assertAll("last name requirements: max 10 ch, not null, required",
				() -> assertTrue((contactGood.getLastName()).length() <= 10, "Last Name is limited to 10 character maximum"),
				() -> assertNotNull(contactGood.getLastName(), "Last Name cannot be null"),
				() -> assertFalse((contactGood.getLastName()).isBlank(), "Last Name caanot be blank")
				);
		fail("Last name does not meet all requirements");
	}

	// Test Contact Phone Requirements
	@Test
	@DisplayName("Contact: Phone requirements")
	void testPhone() {
		assertAll("phone requirements: exactly 10 ch, not null, required",
				() -> assertEquals(10, (contactGood.getPhone()).length(), "Phone number must be exactly 10 characters"),
				() -> assertNotNull(contactGood.getPhone(), "Phone number cannot be null"),
				() -> assertFalse((contactGood.getPhone()).isBlank(), "Phone number cannot be blank")
				);
		fail("Contact's phone number does not meet all requirements");
	}

	// Test Contact Address Requirements
	@Test
	@DisplayName("Contact: Address requirements")
	void testAddressLimit30ch() {
		assertAll("address requirements: max 30 ch, not null, required",
				() -> assertTrue((contactGood.getAddress()).length() <= 30, "Address is limited to 30 character maximum"),
				() -> assertNotNull(contactGood.getAddress(), "Address cannot be null"),
				() -> assertFalse((contactGood.getAddress()).isBlank(), "Address cannot be blank")
				);
		fail("Contact Address does not meet all requirements");
	}

}
