package emailmaker;

import java.util.Scanner;




public class Email {

	private String firstName = "";
	private String lastName = "";
	private String password = "";
	private String department = "";
	private String email;
	private int mailboxCapacity = 500;
	private int passLength = 8;
	private String alternateEmail = "";
	private String companysuffix = "apple.com";
	
	//create an empty constructor
	
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		System.out.println("Email Created: " + this.firstName + " " + this.lastName);
		
		//get the department... I should make that method private
		this.department = setDepartment();
		//System.out.println("Department: " + this.department);
		
		this.password = randomPassword(passLength);
		//System.out.println("The password is: " + this.password);
		
		this.email = this.firstName.toLowerCase() + this.lastName.toLowerCase() + "@" + this.department + "." + this.companysuffix;
		//System.out.println("Your email is: " + this.email);
		
	}
	
	//ask for department
	
	private String setDepartment() {
		System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n4 for None\nEnter department code:");
		Scanner in = new Scanner(System.in);
		
		int departmentChoice = in.nextInt();
		String ans ="";
		
		switch (departmentChoice) {
			case 1:
				 ans = "sales";
				 break;
				 
			case 2:
				ans= "development";
				break;
			case 3:
				ans= "accounting";
				break;
			default:
				ans = "";
				break;
		}
		
		return ans;
		
		
	}
	
	
	//generate random password
	
	private String randomPassword(int length) {
		String passSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*";
		char[] pass = new char[length];
		
		for (int i=0; i<length; ++i) {
			int rand = (int)( Math.random() * passSet.length() );
			pass[i] = passSet.charAt(rand);
			
		}
		
		return new String(pass);
		
	}
	
	
	
	//set mailbox capacity
	public void setMailBoxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
		
	}
	
	//set alternate email
	public void setAltEmail(String altEmail) {
		this.alternateEmail = altEmail;
		
	}
	
	//change pass
	public void changePass(String pass) {
		this.password = pass;
			
	}
	
	public int getMailBoxCapacity() {
		return this.mailboxCapacity;
	}
	
	public String getAlternateEmail() {
		return this.alternateEmail;
	}
	public String getPass() {
		return this.password;
	}
	
	public String showInfo() {
		return "The information is: " + this.firstName + " " + this.lastName + 
				" Company email: " + this.email + 
				" Mailbox capacity: " + this.mailboxCapacity ;
	}
	
}
