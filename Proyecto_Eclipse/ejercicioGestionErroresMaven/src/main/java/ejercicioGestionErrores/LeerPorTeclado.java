package ejercicioGestionErrores;
import java.util.Scanner;

public class LeerPorTeclado {
	
	//Atributo
	private char caracterIntroducido;
	
	//METODO PARA LEER EL CARATER INTRODUCIDO
	public char getChar() {
		Scanner scanner = new Scanner(System.in);
    
        System.out.print("Introduce un caracter (Solo se tendra en cuenta el primer caracter): ");
        
        return caracterIntroducido = scanner.nextLine().charAt(0); 
        
 
	}  
	

	//METODO PARA PROCESAR EL CARACTER INTRODUCIDO
	public void procesandoCaracter() throws VocalException, NumeroException, BlancoException, SalidaException {
		
		
        if(Character.toLowerCase(caracterIntroducido) == 'a' || Character.toLowerCase(caracterIntroducido) == 'e' || Character.toLowerCase(caracterIntroducido) == 'i' || Character.toLowerCase(caracterIntroducido) == 'o' || Character.toLowerCase(caracterIntroducido) == 'u' ) {
        	throw new VocalException("Excepcion de VOCAL");
        }
        else if (Character.isDigit(caracterIntroducido)) {
        	throw new NumeroException("Excepcion de NUMERO");
   
        }
        else if (Character.isWhitespace(caracterIntroducido)) {
        	throw new BlancoException("Excepcion de ESPACIO EN BLANCO");
        }
        else if (Character.toLowerCase(caracterIntroducido) == 'x') { 
        	throw new SalidaException("Excepcion de SALIDA - PROGRAMA FINALIZADO");
        } 
        else { 
        	System.out.println("Caracteres incorrectos");
        	System.out.println("------------------------------------------------------");
        }
	}
	
}
