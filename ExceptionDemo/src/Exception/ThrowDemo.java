package Exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.naming.InsufficientResourcesException;

public class ThrowDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		//TRY WITH RESOURCES
		
//		try(BufferedReader br = new BufferedReader(new FileReader("jhfb.txt"))) {
//		
//		}
		System.out.println("hi throwing user defined exception");
		throw new SurajException("exception thrown by suraj garu");
	}
}
