import java.util.*;



public class Employee extends Person {
	
	String job;
	
	// Constructor for the Employee class.
	// Receives the name, sex, birth date, and profession.
	public Employee(String n, String s, Date d, String prof) {
		
		super(n, s, d);
		this.job = prof;
	}
  
	// Returns the employee’s profession, if any.
	public String getProfession() {
		if (this.job != null) {
			return this.job;
		}
		else {
			return "Not Employed";
		}
	}
	
	// Returns true if this Employee object is equal to other. 
	// Two employees are equal if they have the same name, sex, birthdate, and 
	// profession.
	public boolean equals(Object other) {
		
		if (other == null) 
			return false;
		
		if (other instanceof Employee == false) 
			return false;
		
		if ((this.getName() == ((Employee)other).getName()) && (this.getSex() == ((Employee)other).getSex()) && (this.getBirthday() == ((Employee)other).getBirthday()) && (this.getProfession() == ((Employee)other).getProfession())) 
			return true;
		
		else
			return false;
	}
	
	// Returns a string representation of the employee that contains all of
	// their professional and personal attributes.
	public String toString() {
		
		return "This employees name is: " + this.getName() + "\nThis employees sex is: " + this.getSex() + "\nThis employees birthday is: " + this.getBirthday() + "\nThis employees profession is: " + this.getProfession();                  
	}

}
