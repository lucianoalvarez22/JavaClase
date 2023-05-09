package testRepasoRobots;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import tema4RepasoRobots.Robot;

public class TestRobot {
	
	@Test
	public void TestUniRobots() throws CloneNotSupportedException {
		Robot r1 = new Robot(20,15,14);
		Robot r2 = new Robot(24,1,9);
		Robot r3 = new Robot(20,15,14);
		Robot r4 = new Robot(10,2,50);
		Robot r7 = r2;
		//CLONAR
		Robot r5 = (Robot) r2.clone();
		Robot r6 = (Robot) r4.clone();
		
		//COMPROBACIONES CON ASSERTS
		assertTrue("deberia ser true", r7==r2 );
		
		
		
		
		//COMPROBACION QUE EL ATRIBUTO DE CLASE INCREMENTA CORRECTAMENTE
		System.out.println(Robot.getNumeroDeRobots());
		
		
	}

}
