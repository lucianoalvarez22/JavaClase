package temaClasePolimorfismo;

public class TestPolimorfismo {

	public static void main(String[] args) {
		
		Persona p1;
		p1 = new Empleado();	
		p1.getNombre();
		// p1.getSueldo(); //ERROR PORQUE PERTENECE A PERSONA Y NO A EMPLEADO
		
		
		
		Empleado e1;
		e1=new Empleado();
		e1.setSueldo(500);
		e1.getNombre();
		//e1.getSueldo(); //error de compilacion
				
		Empleado e2;
		e2=new Encargado();		
		e2.setSueldo(500);
		//e2.doCosasDeEncargado();  //error de compilacion
		e2.getSueldo();
		
		Empleado[] misEmpleados= {e1,e2};
		
		for (Empleado empleado : misEmpleados) {
			System.out.println(empleado.getSueldo());
			
		}
		

	}

}
