package fr.epita.quiz;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestJunit {
	
	
	
	@AfterClass
	public static void afterAll() {
		System.out.println("After All");
	}
	
	@BeforeClass
	public static void beforAll() {
		System.out.println("Before All");
	}
	
	@After
	public void teardown() {
		System.out.println("After?");
	}
	
	@Before
	public void setup() {
		System.out.println("Before?");
	}
	
	
	@Test
	public void test1() {
		System.out.println("test1");
	    // given: hypothesis, input data
		
		// when: action to test
		
		// then: checking the expected result of the action
		
		// clean: make sure no persistent context is altered by the test
	}

	
	
	@Test
	public void test2() {
		System.out.println("test2");
	    // given: hypothesis, input data
		
		// when: action to test
		
		// then: checking the expected result of the action
		
		// clean: make sure no persistent context is altered by the test
	}
	

}
