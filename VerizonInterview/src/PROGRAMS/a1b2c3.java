package PROGRAMS;

public class a1b2c3 {
public static void main(String[] args) {
	// a1b2c3
	// 012345
	
	String input = "a1b2c3d4e5";

	for(int index=0;index<input.length();index++) {
		if(index%2==1) {
			String num=input.valueOf(index);
			int numoftimes = Integer.parseInt(num);
			
			System.out.println("index number "+numoftimes);
			char ch=input.charAt(numoftimes);
			int numeric = Character.getNumericValue(ch);
			for(int i=1;i<=numeric;i++) {
				System.out.println(input.charAt(index-1));
			}
		}
	}
}
}
