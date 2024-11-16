package Bank_Account;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);  //to help getting user input from the keyboard
		
		String firstName;
		String lastName;
		int initaialAccount;
		double interstRate = 2.1;  //Initializing the interest rate. 
		double initialBlance = 0;
		
		System.out.print("Ent your first name: ");
		firstName = input.next();
		System.out.println();
		
		System.out.print("Ent your last name: ");
		lastName = input.next();
		System.out.println();
		
		System.out.print("Ask for or Enter your new Account Number : ");
		initaialAccount = input.nextInt();
		System.out.println();
		
		System.out.print("How much are you giong to deposit today: ");
		initialBlance = input.nextDouble();
		System.out.println();
		
		//Creating an object for BankAccount
		BankAccount newAccount = new BankAccount(initaialAccount, initialBlance); //Passing arguments to BankAccount constructors
		newAccount.setFirstName(firstName);
		newAccount.setLastName(lastName);
		newAccount.setAccountID(initaialAccount);
		newAccount.setBalance(initialBlance);
		System.out.println();
		newAccount.accountSummary();
		
		System.out.println();

		
		
		System.out.print("Do you want to withdraw any amount today? ");
		char answer;
		answer = input.next().charAt(0);
		
		   if (answer == 'y' || answer == 'Y') {
			   
			 //Creating an object for CheckingAccount
			   CheckingAccount account = new CheckingAccount(initaialAccount, initialBlance, interstRate ); // Constructor for CheckingAccount class. The "account" keyword is an object of the CheckingAccount Class Constructor.
				account.setFirstName(firstName);
				account.setLastName(lastName);
				account.setAccountID(initaialAccount);
				account.setBalance(initialBlance);
			   
			   
			    double withdraw;   //Create local variable withdraw
			    System.out.print("Enter the amount you want to withdraw: ");
			    withdraw = input.nextDouble();
			    System.out.println();
			    System.out.print("You want to withrdaw: " + String.format("$%.2f", withdraw) + " Type Yes or No: ");
			    System.out.println();
			    answer = input.next().charAt(0);
			    if (answer == 'y' || answer == 'Y') {
			    	
			    	 account.processWithdrawal(withdraw); //Invoking processWithdrawl method from CheckingAccount subclass. 
			    } //End of IF Statement.
			    	
			    	   
		        System.out.println();
		        account.displayAccount();  //Invoking displayAccount method from CheckingAccount subclass.
			   
		   } //Outer IF-Statment 
		   
		   
		   else {System.out.print("You Selcted NO...Good Bye");}
		
		
		
		
	} //End of main method.


} //End of Main Class
