package clonabledemo;

public class Employee implements Cloneable
{

	public int empid;
	public String empname;
	
	public Employee(int empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	}
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + "]";
	}
	
	public Employee clone() throws CloneNotSupportedException {
		return (Employee) super.clone();
		
	}
}
