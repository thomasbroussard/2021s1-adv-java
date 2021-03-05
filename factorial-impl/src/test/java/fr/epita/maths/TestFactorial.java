package fr.epita.maths;

import org.junit.Assert;
import org.junit.Test;

public class TestFactorial {

	
	@Test
	public void test() throws Exception {
		//given a FactorialImplementation instance
		FactorialImplementation instance = new FactorialImplementation();
		
		//when we try a passing value
		int factorialResult = instance.calculate(5);
		
		//then
		Assert.assertEquals(120, factorialResult);
	}
	
	
	@Test
	public void testNonPassing() throws Exception {
		//given a FactorialImplementation instance
		FactorialImplementation instance = new FactorialImplementation();
		
		//when we try a passing value
		try {
			instance.calculate(-5);
		}catch(IllegalArgumentException ex) {
			return;
		}
		
		//then
		Assert.fail();
	}
	
}
