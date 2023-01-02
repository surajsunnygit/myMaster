package clonabledemo;

public class mainclass {
public static void main(String[] args) throws CloneNotSupportedException {
	Employee emp1 = new Employee(1, "suraj");
	System.out.println(emp1);
//	System.out.println("original object");
//	System.out.println(emp1);
//	
//	//Employee emp2 = emp1.clone();
//	Employee emp2 = emp1;
//	System.out.println("cloned object "+emp2);
//	
//	Employee emp3 = emp2;
//	System.out.println("3rd"+emp3);
	
	Employee emp2 = emp1;
	System.out.println(emp2);
	
	emp1.empid=3;
	emp2=emp1;
	
	System.out.println("---"+emp2);
	
	System.out.println("original object");
	System.out.println(emp1);
	
	//Employee emp2 = emp1.clone();
	Employee emp3 =emp1.clone();
	System.out.println("cloned object "+emp3);
	emp1.empid=1000;
	System.out.println(" employee 1"+emp1);
	//Employee emp3 = emp2;
	System.out.println("3rd"+emp3);
}
}
