package emailApp;

import java.util.Scanner;

public class email {

	private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "gleneagle.com";
    

    // constructor receives first and last name
    public email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		// ask for the department
		this.department = setDepartment();
		
		// call random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);
		
		// generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
    }
	

    // get department
    private String setDepartment() {
    	System.out.print("Enter the department\n 1 for sales\n 2 for development\n 3 for accounting \n 0 for none");
    	Scanner keyboard = new Scanner(System.in);
    	int departmentChoice = keyboard.nextInt();
    	
    	if (departmentChoice == 1) {
    		return "sales";
    	}
    	else if (departmentChoice == 2) {
    		return "dev";
    	}
    	else if (departmentChoice == 3) {
    		return "acc";
    	}
    	else {
    		return "nothing";
    	}
    }

    // generate random password
    private String randomPassword(int length) {
    	String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*";
    	char[] password = new char[length];
    	for (int i=0; i<length; i++) {
    		int rand = (int) (Math.random() * passwordSet.length());
    		password[i] = passwordSet.charAt(rand);
    	}
    	return new String(password);
    }
    
    
    // set mailbox capacity
    public void setMailboxCapacity(int capacity) {
    	this.mailboxCapacity = capacity;
    }
    
    // set alt email
    public void setAltEmail(String altEmail) {
    	this.alternateEmail = altEmail;
    	
    }

    // change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName + '\n' + "COMPANY EMAIL: " + email + '\n' + "MAILBOX CAPACITY: " + mailboxCapacity + "mb";
	}
}
