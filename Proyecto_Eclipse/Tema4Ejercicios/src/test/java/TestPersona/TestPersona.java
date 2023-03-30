package TestPersona;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Tema4Ejercicios.Direccion;
import Tema4Ejercicios.Persona;

public class TestPersona {
	
	@Test
	public void test_persona_class() {
		//Crear persona p1 llamada pepe de 21 años
		Persona p1 = new Persona (21, "Pepe");
		
		// crear persona p2 Jose de 21 años
		Persona p2 = new Persona (21, "Jose");
		
		//Crear otra persona p3 Pepe de 21 años
		Persona p3 = new Persona (21, "Pepe");
		
		//Crear una persona p4 = p1
		Persona p4 = p1;
		
		//Crear un p5 usando el constructor de p1
		Persona p5 = new Persona (p1);
		
		
		//Clonamos p1 en p6
		try {
			Persona p6 = (Persona) p1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		// p1 == p2? false
		assertFalse("Deberia ser false", p1==p2);
		
		// p1 == p3? false
		assertFalse("Deberia ser false", p1==p3);
		
		// p1 == p4? true
		assertTrue("Deberia ser true", p1==p4);
		
		// p2 == p4? false
		assertFalse("Deberia ser false", p2==p4);
		
		// p1 == p5? false
		assertFalse("Deberia ser false", p1==p5);
		
		// p1.equals(p1)? true
		assertTrue("Deberia ser True", p1.equals(p1));
		
		// p1.equals(p2)? false
		assertFalse("Deberia ser False", p1.equals(p2));
		
		// p1.equals(p3)? true
		assertTrue("Deberia ser True", p1.equals(p3));
		
		// p1.equals(p4)? true
		assertTrue("Deberia ser True", p1.equals(p4));
		
		// p2.equals(p4)? false
		assertFalse("Deberia ser False", p2.equals(p4));
		
		// p3.equals(p4)? true
		assertTrue("Deberia ser True", p3.equals(p4));
		
		// p1.equals(p5)? true
		assertTrue("Deberia ser True", p1.equals(p5));
		
		
		
	}
	
	@Test
	public void test_persona_direccion() throws CloneNotSupportedException {
		
		Direccion d1 = new Direccion("resolana", 1, 41001);
		Direccion d2 = new Direccion("ronda triana", 1, 41005);
		Direccion d3 = new Direccion("castilla", 1, 41003);
		Direccion d4 = (Direccion) d1.clone();
		Direccion d5 = d1;
		
		assertFalse("deberia ser false!", d1 == d2);
		assertFalse("deberia ser false!", d1 == d3);
		assertFalse("deberia ser false!", d1 == d4);
		assertTrue("deberia ser true!", d1 == d5);
		assertFalse("deberia ser false!", d1.equals(d2));
		assertTrue("deberia ser true!", d2.equals(d2));
		assertFalse("deberia ser false!", d1.equals(d3));
		assertTrue("deberia ser true!", d1.equals(d4));

		Persona p1 = new Persona(22, "alex");
		Persona p3 = new Persona(22, "pepe");
		Persona p4 = new Persona(22, "manue");
		Persona p5 = (Persona) p1.clone();
		Persona p6 = (Persona) p1.clone();
		
		p1.setDireccion(d1);
		p5.setDireccion(d2);
		p6.setDireccion(d1);
		
		System.out.println(p1);
		
		assertFalse("deberia ser false!", p1.equals(p5));
		assertTrue("deberia ser true", p1.equals(p6));
		
		
	}

}
