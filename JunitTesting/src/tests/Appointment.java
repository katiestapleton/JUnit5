/*
 * @author Katie Stapleton
 * SNHU 320 Testing
 * Module 5 - Milestone
 */

package tests;

import java.util.concurrent.atomic.AtomicLong;
import java.time.LocalDate;

public class Appointment {
    private final String apptID;
    private String apptDesc;
	private LocalDate apptDate;
	private static AtomicLong idGenerator = new AtomicLong();
	
	// appointment information (constructor)
	public Appointment(String IDappt, String apDesc, LocalDate apDate) {
		IDappt = String.valueOf(idGenerator.getAndIncrement());
		this.apptID = IDappt;
		this.apptDesc = apDesc;
		this.apptDate = apDate;
	}


    // appointment ID:  required, uniqueID, max 10ch, not updatable, not null
	// appointment ID is NOT updatable. no setter allowed	
	public String getApptID() {
		return apptID;
	}

    // appointment description: required, 50ch max, not null
	public void setApptDesc(String descAppt) {
		
		this.apptDesc = descAppt;
	}
	
	public String getApptDesc() {
		return apptDesc;
	}

    // appointment date: required, NOT past date, not null
	public void setApptDate(LocalDate DateAppt) {
		
		this.apptDate = DateAppt;
	}
	
	public LocalDate getApptDate() {
		return apptDate;
	}

}
