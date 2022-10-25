package com.testing;
//Common before or after test access

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.TestInstance.Lifecycle;
@TestInstance(Lifecycle.PER_CLASS)// Individual for every class to be given in order to display for every class
public interface CommonTestInterface {

	@BeforeAll
	default void executeBeforeAll() {
		System.out.println("Interface Before All");
	}
	@AfterAll
	default void executeAfterAll() {
		System.out.println("Interface After All");
	}

}
