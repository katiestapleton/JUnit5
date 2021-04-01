/**
 * @author Katie Stapleton
 * SNHU 320 Testing
 * Module 5 - Milestone
 * 03/31/2020
 */

package test;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppointmentServiceTest {

	// declare variables needed for testing
	String apptID1 = "apptID01";
	String apptID2 = "apptID02";
	String apptDesc = "Appt description";
	String apptDate0 = "2025/11/27";
	// dates of today and tomorrow
	LocalDate apptDate1 = LocalDate.now();
	LocalDate apptDate2 = apptDate1.minusDays(1);
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}
	
    // test method: create appointment service
	@Test
	void testCreateAppt() {
		
		assertAll("add appointment service",
			// check if appointment ID is unique
			() -> assertNotEquals(apptID1, apptID2),
			// required: apptID, apptDate, apptDesc
			() -> assertFalse(apptID1.isBlank()),
			() -> assertFalse(apptDate0.isBlank()),
			() -> assertFalse(apptDesc.isBlank()),
			// appointment date != past date
			() -> assertFalse(apptDate1.isBefore(apptDate2))
		);
		
		fail("Not yet implemented");
	}
	
    // test method: delete appointment service
	@Test
	void testDeleteAppt() {
		
		assertAll("delete appointment service",
			// find known contact via appointmentID
			() -> assertEquals(apptID1, apptID2),
			// delete: apptID, apptDate, apptDesc
			() -> assertTrue(apptID1.isBlank()),
			() -> assertTrue(apptDate0.isBlank()),
			() -> assertTrue(apptDesc.isBlank())
		);
		
		fail("Not yet implemented");
	}
	
	@AfterEach
	void tearDown() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

}
