/*
 * @author Katie Stapleton
 * SNHU 320 Testing
 * Module 5 - Milestone
 */

package tests;

import java.time.LocalDate;

public class Appointment {
    private String apptID;
    private String apptDesc;
	private LocalDate apptDate;
	
	// appointment information (constructor)
	public Appointment(String apID, String apDesc, LocalDate apDate) {
		this.apptID = apID;
		this.apptDesc = apDesc;
		this.apptDate = apDate;
	}


    // appointment ID:  required, uniqueID, max 10 ch, not null, not updatable
	public void setApptID(String IDappt) {
		
		this.apptID = IDappt;
	}
	
	public String getApptID() {
		return apptID;
	}

    // appointment description: required,
	public void setApptDesc(String descAppt) {
		
		this.apptDesc = descAppt;
	}
	
	public String getApptDesc() {
		return apptDesc;
	}

    // appointment date: required, 
	public void setApptDate(LocalDate DateAppt) {
		
		this.apptDate = DateAppt;
	}
	
	public LocalDate getApptDate() {
		return apptDate;
	}

}
