package java1point8demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class groupByDemo {
public static void main(String[] args) {
	List<String> list = new ArrayList<>();
	list.add("hi");
	list.add("ih");
	list.add("hello");
	list.add("olleh");
	
	System.out.println(list.stream().collect(Collectors.groupingBy(i->i.length())));
}
}
