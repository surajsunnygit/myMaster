package demo;

public class commonElementsIn2Arrays {
public static void main(String[] args) {
	int[] first= {60,90,80,10,20,30,40,50};
	int[] second = {90,80};
	
	int[] common;
	int firstLength = first.length;
	int secondLength = second.length;
	
	if(firstLength<secondLength) {
		common = new int[firstLength];
	}else {
		common = new int[secondLength];
	}
	int k=0;
	for(int i=0;i<firstLength;i++) {
		for(int j=0;j<secondLength;j++) {
			if(first[i]==second[j]) {
				
				common[k]=first[i];
				k++;
			}
		}
	}
	
	for(int ref:common) {
		System.out.println(ref);
	}
}
}
