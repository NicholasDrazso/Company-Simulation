import java.util.*;



public class CEO extends Person {
	
	Organization org;
	Employee[] e;
	
	// Constructor for the CEO class.
	// Receives the name, sex, birth date, and Organization
	// which the CEO operates. 
	public CEO(String n, String s, Date d, Organization o) {
		super(n, s, d);
		this.org = o;
	}
  
	
	// Returns the String representation of the Organization for which the
	// CEO works, if any.
	public String getOrganization() {
		if (this.org != null) {
			return this.org.toString();
		}
		else {
			return "Not Employed";
		}
	}
	
	// Returns true if this CEO object is equal to other. 
	// Two CEOs are equal if they have the same name, sex, birthdate, 
	// and organization.
	public boolean equals(Object other) {
		
		if (other == null) 
			return false;
		
		if (other instanceof CEO == false) 
			return false;
		
		if ((this.getName() == ((CEO)other).getName()) && (this.getSex() == ((CEO)other).getSex()) && (this.getBirthday() == ((CEO)other).getBirthday()) && (this.getOrganization() == ((CEO)other).getOrganization())) 
			return true;
		
		else
			return false;
		
	}
	
	// Returns a string representation of the CEO that contains all of
	// their professional and personal attributes.
	public String toString() {	
		return "CEO's name is: " + this.getName() + "\nCEO's sex is: " + this.getSex() +  "\nCEO's birthday is: " + this.getBirthday() + "\nCEO of: " + this.getOrganization();
			           			
	}

	// Removes the given Employee from the organization.
	public void fire(Employee e) {
	
		this.org.removeEmployee(e);
	}

	// Associates the given Employee with the CEO's organization.
	public void hire(Employee e) {
	
		this.org.addEmployee(e);
	}
	
	
}
