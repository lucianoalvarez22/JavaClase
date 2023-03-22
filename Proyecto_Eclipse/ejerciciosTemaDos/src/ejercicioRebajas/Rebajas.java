package ejercicioRebajas;

public class Rebajas {

public static double descubrePorcentaje(double rebajado, double original) {

double resta= rebajado - original;


double porcentaje = (resta/rebajado)*100;


return porcentaje;

}




public static void main(String[] args) {

// TODO Auto-generated method stub
System.out.println(descubrePorcentaje(100.00, 50.00));

}

}
