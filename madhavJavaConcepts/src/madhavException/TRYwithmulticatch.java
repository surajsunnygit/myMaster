package madhavException;

public class TRYwithmulticatch {
public static void main(String[] args) {
	try { 
		int[] arr = new int[] { 0,1};

		
	}
	
	catch (ArithmeticException e) {
		e.printStackTrace();
	}
	catch (NullPointerException e) {
		e.getMessage();
	}
	catch (Exception e) {
		System.out.println(e.getMessage());
	}

}
}
