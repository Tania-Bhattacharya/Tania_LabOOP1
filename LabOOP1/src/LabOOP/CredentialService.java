package LabOOP;

import java.util.Random;

public class CredentialService
{
	public String fName;
	public String lName;
	public String email;
	
	public String generateEmailAddress(String fName, String lName, String dept)
	{
		this.fName = fName;
		this.lName = lName;
		
		return this.email = fName.toLowerCase() + "." + lName.toLowerCase() + "@" + dept + ".abc.com";
	}
	
	protected String generatePassword()
	{
		String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	    String specialCharacters = "!@#$";
	    String numbers = "1234567890";
	    String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
	    Random random = new Random();
	    char[] password = new char[8];
	
	    password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
	    password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
	    password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
	    password[3] = numbers.charAt(random.nextInt(numbers.length()));
	   
	    for(int i = 4; i< 8 ; i++)
	    {
	    	password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
	    }
	    
	    String pwdString = new String(password);
	    return pwdString;
	}
	
	public void showCredentials()
	{
		String password = generatePassword();
		System.out.println("Dear " + fName + " your generated credentials are as follows\n"
				+ "Email --> " + email +"\n"
				+ "Password --> " + password);
	}
}

