package testRepasoInterfazDos;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import interfacesRepaso2.Mensaje;

public class TestInterfaz {
	
	@Test
	public void InterfazRepasoDos() {
		//CREO EL OBJETO
		Mensaje m1 = new Mensaje("Prueba de interfaz");
		//LEO EL MENSAJE DEL OBJETO CREADO
		System.out.println(m1.leerMensaje());
		
		//CAMBIO EL MENSAJE - VUELVO A LEER EL MENSAJE - Y EL METODO TO STRING PARA VER LA PRIORIDAD TAMBIEN QUE DEBERIA SER NORMAL
		m1.cambiarMensaje("Cambio de mensaje");
		System.out.println(m1.leerMensaje());
		System.out.println(m1.toString());
		
		//CAMBIO LA PRIORIDAD AL MENSAJE  Y VUELVO A COMPROBAR CON EL TO STRING
		m1.cambiarPrioridadAlta();
		System.out.println(m1.toString());
		
		//CAMBIO LA PRIORIDAD AL MENSAJE  Y VUELVO A COMPROBAR CON EL TO STRING
		m1.cambiarPrioridadBaja();
		System.out.println(m1.toString());
		
		//CAMBIO LA PRIORIDAD AL MENSAJE  Y VUELVO A COMPROBAR CON EL TO STRING
		m1.cambiarPrioridadMedia();
		System.out.println(m1.toString());
		
	
		assertTrue("Deberia ser true", m1.getPrioridad() == "media");
		assertTrue("Deberia ser true", m1.getPrioridad().equals("media"));
		
	}

}
