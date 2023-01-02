package DEMO;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class demo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(9);
		list.add(8);
		list.add(7);
		list.add(6);
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		System.out.println("original list " + " " + list);
		List<Integer> streamoutputforeven = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println("printimg even number");
		Iterator<Integer> itr = streamoutputforeven.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		List<Integer> outputformap = list.stream().map(i -> i * 100).collect(Collectors.toList());
		System.out.println("output for map");
		Iterator i2 = outputformap.iterator();
		while (i2.hasNext()) {
			System.out.println(i2.next());
		}
		System.out.println("=====");
		Stream<Integer> sorted = list.stream().sorted();
		System.out.println(sorted.toList());
	}
}
