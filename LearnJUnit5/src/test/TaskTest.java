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
	// required
	// unique ID
	// max length 10 ch
	// not null
	@Test
	void taskIDtest() {
		fail("Not yet implemented");
	}

	// test taskName object
	// required
	// max 20 ch
	// not null
	@Test
	void taskNameTest() {
		fail("Not yet implemented");
	}
	
	// test taskDesc object
	// required
	// max 50 ch
	// not null
	@Test
	void taskDescTest() {
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
