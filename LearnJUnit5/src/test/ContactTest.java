/**
 * @author Katie Stapleton
 * SNHU 320 Testing
 * Module 3 - Milestone
 * 03/21/2020
 */

/* Contact objects/variables:
	String contactID;
	String firstName;
	String lastName;
	String phone;
	String address;
*/	
package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// JUnit Testing for Contact objects
class ContactTest {
	
	// setup for all tests
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeTest() throws Exception {
	}

	
    //setup for each test
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}


	// Tests for contact objects
	// test contactID object
	@Test
	void testContactID() {
		// contactID - 11 characters
		String contactID = "ID123456789";
		int actualLength = contactID.length();
		int maxLength = 10;
		
		assertAll("contact ID",
			// required object
			() -> assertFalse(contactID.isBlank()),
		    // more than 10 characters
			() -> assertFalse(maxLength < actualLength),
		    // not null (test for "null")
			() -> assertNotNull(contactID)
		);
		
		fail("Failed: Exception thrown or not yet implemented");
	}
	
	// test first name object
	@Test
	void testFirstName() {
		// first name - 11 characters
		String firstName = "Alexandrias";
		int actualLength = firstName.length();
		int maxLength = 10;
		
		assertAll("first name",
			// required object
			() -> assertFalse(firstName.isBlank()),
			// more than 10 characters
			() -> assertFalse(maxLength < actualLength),
			// not null
			() -> assertNotNull(firstName)	
		);
		
		fail("Failed: Exception thrown or not yet implemented");
	}
	
	// test last name object
	@Test
	void testLastName() {
		// last name - 11 characters
		String lastName = "DeCoronados";
		int actualLength = lastName.length();
		int maxLength = 10;
		
		assertAll("last name",
			// required object
			() -> assertFalse(lastName.isBlank()),
			// more than 10 characters
			() -> assertFalse(maxLength < actualLength),
			// not null
			() -> assertNotNull(lastName)
		);
		
		fail("Failed: Exception thrown or not yet implemented");
	}
	
	// test phone object
	@Test
	void testPhone() {
		// phone - 10 characters
		String phone = "8665553579";
		int actualLength = phone.length();
		int expectedLength = 10;
		
		assertAll("phone",
			// required object
			() -> assertFalse(phone.isBlank()),
			// not equal to --exactly-- 10 digits
			() -> assertEquals(expectedLength, actualLength),
			// not null
			() -> assertNotNull(phone)
		);
		
		fail("Failed: Exception thrown or not yet implemented");
	}
	
	// test address object
	@Test
	void testAddress() {
		// address - 31 characters
		String address = "2573 SW Main St Jacksonville NH";
		int actualLength = address.length();
		int maxLength = 30;
		
		assertAll("address",
			// required object
			() -> assertFalse(address.isBlank()),
			// more than 30 characters
			() -> assertFalse(maxLength < actualLength),
			// not null
			() -> assertNotNull(address)
		);
		
		fail("Failed: Exception thrown or not yet implemented");
	}
	
	
	//tear down each test
	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}
	
	
	//tear down all tests
	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterTest() throws Exception {
	}
	
}
