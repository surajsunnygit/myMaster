package collectiondemo;

import java.util.HashSet;

public class SetUniquenessByEqualsAndHashCodeBasedOnEmpId {

public static void main(String[] args) {
	Employeee emp1 = new Employeee();
	emp1.setEmpid(1);
	emp1.setEmpName("suraj");
	
	Employeee emp2 = new Employeee();
	emp2.setEmpid(1);
	emp2.setEmpName("suraj");
	
	HashSet<Employeee> set = new HashSet<>();
	set.add(emp1);
	set.add(emp2);
	
	for(Employeee ref:set) {
		System.out.println(ref);
	}
}

}

class Employeee {
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
		Employeee emp=(Employeee)e;
		if(this.getEmpid()==emp.getEmpid()) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return empid;
	}
	
	
}