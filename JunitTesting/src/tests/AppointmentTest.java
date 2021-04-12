/*
 * @author Katie Stapleton
 * SNHU 320 Testing
 * Module 5 - Milestone
 */

package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AppointmentTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAppointment() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	void testGetApptID() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	void testSetApptDesc() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	void testGetApptDesc() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	void testSetApptDate() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	void testGetApptDate() {
		fail("Not yet implemented"); // TODO
	}

}


/*
 * 	// Test Contact First Name Requirements
	@Test
	@DisplayName("Contact: First Name requirements")
	void testFirstName() {
		assertAll("first name requirements: max 10 ch, not null, required",
				() -> assertTrue("variable".length() <= 10, "First Name is limited to 10 characters maximum"),
				() -> assertNotNull("variable", "First Name cannot be null"), 
				() -> assertFalse("variable".isBlank(), "First Name cannot be blank")
				);
		fail("Not yet implemented"); // TODO
	}

	// Test Contact Last Name Requirements
	@Test
	@DisplayName("Contact: Last Name Requirements")
	void testLastName() {
		assertAll("last name requirements: max 10 ch, not null, required",
				() -> assertTrue("variable".length() <= 10, "Last Name is limited to 10 character maximum"),
				() -> assertNotNull("variable", "Last Name cannot be null"),
				() -> assertFalse("variable".isBlank(), "Last Name caanot be blank")
				);
		fail("Not yet implemented"); // TODO
	}

	// Test Contact Phone Requirements
	@Test
	@DisplayName("Contact: Phone requirements")
	void testPhone() {
		assertAll("phone requirements: exactly 10 ch, not null, required",
				() -> assertEquals(10, "variable".length(), "Phone number must be exactly 10 characters"),
				() -> assertNotNull("variable", "Phone number cannot be null"),
				() -> assertFalse("variable".isBlank(), "Phone number cannot be blank")
				);
		fail("Not yet implemented"); // TODO
	}

	// Test Contact Address Requirements
	@Test
	@DisplayName("Contact: Address requirements")
	void testAddressLimit30ch() {
		assertAll("address requirements: max 30 ch, not null, required",
				() -> assertTrue("variable".length() <= 30, "Address is limited to 30 character maximum"),
				() -> assertNotNull("variable", "Address cannot be null"),
				() -> assertFalse("variable".isBlank(), "Address cannot be blank")
				);
		fail("Not yet implemented"); // TODO
	}*/
