
import java.util.Date;

public class Person 
{
	// Variables representing name, sex, and birthday.
	private String name;
	private String sex;
	private Date birthday;

	// Constructor receiving the name, sex, and birth date.
	public Person(String n, String s, Date d)
	{
		name = n;
		sex = s;
		birthday = d;
	}

	// Methods that return various attributes.
	public String getName()
	{	
		return this.name;
	}

	public String getSex()
	{
		return this.sex;
	}

	public Date getBirthday()
	{	
		return this.birthday;
	}

	//Override from Object class
	public String toString() {
		return "Name: " + getName() + ", Sex: " + getSex() + ", Birthday:" + this.birthday.toString();
	}

	// Implement this method!
	public boolean equals(Object other) {
		
		if (this.name == ((Person)other).getName() && this.sex == ((Person)other).getSex() && this.birthday == ((Person)other).getBirthday()) {
			return true;
		}
		
		return false;
		
	}
}
