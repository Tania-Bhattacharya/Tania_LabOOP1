package LabOOP;

import java.util.Scanner;

public class DriverClass
{
	public static void main(String[] args)
	{
		String fName, lName;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Name: ");
		fName = sc.nextLine();
		
		System.out.println("Enter Last Name: ");
		lName = sc.nextLine();
		
		Employee emp = new Employee(fName, lName);
		
		sc.close();
	}
}
