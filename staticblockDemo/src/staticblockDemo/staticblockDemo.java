package staticblockDemo;

import java.util.Scanner;

public class staticblockDemo {

	static {
		System.out.println("before start of the user action Iam executing");
		System.out.println("welcome to the bank");
		System.out.println("please select your language");
		System.out.println("1:English 2:telugu 3:hindi");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
	}
	public static void main(String[] args) {
System.out.println("hi iam main");
	}
}
