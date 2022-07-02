package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.StringReverse;

public class StringReverseTest {

	@Test
	public void reverseStringTest() {
		assertEquals("avis", new StringReverse().reverseString("siva"));
	}

}
