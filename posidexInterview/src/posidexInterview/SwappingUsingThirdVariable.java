package posidexInterview;

public class SwappingUsingThirdVariable {
public static void main(String[] args) {
	int a=10;
	int b=20;
	System.out.println("numbers before swapping");
	System.out.println(a  +"  "+b );
	int temp;
	
	temp=a;
	a=b;
	b=temp;
	
	System.out.println("number after swapping");
	System.out.println(a  +"  "+b );
}
}
