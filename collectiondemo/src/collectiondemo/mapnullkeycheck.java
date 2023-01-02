package collectiondemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class mapnullkeycheck {
public static void main(String[] args) {
	
	// value will be overriden for previous duplicate key
	Map<Integer, String> map = new HashMap<>();
	map.put(1, "hello");
	map.put(null,"hi");
	map.put(null, "dwmo");
map.put(1, "SURAJ");	
	map.forEach((k,v) -> System.out.println("Key = "
            + k + ", Value = " + v));
}
}
