package java1point8demo;

import java.util.Scanner;
import java.util.StringJoiner;

public class stringJoinerDemo {
public static void main(String[] args) {
	System.out.println( "enter first string");
	Scanner scanner = new  Scanner(System.in);
	String first = scanner.nextLine();
	System.out.println( "enter second string");
	Scanner secondscanner = new  Scanner(System.in);
	String second = secondscanner.nextLine();
	
	StringJoiner  joiner1 = new StringJoiner(  ":",  "[",  "]");
	joiner1.add(first);
	joiner1.add(second);
	StringJoiner  joiner2 = new StringJoiner(" ?",  "[",  "]");
	joiner2.add(first);
	joiner2.add(second);
	
	System.out.println(joiner1);
	System.out.println(joiner2);
	System.out.println(joiner1.merge(joiner2));
	
}
}
