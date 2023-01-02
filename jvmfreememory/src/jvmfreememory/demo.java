package jvmfreememory;

public class demo {
public static void main(String[] args) {
	Runtime r = Runtime.getRuntime();
	System.out.println(r.freeMemory());
	System.out.println(r.totalMemory());
}
}
