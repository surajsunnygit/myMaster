package PROGRAMS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class COMPARATORDEMO {
public static void main(String[] args) {
	System.out.println("helloo");
	student s1 = new student(1,50);
	student s2 = new student(7,60);
	student s3 = new student(3,30);
	student s4 = new student(2,10);
	List<student> list = new ArrayList<>();
	list.add(s1);
	list.add(s2);
	list.add(s3);
	list.add(s4);
	
	Collections.sort(list, new sortStudentsUsingRollNumber());
	System.out.println("sorting list of students using rollnumber" + list);
	Collections.sort(list, new sortStudentsUsingMarks());
	System.out.println("sorting list of students using marks"+list);
}
}


class sortStudentsUsingRollNumber implements Comparator<student>{

	@Override
	public int compare(student o1, student o2) {
		if(o1.rollnumber>o2.rollnumber) {
			return 1;
		}else if(o1.rollnumber<o2.rollnumber){
			return -1;
		}else {
			return 0;
		}
	}
	
}

class sortStudentsUsingMarks implements Comparator<student>{

	@Override
	public int compare(student o1, student o2) {
		if(o1.marks>o2.marks) {
			return 1;
			
		}else if(o1.marks<o2.marks) {
			return -1;
		}else {
			return 0;
		}
	}
	
}


class student{
	public int rollnumber;
	public int marks;
	public student(int rollnumber, int marks) {
		super();
		this.rollnumber = rollnumber;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "student [rollnumber=" + rollnumber + ", marks=" + marks + "]";
	}
	
	
}