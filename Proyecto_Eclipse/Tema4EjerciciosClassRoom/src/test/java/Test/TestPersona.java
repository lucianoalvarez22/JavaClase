package Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Ejercicio1.Empleado;
import Ejercicio1.Persona;

public class TestPersona {
	
	@Test
	public void testClasePersona() throws CloneNotSupportedException {
		
		//Creo Persona 1
		Persona persona1 = new Persona("Juan", "Alvarez", "554567134C", 1994, "Juanito");
		
		
		//Creo Persona 2
		Persona persona2 = new Persona("Juan", "Alvarez", "554567134C", 1994, "Juanito");
		
		
		//Creo Persona 3
		Persona persona3 = new Persona("Luis", "Ruiz", "456789765D", 1999, "Luisito");
		
		//Creo PersonaClon y lo clono con persona3
		Persona personaClon = (Persona) persona3.clone(); 
		
		//Creo persona4 = persona1
		Persona persona4 = persona1;
		
		//USANDO EL CONSTRUCTOR COPIA - Creo persona5 con el constructor de p3 - Son objetos distintos, apuntan a un sitio distinto
		Persona persona5 = new Persona (persona3);
		
		//ASSERT
		assertFalse("Deberia ser falso", persona1==persona2);
		assertFalse("Deberia ser false", personaClon==persona3);
		assertTrue("Deberia ser true", persona4 == persona1);
		assertFalse("Deberia ser false", persona5 == persona3);
		
		//ASSERT CON EQUALS
		
		assertFalse("Deberia ser falso", persona1.equals(persona3));
		assertTrue("Deberia ser true", persona1.equals(persona2));
		assertTrue("Deberia ser true", personaClon.equals(persona3));
		assertTrue("Deberia ser true", persona4.equals(persona1));
		assertFalse("Deberia ser falso", persona4.equals(persona3));
		assertTrue("Deberia ser true", persona5.equals(persona3));
	}
	
	@Test
	public void testClaseEmpleado() throws CloneNotSupportedException {
		
		Persona persona0 = new Persona("Antonio", "Lopez", "4512765D", 1900, "Anto");
		Persona persona1 = new Persona("Antonio", "Lopez", "4512765D", 1900, "Anto");
		Persona persona2 = new Persona("Felipe", "Gutierrez", "4598345D", 1870, "Fel");
		Persona persona3 = new Persona("Mercho", "Fercho", "122765D", 2000, "Fer");
		Persona persona4 = (Persona) persona1.clone();
		Persona persona5 = (Persona) persona2.clone();
		
		
		Empleado emp0 = new Empleado(1, "Administracion", persona0);
		Empleado emp1 = new Empleado(1, "Administracion", persona0);
		Empleado emp2 = new Empleado(2, "Programador", persona1);
		Empleado emp3 = new Empleado(3, "Seguridad", persona3);
		Empleado emp4 = (Empleado) emp1.clone();
		Empleado emp5 = emp2;
		
		//ASSERT
//		assertFalse("Deberia ser false", emp1.getPersona() == emp4.getPersona());
		System.out.println(emp1);
		System.out.println(emp4);
		
		assertFalse("Deberia ser false", emp0==emp1);
		assertFalse("Deberia ser false", emp4==emp1);
		
		//ASSER Y EQUALS
		assertTrue("Deberia ser true", emp0.equals(emp1));
		assertFalse("Deberia ser false", emp0.equals(emp2));
		assertTrue("Deberia ser true", emp5==emp2);
		assertTrue("Deberia ser true", emp4.equals(emp1));
		
	}

}
