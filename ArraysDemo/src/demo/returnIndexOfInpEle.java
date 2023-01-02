package demo;

import java.util.Scanner;

public class returnIndexOfInpEle {
public static void main(String[] args) {
	// enter an element for checking then return the index of the 
	// element if present else return -1
	
	int[] arr= {10,20,30,40,50};
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("enter an element to check");
	int input = scanner.nextInt();
	boolean check = false;
	int present = 0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==input) {
			present=i;
			check = true;
		}
	}
	
	if(check) {
		System.out.println("element is present and the index is:"+present);
	}else {
		System.out.println("element is not present");
	}
}
}
