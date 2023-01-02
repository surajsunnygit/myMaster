package madhavException;

public class demo {
public static void main(String[] args) {try
{
	System.out.println(10/0);
}
catch(ArithmeticException e)
{
	e.printStackTrace();//name of exception and description along with address
	System.out.println("=============");
	System.out.println(e); // name of exception and description
	System.out.println("============");
	System.out.println(e.getMessage()); //only exception description message
}
}
}