package testPersona;

import org.junit.Test;

import ejercicioMaven.EdadException;
import ejercicioMaven.IMCException;
import ejercicioMaven.Persona;

public class TestJunit {
	
	
	@Test
	public void testSingleSucessTest() {
		Persona persona3 = new Persona("Alexis", 0, "1234567L", "abc", 0, 0);
		
		
		try {
			persona3.esMayorDeEdad();
		} catch (EdadException e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
		}
		
		
		
		
		
		try {
			persona3.dameIMC();
		} catch (IMCException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	
	
	@Test
	public void testSingleSucessTest2() {
	}
	 
}
