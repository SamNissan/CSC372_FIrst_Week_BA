package Bank_Account;

//The BankAccount is a Super Class

public class BankAccount {

    //Creating private data members. The changes to their values only allowed through Setters & Getters.  
	private String  firstName;
	private String   lastName;
	private int     accountID; 
	private double    balance;
	
	//BankcAccount Constructor to initialize the balance Account. This Constructor will help initialize the objects to default value upon creation. 
	
	public BankAccount(int accountID, double balance) {
		
	    this.accountID = 0;
	    this.balance  = 0.0;
		
	  //The "this" keyword will help Java to recognize between the private attributes and the constructor parameters
	    
	} //End of the Initializer Constructor method. 
	
	
	
	
	
	
	
	
	//Deposit method with double type parameter 
	public void deposit (double amount) {
		if(amount == 0 || amount > 0) {
			 
			balance = balance + amount;
		} //End of IF statement.
			
	}  	
/*--------------------End of Deposit Method-----------------------*/
	
	
	
	//Withdrawal method with double type parameter 
	public void withdrawal(double amount) {
		
		if (amount > 0 && amount <= balance) {
	            balance = balance - amount;
	           
	        } //End of IF statement.
		
	} //End of Withdrawal method. 
	
/*--------------------End of Withdrawal Method-----------------------*/	

	
	
/*----------------------Setter AND Getters---------------------*/
	//FirstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
	
  //getFirstName method to return FirstName
    public String getFirstName() {
    	return firstName;
    }
/*-------------------------------------------*/
	
	//LastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
	
  //getLastName method to return lastName
    public String getLastName() {
        return lastName;
    }
/*-------------------------------------------*/  
    
	//AccountID
    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }
	
    //getAccountID method to return AccountID
    public int getAccountID() {
        return accountID;
    }
/*-------------------------------------------*/
	//Balance
    public void setBalance(double balance) {
		this.balance = balance;
	}//End of SetBalance method
    
    
    //Balance Getter to return balance 
    public double getBalance() {
    	return balance;
    	
    } //End of getBalance method. 
   
    
    
/*--------------------accountSummary-----------------------*/  
          
public void accountSummary() {
	
	System.out.println("Account Detail Summary");
	System.out.println("Account Full Name: " + firstName + " " + lastName);
	System.out.println("Account ID: " + accountID);
	System.out.println("Account Blanance: " + String.format("$%.2f", balance));
	
} //End of accountSummary method
 
 
} //End of BankAccount Class 
