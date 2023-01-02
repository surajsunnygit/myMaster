package collectiondemo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class listindexremovecheckdemo {
public static void main(String[] args) {
	List<Integer> list = new ArrayList<>();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(5);
	System.out.println("before removing");

		System.out.println(list.get(2));
	
	System.out.println("after removing");
	list.remove(2);
	
		System.out.println(list.get(2));
	System.out.println("=============");
	
	ListIterator<Integer> iteratot1 = list.listIterator();
	while(iteratot1.hasNext()) {
	System.out.println(""+iteratot1.next());
	}
	System.out.println("=======");
		ListIterator<Integer> iteratot = list.listIterator();
		
	/** list ierator will not work for seperator of backward direction we should use same 
		iterator reference of forward iterator for backward iterator also **/
		
		while(iteratot1.hasPrevious()) {
			System.out.println(iteratot1.previous());
		}
}
}
