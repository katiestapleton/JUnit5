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
import java.time.LocalDateTime;

class AppointmentTest {
	
	// Constructors provides data to perform the tests
	//    Appointment(String IDappt, String descAppt, LocalDateTime dateAppt) {
	// check if within requirements
	Appointment apptGood = new Appointment("ID01234567", "Lorem ipsum dolor sit amet consecetur adipisicing", LocalDateTime.now().plusDays(2));
	// check if outside requirements
	Appointment apptBad = new Appointment("0987654321012345", "Aliquid maxime a soluta voluptate minima, suscipit at quam", LocalDateTime.now().minusDays(1));
	// check if outside requirements: null operations 
	Appointment apptNull = new Appointment(null, null, null);

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

	// test appointment ID requirements
	@Test
	@DisplayName("Appointment: ID Requirements")
	void testApptID() {
		assertAll("Appointment ID requirements: unique, max 10ch, not null, required",
				// Unique ID issue: Need to create method to scan through IDs
				// () -> assertNotEquals((contactGood.getContactID()), "Contact ID must be unique"),
				() -> assertTrue((apptGood.getApptID()).length() <= 10, "Appointment ID is limited to 10 characters maximum"),
				() -> assertNotNull(apptGood.getApptID(), "Appointment ID cannot be null"),
				() -> assertFalse((apptGood.getApptID()).isBlank(), "Appointment ID cannot be blank")
				);
		fail("Appointment ID does not meet all requirements");
	}

	// test appointment description requirements
	@Test
	@DisplayName("Appointment: Description Requirements")
	void testApptDesc() {
		assertAll("Appointment description requirements: max 50 ch, not null, required",
				() -> assertTrue((apptGood.getApptDesc()).length() <= 50, "Appointment description is limited to 50 character maximum"),
				() -> assertNotNull(apptGood.getApptDesc(), "Appointment description cannot be null"),
				() -> assertFalse((apptGood.getApptDesc()).isBlank(), "Appointment description cannot be blank")
				);
		fail("Appointment ID does not meet all requirements");
	}


	// test appointment date requirements
	@Test
	@DisplayName("Appointment: Date Requirements")
	void testApptDate() {
		assertAll("Appointment date requirements: cannot be in the past, not null, required",
		// The LocalDateTime is generated. It can be null. Empty/blank testing is not needed
				() -> assertFalse((apptGood.getApptDate().isBefore(LocalDateTime.now())), "Appointment date cannot be in the past. Must be a present or future date/time"),
				() -> assertNotNull(apptGood.getApptDate(), "Appointment date cannot be null")
				);
		
		fail("Appointment ID does not meet all requirements");
	}

}
