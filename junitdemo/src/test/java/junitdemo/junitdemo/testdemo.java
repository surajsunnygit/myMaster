package junitdemo.junitdemo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import junit.framework.TestCase;
import junit.textui.TestRunner;


public class testdemo extends TestCase
{

	@Test
	public void check() {
		String name = "suraj";
		int num = 5;
		assertEquals(name, "suraj");
		assertTrue(num>1);
		
		
	}
	
	@Test
	public void successTest(){
		assertTrue(5<9);
	
	}
	
	@Test
	public void failureTest(){
		assertTrue(5<9);
	
	}
}
