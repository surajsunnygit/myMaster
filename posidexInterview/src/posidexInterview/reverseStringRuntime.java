package posidexInterview;

import java.util.Scanner;

public class reverseStringRuntime {
public static void main(String[] args) {
	//reverse of string
	System.out.println("enter the string");
	Scanner scanner = new Scanner(System.in);
	String input = scanner.nextLine();
	
	for(int i=input.length()-1;i>=0;i--) {
		System.out.print(input.charAt(i));
	}
}
}
