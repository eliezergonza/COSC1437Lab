
// Eliezer Gonzalez

import javax.swing.JOptionPane;


public class Company {
	
	public static void main(String[] args) {
		//Declare variables
		Employee employee1;			//To hold default employee
		Employee employee2;			//To hold the second employee
		String employeeN,			//To hold the employee's name
			   idN,					//To hold the ID number
			   dept,				//To hold the employee's department
			   post;				//To hold the employee's job title
		
		//Create an Employee object using the default values
		employee1 = new Employee();
		
		//Display the original values of the first employee
		System.out.println("The default employee information is as follows:");
		System.out.println("Name: " + employee1.getName());
		System.out.println("ID Number: " + employee1.getID());
		System.out.println("Department: " + employee1.getDepartment());
		System.out.println("Position: " + employee1.getPosition());
		
		//Ask the user for input
		//Get the employee's name
		employeeN = JOptionPane.showInputDialog("Enter the employee's name:");	
		//Get the employee's ID number
		idN = JOptionPane.showInputDialog("Enter the employee's ID number:");
		//Get the employee's department
		dept = JOptionPane.showInputDialog("Enter the employee's department:");
		//Get the employee's job title
		post = JOptionPane.showInputDialog("Enter the employee's position:");		
		
		//Use the user's input to create an new Employee object,
		//passing the data that was entered as arguments to the constructor
		employee2 = new Employee(employeeN, idN, dept, post);

		//Display the information of the new employee
		System.out.println("\nThe employee information you entered is as follows:");
		System.out.println("Name: " + employee2.getName());
		System.out.println("ID Number: " + employee2.getID());
		System.out.println("Department: " + employee2.getDepartment());
		System.out.println("Position: " + employee2.getPosition());
		
		System.exit(0);
	}
}
