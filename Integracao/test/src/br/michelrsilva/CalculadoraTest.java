package br.michelrsilva;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraTest {
	
	@Before
	public void before() {
		System.out.println("before");
	}

	@BeforeClass
	public static void beforeClass() {
		System.out.println("beforeClass");
	}
	
	@Test
	public void somaBasica() {
		Calculadora calc = new Calculadora(1,2);
		assertEquals(3,calc.soma()); 
	}

	@Test
	public void divisaoBasica() {
		Calculadora calc = new Calculadora(8,2);
		assertEquals(3,calc.divisao()); 
	}
	
	@Test(expected=Calculadora.NaoPodeDividirPorZero.class)
	public void divisaoporZero() {
		Calculadora calc = new Calculadora(6,0);
		assertEquals(3,calc.divisao()); 
	}
}

