package madhavException;

import java.util.Scanner;

public class userDefinedExceptionDemo {
public static void main(String[] args) {
	int balance = 50000;
	System.out.println("enter amount to withdrawal");
	Scanner scanner = new Scanner(System.in);
	int amount = scanner.nextInt();
	
	if(amount<balance) {
		balance =  balance-amount;
		System.out.println("amount with drawn successfully");
	}else { 
		throw new InsufficientFundsException("requested amount not available in your account");
		//System.out.println("");
	}
}
}
