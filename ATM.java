package assignment2;

import java.util.Scanner;


public class ATM {
	 private double balance;

	    public void Atm(double initialBalance) {
	       
	    	this.balance = initialBalance;
	    }

	    public void checkBalance() {
	        System.out.println("Your current balance is: $" + balance);
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Successfully deposited $" + amount);
	        } else {
	            System.out.println("Invalid deposit amount. Please enter a positive number.");
	        }
	    }
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Successfully withdrew $" + amount);
	        } else if (amount > balance) {
	            System.out.println("Insufficient funds! Your balance is $" + balance);
	        } else {
	            System.out.println("Invalid withdrawal amount.");
	        }
	    }
	    
	    public static void main(String[] args) {
	        ATM atm = new ATM(); // Initial balance
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("\n===== ATM Menu =====");
	            System.out.println("1. Check Balance");
	            System.out.println("2. Deposit");
	            System.out.println("3. Withdraw");
	            System.out.println("4. Exit");
	            System.out.print("Choose an option: ");

	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1 -> atm.checkBalance();
	                case 2 -> {
	                    System.out.print("Enter deposit amount: ");
	                    double depositAmount = scanner.nextDouble();
	                    atm.deposit(depositAmount);
	                }
	            
	        
	                case 3 -> {
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawAmount = scanner.nextDouble();
                          atm.withdraw(withdrawAmount);
	                }
     
                 case 4 -> {
                            System.out.println("Thank you for using our ATM. Goodbye!");
                                      scanner.close();
                                return;
     }
     default -> System.out.println("Invalid option! Please choose a valid number.");
 }
	        }
	    }
}
