package oopslabsol;


import java.util.Scanner;

import CredentialService.CredentialService;
import oppslabsol.models.*;

public class Driver {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the First Name");
		String fname=scan.next();
		System.out.println("Enter the Last Name");
		String lname=scan.next();
		
		Employee emp=new Employee(fname,lname);
		
		
	
	 
    System.out.print("1. Technical\n"
    		+"2. Admin\n"
    		+"3. Human Resource\n"
    		+"4. Legal\n");
    
     int input=scan.nextInt();
     
    String Department="";
     switch(input) {
     case 1: 
    	 Department="Technical";
     	break;
     case 2:
    	Department="Admin";
    	 break;
     case 3:
    	Department="Human Resource";
    	 break;
     case 4:
    	 Department="Legal";
    	 break;
    	 default:
    		 System.err.println("Invalid Selection");
     }
     scan.close();
	
	CredentialService cred= new CredentialService();
	String GeneratedEmail=cred.generateEmailAddress(fname, lname, Department);
	
	String generatedPassword=cred.generatePassword();

	cred.showCredentials(emp, GeneratedEmail, generatedPassword);
	
}
}