package jmeterexample;

import org.junit.Assert;
import org.junit.Test;



public class JmeterExampleTest {
	
	@Test
	public void testdemo1() {
		System.out.println("Junit test case: 1");
		Assert.assertTrue(false);
	}
	
	@Test
	public void testdemo2() {
		System.out.println("Junit test case: 2");
	}
}
