package testRepaso;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import tema4Repaso.Persona;
import tema4Repaso.Profesor;

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

	}

	@Test
	public void TestProfesor() throws CloneNotSupportedException {

		Profesor profe1 = new Profesor("1", "Programacion", "Luis", "Velarde", 9);
		Profesor profe2 = new Profesor("2", "Sistemas", "Iker", "Obando", 49);
		Profesor profe3 = new Profesor("3", "Base de Datos", "Carmen", "Leal", 27);
		Profesor profe4 = profe1;
		Profesor profeClon = (Profesor) profe3.clone();
		Profesor profe5 = new Profesor(profe1);

	}

}
