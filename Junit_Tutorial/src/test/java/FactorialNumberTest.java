package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.FactorialNumber;

public class FactorialNumberTest {

	@Test
	public void test() {
		assertEquals(720, new FactorialNumber().factorial(6));
		assertNotEquals(0,  new FactorialNumber().factorial(0) );
	}

	@Test
	public void factorialRecursiveTest() {
		assertEquals(1, new FactorialNumber().factorialRecursive(0));
	}

}
