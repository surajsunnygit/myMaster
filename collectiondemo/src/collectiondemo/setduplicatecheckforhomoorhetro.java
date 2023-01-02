package collectiondemo;

import java.util.HashSet;
import java.util.Set;

public class setduplicatecheckforhomoorhetro {
public static void main(String[] args) {
	// set checks for uniqueness of heterogenous objects as well
	
	Set set = new HashSet<>();
	set.add("hello");
	set.add(1);
	set.add("hello");
	set.add(1);
	set.add(null);
	set.add(null);
	for(Object ref:set) {
		System.out.println(ref);
	}
}
}
