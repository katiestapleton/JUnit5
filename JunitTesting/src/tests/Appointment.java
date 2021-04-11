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
		if (IDappt.isBlank()) {
			IDappt = null;
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
		
	/*	if (dateAppt.isBlank()) {
			dateAppt = null;
		}
	*/	
		
		/* TASK: compare dates of user input vs local date now (w/ mins)
		 *   user input must be equal or after local date now (w/ mins)
		 *   ALT: local date must be before or equal to user input
		 *   
		 *   if value is not future tense, date is null
		 *   current/future dates are valid
		 *  
		 *  troubleshooter: 
		 *  https://docs.oracle.com/javase/9/docs/api/java/time/class-use/LocalDate.html
		 *  https://stackoverflow.com/questions/42522744/taking-input-using-localdate
		 *  https://beginnersbook.com/2017/10/java-localdate-compareto-method-example/
		 *  https://stackoverflow.com/questions/29201103/how-to-compare-localdate-instances-java-8
		 *  https://www.callicoder.com/how-to-compare-date-time-java/
		 *  
		 *  declare current time and (input) appt date. LocalDate
		 *  create date formatter for pattern
		 *  retrieve input
		 *  change input into appt date
		 *  compare appt date to present date (method)
		 *  use results to calculate outcome. 
		 *  apptDate.compareto(localdate)
		 *  IF results = 0. same day
		 *  IF results > 0. future day
		 *  IF results < 0. past day

LocalDate newDate = dateInput(stringInput("Enter a date (like 3/3/17): "));
public static LocalDate dateInput(String userInput) {

    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
    LocalDate date = LocalDate.parse(userInput, dateFormat);


    System.out.println(date);
    return date ;
}
		 */
		
		//else if (dateAppt IN PAST ) {
			
		//}
		//this.apptDate = dateAppt;
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
	public void setApptDate(LocalDateTime DateAppt) {
		this.apptDate = DateAppt;
	}
	
	public LocalDateTime getApptDate() {
		return apptDate;
	}

}
