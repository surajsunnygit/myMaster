package collectiondemo;

import java.util.Iterator;
import java.util.Stack;


public class stackdemo {
	public static void main(String[] args) {
		//  stack follows last in first out 
		
		Stack<String> stack = new Stack<>();
		
		stack.push( "Good");
		stack.push( "better");
		stack.push( "best");
		stack.push("last");
		stack.push("in");
		stack.push("first");
		stack.push("out");
		 Iterator<String> iterator = stack.iterator();
		
		 System.out.println( "printing peek elements");
		 System.out.println(stack. peek() );
		System.out.println( "=================");
		 Iterator<String> iterator1 = stack.iterator();
		 while (iterator1.hasNext()) {
			 System.out.println(iterator1.next());
		 }
		 System.out.println("===========");
		 stack.pop();
		 System.out.println( "=================");
		 Iterator<String> iterator3 = stack.iterator();
		 while (iterator3.hasNext()) {
			 System.out.println(iterator3.next());
		 }
		 
	}

}
