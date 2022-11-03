package Atm;

import java.util.Scanner;


public class AccountHolder {
	public static void main(String[] args) {
		bank b=new AtmMachine();
		System.out.println("WELCOME TO ATM");
		Scanner s =new Scanner(System.in);
		while(true) {
			System.out.println("========================");
		System.out.println("1.DEPOSIT\n2.WITHDRAW\n3.CHECKBALANCE\n4.EXIT");
		System.out.println( "-------------------------------------------");
		System.out.println("Enter your choice");
		System.out.println("=========================");
		int choice =s.nextInt();
		
		switch (choice) {
		case 1: 
			System.out.println("Enter the amount to deposit");
			int amt = s.nextInt();
			b.deposit(amt);
			 
			break;
		case 2: 
			System.out.println("Enter the amount to Withdraw");
			int wdraw = s .nextInt();
			b.withdraw(wdraw);
			 
			break;
			
		case 3: 
			 
			b.checkbalace();
			break;
			 
		case 4: 
			System.out.println("THANK YOU");
			System.exit(0);
			
			default:
				System.out.println("INVALID CHOICE");
			 
		}
	}
	}
}


