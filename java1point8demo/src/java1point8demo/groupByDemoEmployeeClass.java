package java1point8demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class groupByDemoEmployeeClass {
public static void main(String[] args) {
	
	// group list of employees by emp name size
	
	Employee emp1 = new Employee(1, "suraj");
	Employee emp2 = new Employee(2, "sunny");
	Employee emp3 = new Employee(3, "sur");
	Employee emp4 = new Employee(4, "sun");
	
	List<Employee> list = new ArrayList<>();
	list.add(emp1);
	list.add(emp2);
	list.add(emp3);
	list.add(emp4);
	
	System.out.println(list.stream().collect(Collectors.groupingBy(Employee->Employee.name.length())));
}
}

class Employee{
	
	public int empid;
	public String name;
	public Employee(int empid, String name) {
		super();
		this.empid = empid;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + "]";
	}
	
	
	
}