

//The Employee class represents an Employee

public class Employee {

	// Fields
	private String name;				// Employee's name
	private String idNumber;			// Employee's ID number
	private String department;			// Employee's department
	private String position;			// Employee's job title		
			
	//constructors
	public Employee()   //default constructor
	{
		name = "Eliezer Gonzalez";
		idNumber = "123456";
		department = "Software Development";
		position = "Programmer";
	}
	//The constructor accepts arguments for the empoyee's name, ID number,
	//department, and job title.
	public Employee(String nam, String id, String dept, String post)
	{
		name = nam;
		idNumber = id;
		department = dept;
		position = post;
	}
	
	//mutator methods - allow us to change the private data of the class
	public void setName(String nam)
	{
		name = nam;
	}
	public void setID(String id)
	{
		idNumber = id;
	}
	public void setDepartment(String dept)
	{
		department = dept;
	}
	public void setPosition(String post)
	{
		position = post;
	}
	
	//accessor methods - allow us to retrieve private data -- can not change the data
	public String getName()
	{
		return name;
	}
	public String getID()
	{
		return idNumber;
	}
	public String getDepartment()
	{
		return department;
	}
	public String getPosition()
	{
		return position;
	}	
}