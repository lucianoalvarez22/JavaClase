package TestBiblioteca;

import org.junit.Test;

import tema4Interfaces.Libros;
import tema4Interfaces.Revista;

public class TestBiblioteca {
	
	@Test
	public void TestLibros() {
		Libros libro1 = new Libros (1, "Libro1", 2001, false);
		Libros libro2 = new Libros (2, "Libro2", 2002, false);
		Libros libro3 = new Libros (3, "Libro3", 2003, false);
		Libros libro4 = new Libros (4, "Libro4", 2004, false);
		Libros libro5 = new Libros (5, "Libro5", 2005, false);
		
		//PRESTO LIBRO1
		libro1.prestar();
		//ESTADO DE LIBRO AL PRESTARLO
		System.out.println(libro1.infoEstado()); 
		
		//DEVUELVO LIBRO1
		libro1.devolver();
		//ESTADO DEL LIBRO AL DEVOLVERLO
		System.out.println(libro1.infoEstado());
	}
	
	@Test
	public void TestRevistas() {
		Revista revista1 = new Revista (1, "Revista1", 2001, false, 01);
		Revista revista2 = new Revista (2, "Revista2", 2002, false, 02);
		Revista revista3 = new Revista (3, "Revista3", 2003, false, 03);
		Revista revista4 = new Revista (4, "Revista4", 2004, false, 04);
		Revista revista5 = new Revista (5, "Revista5", 2005, false, 05);
		
		//PRESTAR RESVISTAS
		 revista1.prestar();
		 revista3.prestar();
		 revista5.prestar();
		 
		 //ESTADOS DE REVISTAS PRESTADAS
		 System.out.println(revista1.infoEstado());
		 System.out.println(revista3.infoEstado());
		 System.out.println(revista5.infoEstado());
		 
		 //ESTADO DE REVISTAS QUE NO SE HAN PRESTADO
		 System.out.println(revista2.infoEstado());
		 System.out.println(revista4.infoEstado());
		 
		 //DEVUELVO LIBROS PRESTADOS
		 revista1.devolver();
		 revista3.devolver();
		 revista5.devolver();
		 
		 //VER ESTADOS DE REVISTAS DEVUELTAS
		 System.out.println(revista1.infoEstado());
		 System.out.println(revista3.infoEstado());
		 System.out.println(revista5.infoEstado());
		
	}

}
