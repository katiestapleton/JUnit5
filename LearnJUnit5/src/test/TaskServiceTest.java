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

	// declare variables needed for testing
	String taskID = "Task4567890";
	String taskName = "Vacuum floor";
	String taskDesc = "Use vacuum to clean the carpet and tile";
	
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
	@Test
	void createTaskTest() {
		String taskID2 = "Task060800"; 
				
		assertAll("create task service",
			// unique task ID (existing ID != new ID)
			() -> assertNotEquals(taskID, taskID2),	
			// required objects: taskID, task name, task description
			() -> assertFalse(taskID.isBlank()),
			() -> assertFalse(taskName.isBlank()),	
			() -> assertFalse(taskDesc.isBlank())
		);
		
		fail("Not yet implemented");
	}
    
	// test for delete task service
	@Test
	void deleteTaskTest() {
		String taskID2 = "Task060800"; 
		
		assertAll("delete task service",
			// cannot find known task via taskID
			() -> assertEquals(taskID, taskID2),	
			// delete: taskID, task name, task description
			() -> assertTrue(taskID.isBlank()),	
			() -> assertTrue(taskName.isBlank()),
			() -> assertTrue(taskDesc.isBlank())
		);
		
		fail("Not yet implemented");
	}
	
	// test for update task service
	@Test
	void updateTaskTest() {
		String taskID2 = "TASK060800";
		String taskName2 = "Remove trash";
		String taskDesc2 = "Take trash bags to trash can";
		
		// taskID is not updatable
		// Expected ID and actual ID should be matching
		// String taskID3 = taskID;
		String taskID3 = "Task4567890";
		
		
		assertAll("update task service",
			// cannot find known task via taskID
			() -> assertEquals(taskID, taskID2),	
			// not updatable object: task ID
			() -> assertNotEquals(taskID, taskID3),	
			// updatable objects: taask name, task description
			() -> assertNotEquals(taskName, taskName2),
			() -> assertNotEquals(taskDesc, taskDesc2)
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
