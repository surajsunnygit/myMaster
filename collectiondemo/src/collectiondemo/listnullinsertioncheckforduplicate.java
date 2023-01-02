package collectiondemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class listnullinsertioncheckforduplicate {
public static void main(String[] args) {
	List list = new ArrayList<>();
	list.add(null);
	list.add(null);
	System.out.println(list);
	
	Set set = new HashSet<>();
	set.add(null);
	set.add(null);
	System.out.println(set);
}
}
