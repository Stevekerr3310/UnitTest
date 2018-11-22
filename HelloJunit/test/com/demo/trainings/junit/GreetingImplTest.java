package com.demo.trainings.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.demo.trainings.junit.Greeting;
import com.demo.trainings.junit.GreetingImpl;

public class GreetingImplTest {
	
	private Greeting greeting;

	@Before
	public void setup() {
		System.out.println("Setup");
		greeting = new GreetingImpl();
	}

	@Test
	public void greetShouldReturnValidOutput() {
		System.out.println("greetShouldReturnValidOutpu");
		String result = greeting.greet("Junit");
		assertNotNull(result);
		assertEquals("Hello Junit", result);
	}

	@Test(expected = IllegalArgumentException.class)
	public void greetShouldThrowAnException_For_NameIsNull() {
		System.out.println("greetShouldThrowAnException_For_NameIsNull");
		greeting.greet(null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void greetShouldThrowAnException_For_NameIsBlank() {
		System.out.println("greetShouldThrowAnException_For_NameIsBlank");
		greeting.greet("");
	}
	
	@After
	public void tearDown() {
		System.out.println("tearDown");
		greeting = null;
	}
}
