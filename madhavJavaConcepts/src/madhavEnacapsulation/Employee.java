package madhavEnacapsulation;

public class Employee {

	public int empid;
	
	public String empName;

	public double salary;
	
	
	
	public Employee(int empid, String empName, double salary) {
		//super();
		this(empid,empName);
		this.salary = salary;
		
	}

	public Employee(int empid, String empName) {
		super();
		this.empid = empid;
		this.empName = empName;
	}
	
	

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		if(empid>0) {
		this.empid = empid;
		}
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

	
	
	
}
