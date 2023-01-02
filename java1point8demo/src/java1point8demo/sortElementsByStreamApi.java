package java1point8demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class sortElementsByStreamApi {
public static void main(String[] args) {
	List<Integer> list = new ArrayList<>();
	list.add(23);
	list.add(15);
	list.add(65);
	list.add(92);
	list.add(1);
	
	Comparator<Integer> comp=(Integer a,Integer b)->(a >b)?-1:(a<b)?1:0;
	
	List<Integer> outputlist = list.stream().sorted(comp).collect(Collectors.toList());
	System.out.println( "sorted list");
	for(Integer ref: outputlist) {
		System.out.println(ref);
	}
	
	System.out.println("min "+list.stream().min(comp));
	list.stream().forEach(i->System.out.println("="+i));
	
	

	
	List<String> listing = new ArrayList<>();
	listing.add("hi");
	listing.add("zhello");
	listing.add("vhow");
	listing.add("r");
	listing.add("uuu");
	Comparator compa = (s1,s2)->
	{
		int s1length = ((String) s1).length();
		int s2length = ((String) s2).length();
		if(s1length > s2length) {
		return 1;
		}else if(s1length <s2length) {
			return -1;
		}else {
			return 0;
		}
		
	} ;
			
			
			
			
	List<String> oup =(List<String>) listing.stream().sorted(compa).collect(Collectors.toList());
	System.out.println(oup);
	} 
}
