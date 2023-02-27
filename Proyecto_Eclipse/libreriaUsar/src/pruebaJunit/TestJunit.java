package pruebaJunit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import libreria.Calculadora;

public class TestJunit {
	
	
	@Test
	public void testSingleSucessTest() {
		System.out.println("Un test");
	}
	
	@Test
	public void testSingleSucessTest2() {
		System.out.println("Un test");
		
		Calculadora c1 = new Calculadora();
		
		assertEquals(2,c1.suma(1,1));
		assertEquals(3,c1.suma(2,1));
		assertEquals(3,c1.suma(1,2));
		assertEquals(0,c1.suma(5,4));
	}
	 
}
