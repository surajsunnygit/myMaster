package collectiondemo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
public static void main(String[] args) {
	List<Integer> list = new ArrayList();
	list.add(1);
	list.add(2);
	list.add(1,5);
	int xhc = list.get(0);
	System.out.println(xhc);
//	System.out.println(list);
//	int[] arr = new int[5];
//	arr[0]=2;
//	
//	System.out.println(arr.length);
//	
//	int autounboxingcheck = list.get(0);
//	System.out.println(autounboxingcheck);
}
}
