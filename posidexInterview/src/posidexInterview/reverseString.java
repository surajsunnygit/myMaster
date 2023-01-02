package posidexInterview;

import java.util.Scanner;

public class reverseString {
public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
   System.out.println("enter string");
   String  str = scanner.nextLine();
   
   for(int i=str.length()-1;i>=0;i--) {
	   System.out.print(str.charAt(i));
   }
}
}


  //employees
  
  //empname,salary>50000
//  PRIMARY _KEY(empid)

  //FORE
  
//  select empname from employees  where  salary> 50000 ;
//  
//  select empname from employees  where  salary=(
//		  select max(salary) from employee);
//  
//  delete from employees  where  empname='';
  
  
  
  