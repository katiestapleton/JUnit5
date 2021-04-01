/**
 * @author Katie Stapleton
 * SNHU 320 Testing
 * Module 5 - Milestone
 * 03/31/2020
 */

package main.java.model;

import java.time.LocalDate;

public class AppointmentService {

	Appointment appt = new Appointment();
	
	String apptID1 = "apptID01";
	String apptID2 = "apptID02";
	String apptDesc = "Appt description";
	LocalDate apptDate1 = LocalDate.now();
	LocalDate apptDate2 = apptDate1.plusDays(1);
	
	
	// add appointment using appointment ID
	public void CreateAppt() {
	}
	
	// delete appointment using appointment ID
	public void DeleteAppt() {
	}


}
