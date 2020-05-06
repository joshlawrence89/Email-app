package emailApp;

import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String password;
	private int defaultPassowrdLength = 10;
	private String department;
	private String email;
	private int mailBoxCapacity = 500;
	private String altEmail;
	private String companySuffix = "aeycompany.com";

	public Email() {
		
	}

	public Email(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		
		this.department = setDepartment();
		
		this.password = randomPassword(8);
		
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
	}

	private String setDepartment() {
		System.out.println("New worker: " + firstName + ". Department codes:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		
		if(depChoice == 1) {
			return "sales";
		} else if(depChoice == 2) {
			return "development";
		} else if(depChoice == 3) {
			return "accounting";
		} else {
			return "";
		}
	}
		
		private String randomPassword(int length) {
			String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$";
			char[] password = new char[length];
			
			for(int i = 0; i < length; i++) {
				int rand = (int) (Math.random() * passwordSet.length());
				password[i] = passwordSet.charAt(rand);
			}
			return new String(password);
	}
		
		public void setMailBoxCapacity(int capacity) {
			this.mailBoxCapacity = capacity;
		}
		
		public void setAltEmail(String altEmail) {
			this.altEmail = altEmail;
		}
		public void setchangePassword(String password) {
			this.password = password;
		}
		public int getMailBoxCapacity() {
			return mailBoxCapacity;
		}
		public String getAltEmail() {
			return altEmail;
		}
		public String getPassword() {
			return password;
		}
		
		public String showInfo() {
			return "Display Name: " + firstName + " " + lastName +
					"\nCompany Email: " + email +
					"\nMailbox Capacity: " + mailBoxCapacity + "mb";
		}
}
	
