package stringimmutabilitySCPconcept;

public class demo {
public static void main(String[] args) {
	String s1="hello";
	String s2=s1;
	String s3 = s1;
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	s1="hi";
	s2=s1;
	s3=s1;
	s1.concat("hy");
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);	
}
}
