/*
 * @author Katie Stapleton
 * SNHU 320 Testing
 * Module 4 - Milestone
 */

package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class TaskTest {
	
	// Constructors provides data to perform the tests
	//     Task(String IDtask, String nameTask, String descTask)
	// check if within requirements
	Task taskGood = new Task("ID01234567", "Ipsam adipisci magam", "Lorem ipsum dolor sit amet consectetur adipisicing");
	// check if outside requirements
	Task taskBad = new Task("0987654321012345", "corporis voluptate exercitationem", "Aliquid maxime a soluta voluptate minima, suscipit at quam");
	// check if outside requirements: null operations 
	Task taskNull = new Task(null, null, null);

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

	// test Task ID requirements
	@Test
	@DisplayName("Task: ID Requirements")
	void testTaskID() {
		assertAll("Task ID requirements: unique, max 10ch, not null, required",
				// Unique ID issue: Need to create method to scan through IDs
				// () -> assertNotEquals((contactGood.getContactID()), "Contact ID must be unique"),
				() -> assertTrue((taskGood.getTaskID()).length() <= 10, "Task ID is limited to 10 characters maximum"),
				() -> assertNotNull(taskGood.getTaskID(), "Task ID cannot be null"),
				() -> assertFalse((taskGood.getTaskID()).isBlank(), "Task ID cannot be blank")
				);
		fail("Task ID does not meet all requirements");
	}

    // test Task name requirements
	@Test
	@DisplayName("Task: Name Requirements")
	void testTaskName() {
		assertAll("Task description requirements: max 20 ch, not null, required",
				() -> assertTrue((taskGood.getTaskName()).length() <= 20, "Task description is limited to 20 character maximum"),
				() -> assertNotNull(taskGood.getTaskName(), "Task description cannot be null"),
				() -> assertFalse((taskGood.getTaskName()).isBlank(), "Task description cannot be blank")
				);
		fail("Task name does not meet all requirements");
	}

    // test Task Description requirements
	@Test
	@DisplayName("Task: Description Requirements")
	void testTaskDesc() {		
		assertAll("Task description requirements: max 50 ch, not null, required",
				() -> assertTrue((taskGood.getTaskDesc()).length() <= 50, "Task description is limited to 50 character maximum"),
				() -> assertNotNull(taskGood.getTaskDesc(), "Task description cannot be null"),
				() -> assertFalse((taskGood.getTaskDesc()).isBlank(), "Task description cannot be blank")
				);
	   fail("Task Description does not meet all requirements");
	}

}
