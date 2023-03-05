package testLeerPorTeclado;

import org.junit.Test;

import ejercicioGestionErrores.BlancoException;
import ejercicioGestionErrores.LeerPorTeclado;
import ejercicioGestionErrores.NumeroException;
import ejercicioGestionErrores.SalidaException;
import ejercicioGestionErrores.VocalException;

public class TestEjercicioUnit {
	
	
	@Test
	public void testSingleSucessTest() {
		
		LeerPorTeclado caracter1 = new LeerPorTeclado();
		
		while(true) {
			
		 
		caracter1.getChar();
		
		try {
			caracter1.procesandoCaracter();
		} catch (VocalException e) {
			// VOCAL
			System.out.println(	e.getMessage());
			System.out.println("------------------------------------------------------");
		} catch (NumeroException e) {
			// NUMERO
			System.out.println(	e.getMessage());
			System.out.println("------------------------------------------------------");
		} catch (BlancoException e) {
			// BLANCO
			System.out.println(	e.getMessage());
			System.out.println("------------------------------------------------------");
		} catch (SalidaException e) {
			// SALIDA
			System.out.println(	e.getMessage());
			break;
		}
		
		}
		
	}
	
	
	
	@Test
	public void testSingleSucessTest2() {
	}
	
	}
