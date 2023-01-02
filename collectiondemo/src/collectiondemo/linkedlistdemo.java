package collectiondemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class linkedlistdemo {
public static void main(String[] args) {
	LinkedList<Integer> link = new LinkedList<>();
	link.add(2);
	link.add(3);
	link.add(4);
	link.add(5);
	link.add(0, 1);
	link.addLast(6);
	
	LinkedList<Integer> clonelink =(LinkedList<Integer>) link.clone();
	
	Iterator<Integer> itr = link.iterator();

	Iterator<Integer> itrclone = link.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println("==========");
	while(itrclone.hasNext()) {
		System.out.println(itrclone.next());
	}
	
}
}
