package collectiondemo;

import java.util.HashSet;

public class SetUniquenessByEqualsAndHashCodeBasedOnName {
public static void main(String[] args) {
	Employee emp1 = new Employee();
	emp1.setEmpid(1);
	emp1.setEmpName("suraj");
	
	Employee emp2 = new Employee();
	emp2.setEmpid(2);
	emp2.setEmpName("suraj");
	
	HashSet<Employee> set = new HashSet<>();
	set.add(emp1);
	set.add(emp2);
	
	for(Employee ref:set) {
		System.out.println(ref);
	}
}
}


class Employee{
	private int empid;
	
	private String empName;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + "]";
	}
	
	public boolean equals(Object e) {
		Employee emp=(Employee)e;
		if(this.getEmpName().equals(emp.getEmpName())) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return empName.hashCode();
	}
	
	
}