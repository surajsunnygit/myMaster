package test;

import java.util.Scanner;

public class reverseEachWordInString {
public static void main(String[] args) {
	System.out.println("enter some sample string");
	Scanner scanner = new Scanner(System.in); 
	String input = scanner.nextLine();
	
	
	
	String[] splitWord = input.split(" ");
	StringBuffer sb = new StringBuffer();
	
	for(String ref:splitWord) {
	
		for(int i=ref.length()-1;i>=0;i--) {
			sb.append(ref.charAt(i));
			
		}
		sb.append(" ");
	}
	System.out.println("output string :"+sb);
}
}
