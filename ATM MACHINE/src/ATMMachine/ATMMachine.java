package ATMMachine;

import java.util.Scanner;

class ATM{
	
	float Balance;
	int PIN = 5674;
	Scanner sc = new Scanner(System.in);
	
	public void checkpin() {
		int attempts = 0;
		while(attempts < 3) {
			System.out.println("Enter Your PIN: ");
			int enterpin = sc.nextInt();
			if(enterpin == PIN) {
				menu();
				return;
			} else {
				System.out.println("Invalid PIN. Try Again");
				attempts++;
			}
		}
	}
		
	
	
	public void menu() {
		System.out.println("1. Check A/C Balance.");
		System.out.println("2. Withdraw Money.");
		System.out.println("3. Deposit Money.");
		System.out.println("4. Exit.");
		System.out.println("Enter Your Choice: ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			checkBalance();
			break;
		case 2: 
			withdraw();
			break;
		case 3:
			deposit();
			break;
		case 4:
			System.out.println("THANK YOU!!");
			return;
		default:
			System.out.println("Enter valid choice!!!");
			menu();
    		break;
		}
	}
	
	public void checkBalance() {
		System.out.println("Balance: " + Balance);
		menu();
	}
	
	public void withdraw() {
		System.out.println("Enter Amount to Withdraw: ");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		if(amount > Balance) {
			System.out.println("Insufficient Balance");
		}
		else {
			Balance = Balance - amount;
			System.out.println("Money Withrawal Successful");
		}
		menu();
	}
	
	public void deposit() {
		System.out.println("Enter the Amount: ");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		Balance = Balance + amount;
		System.out.println("Money Deposited Succesfully!!");
		menu();
	}
}



public class ATMMachine {
	public static void main(String [] args) {
		
		ATM obj = new ATM();
		obj.checkpin();
	}

}
