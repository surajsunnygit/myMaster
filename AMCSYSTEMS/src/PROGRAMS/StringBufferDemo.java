package PROGRAMS;

public class StringBufferDemo {
public static void main(String[] args) {
	// factorial of number using recursion
	// 10*9*----
	int n=10;
	
  
try {
	 
	int output = findingFactorial(10);
	
	System.out.println(output);
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	

	
}
 static int findingFactorial(int n) {
	int N=n;
	int fact=1;
	for(int i=N;i>=1;i--) {
		fact=fact*i;
	}
	return fact;
}
}