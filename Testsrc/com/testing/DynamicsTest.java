package com.testing;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.engine.execution.ExecutableInvoker;

class DynamicsTest {
	
	@TestFactory
	Collection<DynamicTest> dynamicTests() {
		return Arrays.asList(
				dynamicTest("simple dynamic test", new Executable() {
					@Override
					public void execute() throws Throwable {
						System.out.println("Hello!!!!");
						assertTrue(true);
					}
				}),
				dynamicTest("Exception Executable", new Executable() {
					@Override
					public void execute()throws Throwable {
						throw new Exception("Execution Example");
						
					}
				}));
	}
	
	@BeforeAll
	static void beforeall() {
		System.out.println("Before Every Test Case");
	}
	@AfterAll
	static void afterall() {
		System.out.println("After Every Test Case");
	}
	

}
