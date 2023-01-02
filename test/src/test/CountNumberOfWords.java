package test;

import java.util.Scanner;

public class CountNumberOfWords {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter the input string");
	int wordCount=0;
	String inputString = scanner.nextLine();
	
	for(int i=0;i<inputString.length();i++) {
		if(inputString.charAt(i)==' ') {
			wordCount=wordCount+1;
		}
	}
	System.out.println("total number of words"+(wordCount+1));
}
}
