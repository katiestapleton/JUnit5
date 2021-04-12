/*
 * @author Katie Stapleton
 * SNHU 320 Testing
 * Module 5 - Milestone
 */

package tests;

import java.util.concurrent.atomic.AtomicLong;
import java.time.LocalDateTime;

public class Appointment {
    private final String apptID;
    private String apptDesc;
	private LocalDateTime apptDate;
	private static AtomicLong idGenerator = new AtomicLong();
	
		
	// appointment information w/ requirements (constructor)
	// note: null values remain null for data integrity/placeholder
	public Appointment(String IDappt, String descAppt, LocalDateTime dateAppt) {
		// appointment ID generated when constructor is called. unique
		IDappt = String.valueOf(idGenerator.getAndIncrement());
		this.apptID = IDappt;
		
		// appointment description requirements
		if (descAppt.isBlank()) {
			descAppt = null;
		}
		else if (descAppt.length() > 50) {
			descAppt = descAppt.substring(0, 50);
		}
		this.apptDesc = descAppt;
		
		// appointment date 
		LocalDateTime currentTime = LocalDateTime.now();
		Boolean apptBeforeNow = dateAppt.isBefore(currentTime);
		// appointment must be present/future tense
		if (apptBeforeNow == true) {
			apptDate = null;
		}
		this.apptDate = dateAppt;
	}


    // GETTERS AND SETTERS
	public String getApptID() {
		return apptID;
	}

    // appointment description: required, 50ch max, not null
	public void setApptDesc(String descAppt) {	
		if (descAppt.isBlank()) {
			descAppt = null;
		}
		else if (descAppt.length() > 50) {
			descAppt = descAppt.substring(0, 50);
		}
		this.apptDesc = descAppt;
	}
	
	public String getApptDesc() {
		return apptDesc;
	}

    // appointment date: required, NOT past date, not null
	public void setApptDate(LocalDateTime dateAppt) {
		LocalDateTime currentTime = LocalDateTime.now();
		Boolean apptBeforeNow = dateAppt.isBefore(currentTime);
		// appointment must be present/future tense
		if (apptBeforeNow == true) {
			apptDate = null;
		}
		this.apptDate = dateAppt;
	}
	
	public LocalDateTime getApptDate() {
		return apptDate;
	}

}
