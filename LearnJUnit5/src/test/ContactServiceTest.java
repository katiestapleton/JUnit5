/**
 * @author Katie Stapleton
 * SNHU 320 Testing
 * Module 3 - Milestone
 */

package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


// JUnit Testing for ContactService
class ContactServiceTest {

	String contactID = "ID12345678";
	String firstName = "Charlie";
	String lastName = "Franklin";
	String phone = "8665553579";
	String address = "159 E Main St Springer IL";
	
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


	// Deploy tests for contactServices methods
	
	// test method: add contact
	@Test
	void testCreateContact() {
		String contactID2 = "ID98765432";
		
		assertAll("add contact service",
			// unique ID (existing ID != new ID)
			() -> assertNotEquals(contactID, contactID2),
			// required: contactID, firstName, lastName, phone, address
			() -> assertFalse(contactID.isBlank()),
			() -> assertFalse(firstName.isBlank()),
			() -> assertFalse(lastName.isBlank()),
			() -> assertFalse(phone.isBlank()),
			() -> assertFalse(address.isBlank())
		);
		
		fail("Failed: Exception thrown or not yet implemented");
	}
	
	// test method: delete contact
	@Test
	void testDeleteContact() {
		String contactID2 = "ID98765432";
		
		assertAll("delete contact service",
			// cannot find known contact via contactID
			() -> assertNotEquals(contactID, contactID2),
			// delete: contactID, firstName, lastName, phone, address
			() -> assertTrue(contactID.isBlank()),
			() -> assertTrue(firstName.isBlank()),
			() -> assertTrue(lastName.isBlank()),
			() -> assertTrue(phone.isBlank()),
			() -> assertTrue(address.isBlank())
		);
		
		fail("Failed: Exception thrown or not yet implemented");
	}
	
	// test method: update contact
	@Test
	void testUpdateContact() {
		String contactID2 = "ID98765432";
		String firstName2 = "Jessica";
		String lastName2 = "Sculder";
		String phone2 = "4295556271";
		String address2 = "504 NE Johnson Rd Fields FL";
		
		String contactID3 = "ID98765432";
		
		assertAll("update contact service",
			// cannot find known contact via contactID
			() -> assertNotEquals(contactID, contactID2),
			// not updatable object: contactID
			() -> assertEquals(contactID2, contactID3),
			// updatable objects: firstName, lastName, phone, address
			() -> assertNotEquals(contactID, contactID2),
			() -> assertNotEquals(firstName, firstName2),
			() -> assertNotEquals(lastName, lastName2),
			() -> assertNotEquals(phone, phone2),
			() -> assertNotEquals(address, address2)
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
