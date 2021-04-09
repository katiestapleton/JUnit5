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
 // FIX 1: LOCAL DATE is incorrect declaration.
	private LocalDate apptDate;
	private static AtomicLong idGenerator = new AtomicLong();
	
	// FIX 1B: update LocalDate to new object
	// appointment information w/ requirements (constructor)
	// note: null values remain null for data integrity/placeholder
	public Appointment(String IDappt, String descAppt, LocalDate dateAppt) {
		// appointment ID generated when constructor is called. unique
		IDappt = String.valueOf(idGenerator.getAndIncrement());
		this.apptID = IDappt;
		
		// appointment description requirements
		if (IDappt.isBlank()) {
			IDappt = null;
		}
		else if (descAppt.length() > 50) {
			descAppt = descAppt.substring(0, 50);
		}
		this.apptDesc = descAppt;
		
		// FIX 1c: LOCAL DATE is incorrect variable.
		// appointment date requirements
/*
		if (dateAppt.isBlank()) {
			dateAppt = null;
		}
		else if (dateAppt IN PAST ) {
			
		}
		*/
		this.apptDate = dateAppt;
	}


    // GETTERS AND SETTERS
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
