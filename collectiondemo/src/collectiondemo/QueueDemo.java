package collectiondemo;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
public static void main(String[] args) {
	Queue<String> queue = new    ArrayDeque<>();
	queue.add("first");
	queue.add("come");
	queue.add("first");
	queue.add("serve");
	
	Iterator<String> iterator = queue.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	
	System.out.println("==============");
	System.out.println(queue.peek());
	
}
}
