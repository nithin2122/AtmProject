package Atm;

public class AtmMachine implements bank {
		int balance = 10000;

		@Override
		public void deposit(int amount) {
			 
			 balance += amount;
			 System.out.println("------------------------------------------------------");
			 System.out.println("amount deposited successfully of rupess: "  + amount );
			
		}

		@Override
		public void withdraw(int amount) {
			  
			 balance -=amount;
			 System.out.println("------------------------------------------------------");
			 System.out.println("Amount withdrqw successfully of rupees: "+ amount);
			
		}

		@Override
		public void checkbalace() {
	      System.out.println(balance);
			
		}
		

	}



