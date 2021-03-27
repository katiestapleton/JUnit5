/**
 * @author Katie Stapleton
 * SNHU 320 Testing
 * Module 4 - Milestone
 * 03/25/2020
 */

	// Task services:	
	/* add tasks per unique task ID
	 * delete task per task US
	 * Update tasks per task ID: name, description
	 */

package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TaskServiceTest {

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
	
	
	// Tests for task services
	// test for create task service
	// unique ID (existing ID != new ID)
	// required: taskID, taskName, taskDesc
	@Test
	void createTaskTest() {
		
		fail("Not yet implemented");
	}
    
	// test for delete task service
	// cannot find contact via ID
	// delete: taskID, taskName, task Desc
	@Test
	void deleteTaskTest() {
		fail("Not yet implemented");
	}
	
	// test for update task service
	// cannot find contact via taskID
	// not updatable object: taskID
	// update: taskName, task Desc
	@Test
	void updateTaskTest() {
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
