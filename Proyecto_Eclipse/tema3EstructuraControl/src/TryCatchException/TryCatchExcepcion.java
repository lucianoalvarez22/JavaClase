package TryCatchException;

public class TryCatchExcepcion {
	
	//EXCEPTCION TIPO CHECKED = NECESITA UN BLOQUE TRY CATCH
	
	//EL TRY CATCH SON INSEPARABLES, SIN FIJAS. DESPUES DE UN TRY, DEBE IR UN CATCH
	//ENTRARÁ AL TRY, SI NO HAY EXCEPCIONES, PASA AL FINALLY
	//ENTRARÁ AL TRY, SI HAY EXCEPCION VA AL CATCH Y DESPUES AL FINALLY
	//TODAS LAS EXCEPCIONES HEREDAN DE EXCEPTION

	public static void main(String[] args) {
		
		
		//AL DIVIDIR UN NUMERO ENTRE 0, PETA Y DA UNA EXCEPTION 
		int a=10, b=0, c;
//		c=a/b;
//		System.out.println("Resultado:" + c);
		
		
		//UTILICEMOS UN TRY PARA QUE NO OCURRA EL ERROR
		
		try {
			c=a/b;
		}
		catch(ArithmeticException e) {
			System.out.println("Se ha producido un error ARITMETICA");
		}
		catch(Exception e) {
			System.out.println("Se ha producido un error de OTRO TIPO");
		}
		finally {
			System.out.println("Bloque finally");
		}

	}

}
