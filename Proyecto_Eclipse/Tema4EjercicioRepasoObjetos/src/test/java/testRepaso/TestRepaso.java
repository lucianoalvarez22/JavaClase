package testRepaso;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Test;

import tema4Repaso.Persona;
import tema4Repaso.Profesor;
import tema4Repaso.ProfesorInterino;

public class TestRepaso {

	@Test
	public void TestPersona() throws CloneNotSupportedException {

		Persona persona1 = new Persona("Luciano", "Alvarez", 29);
		Persona persona2 = new Persona("Juan", "Vazquez", 18);
		Persona persona3 = new Persona("Alberto", "Duarte", 69);
		Persona persona4 = persona1; // APUNTAN AL MISMO ESPACIO EN MEMORIA
		Persona personaClon = (Persona) persona2.clone();

		Persona persona5 = new Persona(persona3);

		

		// PRUEBAS CON ASSERTS
		assertFalse("Deberia ser Falso", persona1 == persona2);
		assertFalse("Deberia ser Falso", persona1 == persona3);
		assertTrue("Deberia ser True", persona1 == persona4); // APUNTAN AL MISMO ESPACIO EN MEMORIA
		assertFalse("Deberia ser Falso", persona1 == personaClon);
		assertFalse("Deberia ser Falso", persona1 == persona5);

		assertFalse("Deberia ser Falso", personaClon == persona2); // APUNTAN A DISTINTO ESPACIO EN MEMORIA
		assertFalse("Deberia ser Falso", persona5 == persona3); // APUNTAN A DISTINTO ESPACIO EN MEMORIA

		// PRUEBAS CON EQUALS
		assertFalse("Deberia ser falso", persona1.equals(persona2));
		assertFalse("Deberia ser falso", persona1.equals(persona3));
		assertTrue("Deberia ser True", persona1.equals(persona4));
		assertTrue("Deberia ser True", personaClon.equals(persona2));
		assertFalse("Deberia ser falso", personaClon.equals(persona3));
		assertTrue("Deberia ser True", persona5.equals(persona3));
		assertFalse("Deberia ser falso", persona5.equals(persona1));
		
		//CLASE PROFESOR:
		
		Profesor profe1 = new Profesor("1", "Programacion", persona1);
		Profesor profe2=new Profesor("0002","programacion",persona2);
		Profesor profe4=(Profesor)profe1.clone();
		
		assertFalse(profe1==profe2);
		assertFalse(profe1.equals(profe2));
		assertFalse(profe1==profe4);
		assertTrue(profe1.equals(profe4));
		
		Profesor profe3=new Profesor("0003","programacion",persona1);
		assertFalse(profe1==profe3);
		
		//CLASE INTERINO
		
		Date d = new Date(); //TE DEVUELVE LA FECHA DE HOY
		ProfesorInterino pfi1 = new ProfesorInterino(d, profe1);
		ProfesorInterino pfi2 = new ProfesorInterino(d, profe1);
		
		assertFalse(pfi1 == pfi2);
		assertTrue(pfi1.equals(pfi2));
		

	}

}
