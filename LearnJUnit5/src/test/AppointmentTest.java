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

class AppointmentTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}
	
	// test appointment ID object
	@Test
	void testApptID() {
		// apptID is 11 characters
		String apptID = "ID123456789";
		String apptID1 = "apptID01";
		String apptID2 = "apptID02";
		int actualLength = apptID.length();
		int maxLength = 10;
		
		assertAll("appointment ID",
			// required object
			() -> assertFalse(apptID1.isBlank()),
			// max 10 characters
			() -> assertFalse(maxLength > actualLength),
			// unique appointment ID
			() -> assertNotEquals(apptID1, apptID2),
			// not null
			() -> assertNotNull(apptID)
		);
		
		fail("Not yet implemented");
	}
	
	// test appointment date object
	@Test
	void testApptDate() {
		
		// appointment dates. TEMP string for test design
		String apptDate0 = "2025/11/27";
		// dates of today and tomorrow
		LocalDate apptDate1 = LocalDate.now();
		LocalDate apptDate2 = apptDate1.minusDays(1);
		
		assertAll("appointment date",
			// required object
			() -> assertFalse(apptDate0.isBlank()),
			// date != past date
			() -> assertFalse(apptDate1.isBefore(apptDate2)),
			// not null
			() -> assertNotNull(apptDate1)
		);
		
		fail("Not yet implemented");
	}
	
	// test appointment description
	@Test
	void testApptDesc() {
		// apptDesc is 51 characters (Lorem ipsum)
		String apptDesc = "Lorem ipsum lacus quis posuere pulvinar vitae dolor";
		int maxLength = 50;
		int actualLength = apptDesc.length();
		
		assertAll("appointment description",
			// required object
			() -> assertFalse(apptDesc.isBlank()),
			// max 50 characters
			() -> assertFalse(maxLength > actualLength),
			// not null
			() -> assertNotNull(apptDesc)
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
