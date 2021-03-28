/**
 * @author Katie Stapleton
 * SNHU 320 Testing
 * Module 4 - Milestone
 * 03/25/2020
 */

    /* task objects + variables:
	String taskID;
	String taskName;
	String taskDesc;
	*/

package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TaskTest {

	// setup for all tests
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	//setup for each test
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}
	
	
	// Tests for task objects
	// test taskID object
	@Test
	void taskIDtest() {
		// task ID is 11 characters
		String taskID = "Task45678901";
		int actualLength = taskID.length();
		int maxLength = 10;
		
		assertAll("task ID",
			// required object. test for unique ID in create task
			() -> assertFalse(taskID.isBlank()),	
			// max 10 characters
			() -> assertFalse(maxLength > actualLength),
			// not null (test for "null")
			() -> assertNotNull(taskID)
		);
		
		fail("Not yet implemented");
	}

	// test taskName object
	// required
	// max 20 ch
	// not null
	@Test
	void taskNameTest() {
		// task name is 21 characters
		String taskName = "Wash and rinse dishes";
		int actualLength = taskName.length();
		int maxLength = 20;
		
		assertAll("task name",
			// required object
			() -> assertFalse(taskName.isBlank()),	
			// max 20 characters
			() -> assertFalse(maxLength > actualLength),
			// not null (test for "null")
			() -> assertNotNull(taskName)
		);
		
		fail("Not yet implemented");
	}
	
	// test taskDesc object
	// required
	// max 50 ch
	// not null
	@Test
	void taskDescTest() {
		String taskDesc = "long 51 character description";
	    // Declared int value instead of writing 51+ character description
		// int actualLength = taskDesc.length();
		int actualLength= 51;
		int maxLength = 50;		
		
		assertAll("task description",
			// required object
			() -> assertFalse(taskDesc.isBlank()),
			// max 50 characters
			() -> assertFalse(maxLength > actualLength),	
			// not null (test for "null")
			() -> assertNotNull(taskDesc)
		);
		
		fail("Not yet implemented");
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
	static void tearDownAfterClass() throws Exception {
	}
	

}
