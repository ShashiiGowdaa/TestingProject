package com.testing;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
//import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.Test;

//To be used in order to reduce the memory size
class CalculatorTest implements CommonTestInterface{
	
	static Calculator c;
	
	@BeforeAll
	static void execBeforeAll()
	{
		c=new Calculator();
	}
	
	@BeforeEach
	void execBefore()
	{
		System.out.println("For every Test case: Before");
	}
	
	@AfterEach
	void execAfter()
	{
		System.out.println("For every Test case: After");
	}

	@RepeatedTest(3) // Repetition 
	//@Disabled // skips one test case eg: sum in this
	@Test //if not written not be considered as test cases
	@ParameterizedTest()
	//@CsvSource(ints= {3,6},{6,9}, {12,15})
	void sumTest(int a, int b)
	{
		//Calculator c= new Calculator();
		int actualResult= c.sum(10, 20);
		int expectedResult=30;
		
		assertEquals(expectedResult,actualResult); //Gives the solution
		
	}
	
	@Test
	void difTest()
	{
		//Calculator c= new Calculator();
		int actualResult= c.dif(10, 20);
		int expectedResult=-10;
		
		assertEquals(expectedResult,actualResult); //Gives the solution
		
	}
	
	@Test
	void mulTest()
	{
		//Calculator c= new Calculator();
		int actualResult= c.mul(10, 20);
		int expectedResult=200;
		
		assertEquals(expectedResult,actualResult); //Gives the solution
		
	}
	
	@Test
	@ParameterizedTest()
	@ValueSource (ints= {1,2,3,4,5})
	void divTest(int deno)
	{
		//Calculator c= new Calculator();
		int actualResult= c.div(10, deno);
		//int expectedResult=0;
		System.out.println(actualResult);
		//assertEquals(expectedResult,actualResult); //Gives the solution
		
	}
	
	@Test
	void divNegativeTest()
	{
		
		assertThrows(ArithmeticException.class, new Executable() { //condition needed to be written for throwing an exceptions
			
			@Override
			public void execute() throws Throwable{
				c.div(10, 0);
			}
		});
	}
	
	@Test
	void tryAssumptions()
	{
		System.out.println("Start");
			Assumptions.assumeTrue(10<1);
		System.out.println("End");
	}
	
}
