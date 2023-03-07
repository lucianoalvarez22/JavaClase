package testLeerPorTeclado;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import ejercicioGestionErrores.BlancoException;
import ejercicioGestionErrores.LeerPorTeclado;
import ejercicioGestionErrores.NumeroException;
import ejercicioGestionErrores.SalidaException;
import ejercicioGestionErrores.VocalException;

public class TestEjercicioUnit {
	
	
//	@Test
//	public void testSingleSucessTest() {
//		LeerPorTeclado caracter1 = new LeerPorTeclado();
//		
//		while(true) {
//			
//		 
//		caracter1.getChar();
//		
//		try {
//			caracter1.procesandoCaracter();
//		} catch (VocalException e) {
//			// VOCAL
//			System.out.println(	e.getMessage());
//			System.out.println("------------------------------------------------------");
//		} catch (NumeroException e) {
//			// NUMERO
//			System.out.println(	e.getMessage());
//			System.out.println("------------------------------------------------------");
//		} catch (BlancoException e) {
//			// BLANCO
//			System.out.println(	e.getMessage());
//			System.out.println("------------------------------------------------------");
//		} catch (SalidaException e) {
//			// SALIDA
//			System.out.println(	e.getMessage());
//			break;
//		}
//		
//		}
//		
//	}
	
	
	
	@Test
	public void testException() {
		//assertEquals(VocalException, caracter2.procesandoCaracter());  //CON ASSERT LLAMAMOS AL METODO QUE QUEREMOS COMPARAR
		
		
		LeerPorTeclado caracter2 = new LeerPorTeclado(); //CREAMOS UN OBJETO DE LA CLASE LEERPORTECLADO
		try {
			caracter2.procesandoCaracter('a'); //LE PASAMOS UNA "A" AL METODO PROCESANDOCARACTER
			assertTrue(false);
		} catch (VocalException e) {
			// TODO Auto-generated catch block
			assertTrue(e.getMessage().contains("Excepcion de vocal"));
		} catch (NumeroException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false);
		} catch (BlancoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false);
		} catch (SalidaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false);
		}
	}
	
	}
