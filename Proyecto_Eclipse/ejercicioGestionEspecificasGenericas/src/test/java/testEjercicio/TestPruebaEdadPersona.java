package testEjercicio;

import java.util.Random;

import org.junit.Test;

import ejercicioGestionEspecificasGenericas.AdultoException;
import ejercicioGestionEspecificasGenericas.InfantilException;
import ejercicioGestionEspecificasGenericas.MayorException;
import ejercicioGestionEspecificasGenericas.PruebaEdadPersonas;

public class TestPruebaEdadPersona {

	@Test
	public void testEspecifico() {
		PruebaEdadPersonas persona1 = new PruebaEdadPersonas();

		Random aleatorio = new Random();
		for (int i = 0; i < 100; i++) {
			try {
				persona1.generaExcepcionEdad(aleatorio.nextInt(101));
			} catch (InfantilException e) {
				System.out.println(e.getMessage() + " PERTENECE AL GRUPO INFANTIL");
			} catch (AdultoException e) {
				System.out.println(e.getMessage() + " PERTENECE AL GRUPO ADULTO");
			} catch (MayorException e) {
				System.out.println(e.getMessage() + " PERTENECE AL GRUPO MAYOR");
			}
		}

	}
	
	@Test
	public void segundoTest() {
		PruebaEdadPersonas persona2 = new PruebaEdadPersonas();
		Random number_aleatorio = new Random();
		for (int i = 0; i < 100; i++) {
			try {
				persona2.generaExcepcionEdad(number_aleatorio.nextInt(101));
			}catch(Exception e) {
				System.out.println(" Una excepcion ha sido capturada: " + e.getMessage());
				
				
			}
			
		}
	}

}
