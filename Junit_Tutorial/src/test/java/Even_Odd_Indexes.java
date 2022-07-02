package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.BinaryNumber;

public class Even_Odd_Indexes {

	@Test
	public void evenIndexes() {
		String name = "Rank";
		String actual = new BinaryNumber().test(name);
		String expected  = "Rn ak";
		assertEquals(expected, actual);
	}

}
