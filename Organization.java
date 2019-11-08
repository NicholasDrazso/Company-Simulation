import java.util.*;



public class Organization {
	
	private String name;
	private Employee[] e;
	
	
	// Constructor that receives the name.
	public Organization(String n) {
		
		this.name = n;
		
	}
	
	// Returns the number of employees belonging to this organization.
	public int getNumberOfEmployees() {
		return e.length;
	}

	// Adds an employee to this organization.	
	public void addEmployee(Employee e) {
		Employee[] temp = new Employee[this.e.length + 1];
		temp[this.e.length + 1] = e;
		this.e = temp;
	}

	// Removes an employee from this organization.
	public void removeEmployee(Employee e) {
		
		Employee[] temp = new Employee[this.e.length - 1];
		
		int k = 0;
		
		for (int i = 0; i < temp.length; i++) {
			if (this.e[i] != e) {
				temp[k] = this.e[i];
				k++;
			}
		}
		
		this.e = temp;
		
	}

	// Returns the name of the organization.
	public String getNameOfOrganization() {	
		
		return this.name;
	}
		
	// Returns true if this Organization object is equal to other.
	// Two organizations are equal if they have the same name and 
	// the same Employees.
	public boolean equals(Object other) {
		
		if (this.name == ((Organization)other).getNameOfOrganization() && this.getNumberOfEmployees() == ((Organization)other).getNumberOfEmployees()) {
			return true;
		}
		
		return false;
	}

	// Returns a String representation of the Organization.
	public String toString() {
		
		String s = "";
		
		for (int i = 0; i < this.e.length; i++) {
			s += this.e[i].getName() + ", ";
		}
		
		return this.name + " employes " + s;
	}
}
