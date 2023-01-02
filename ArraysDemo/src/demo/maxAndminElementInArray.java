package demo;

public class maxAndminElementInArray {
public static void main(String[] args) {
	int max = 0;
	
	int[] arr= {60,90,80,10,20,30,40,50};
	int min = arr[0];
	for(int ref:arr) {
		if(ref>max) {
			max=ref;
		}
	}
	
	System.out.println("max element is   "+max);
	
	for(int ref:arr) {
		if(ref<min) {
			min=ref;
		}
	}
	
	System.out.println("min element is   "+min);
}
}
