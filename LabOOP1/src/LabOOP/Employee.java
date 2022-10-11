package LabOOP;

import java.util.Scanner;

public class Employee
{
	public String fName;
	public String lName;
	
	public Employee(String fName, String lName)
	{
		this.fName = fName;
		this.lName = lName;
		generateCredentials();
	}
	
	public String department()
	{
		System.out.println("Please Enter Department from the following\n"
				+ "1. Technical\n"
				+ "2. Admin\n"
				+ "3. Human Resource\n"
				+ "4. Legal");
		
		Scanner sc = new Scanner(System.in);
		int deptCode = sc.nextInt();
		sc.close();
		if(deptCode == 1)
			return "tech";
		else if(deptCode == 2)
			return "adm";
		else if(deptCode == 3)
			return "hr";
		else
			return "leg";
		
	}
	
	private void generateCredentials()
	{
		CredentialService crd = new CredentialService();
		crd.generateEmailAddress(fName, lName, department());
		crd.showCredentials();
	}
}
