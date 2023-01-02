package collectiondemo;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
public static void main(String[] args) {
	// all the entries in the default tree map constructor are sorted according to ascending order of keys
	TreeMap<Integer, String> map = new TreeMap<>();
	map.put(4, "JAVA DEVELOPER");
	map.put(1, "suraj");
	map.put(3, "a");
	map.put(2, "is");
	
	Set<Integer> keys = map.keySet();
	
	for(Integer ref:keys) {
		System.out.println("key  "+ref +" ----"+  map.get(ref));
	}
			
	
}
}
