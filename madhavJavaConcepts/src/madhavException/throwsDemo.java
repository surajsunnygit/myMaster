package madhavException;

import java.io.FileNotFoundException;

public class throwsDemo {
public static void main(String[] args) throws FileNotFoundException {
	do1();
}

public static void do1() throws FileNotFoundException {
	// TODO Auto-generated method stub
	do2();
}

public static void do2() throws FileNotFoundException {
	// TODO Auto-generated method stub
	throw new FileNotFoundException("hi");
}
}
