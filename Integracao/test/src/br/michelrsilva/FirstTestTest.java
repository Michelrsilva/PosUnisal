package br.michelrsilva;

import static org.junit.Assert.*;

import org.junit.Test;

public class FirstTestTest {

	@Test
	public void hello() {
		FirstTest test = new FirstTest();
		assertEquals("World", test.hello());
	}

}
