package Bank_Account;

import java.util.Scanner;

public class CheckingAccount extends BankAccount {

    Scanner scr = new Scanner(System.in);
	
	private double interestRate;
	private static final double OVERDRAFT = 30.0;

	//CheckingAccount Constructor
	public CheckingAccount(int accountID, double balance, double interestRate) {
		super( accountID, balance);  //The "super" keyword is to call the BankAccount  Constructor initialized parameters in the Super Class
		this.interestRate = interestRate;
	}
	//End of CheckingAccount Constructor.
	
	


   //Starting processWithdrawal method
	public void processWithdrawal(double amount) {
		
		double currentBalance = super.getBalance();  //define a new local variable name currenBalance and assign it with getBalance in BankAccount base Class.
		
		if (amount <= 0 ) {	
			 System.out.println("The current balance is $ "+ String.format("$%.2f", currentBalance));
	         System.out.println("Please enter an amount greater than 0$");
	         
	         double rightAmount;    //Creating local variable rightAmount after the prompt for correct amount to withdraw
	         System.out.print("Enter the correct amount greater thatn $0 to withdraw: ");
	         rightAmount = scr.nextDouble();
	         processWithdrawal(rightAmount);  //Recalling processWIthdrawal method again.
	         
	        }  //End of IF statement.
		     
		
		else if(amount <= currentBalance) {
			super.setBalance(currentBalance - amount); //modifying the balance in the BankAccount base Class
			currentBalance = super.getBalance();      // Reassign the new balance to the currentBalance 
			
			System.out.println("The availabe amount after withdrawal is: " + String.format("$%.2f", currentBalance));
		    System.out.println();   
		} //End of IF statement
		
		else {
			System.out.println("The new balance in the account is $" + String.format("$%.2f", currentBalance - amount- OVERDRAFT));
			System.out.println("An amount of $" + OVERDRAFT + " overdraft fees has been applied");
			System.out.println("Withdrawal has been successfully processed");
			//return true;
		} //End of Else Statement 
		
	} //End of processWithdrawal method. 


	

    //Start Display Account method 
	
	public void displayAccount() {
		accountSummary();          //invoking from BankAccount
		System.out.println("This account Interest Rate is: " + String.format("%.2f",interestRate )  + "%");
	}//End of disaplayAccount method 
	
		
	
} //End of CheckingAccount Class
