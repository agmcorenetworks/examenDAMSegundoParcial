package es.corenetworks.dam.examenTema3.utilidades;

import java.util.Random;

import es.corenetworks.dam.examenTema3.excepciones.MesNoValidoException;

public class Utilidades {

	
	/**
	 * Devuelve el tiempo actual
	 * 
	 * @return
	 */
	public static long getTime() {
		return System.currentTimeMillis();
	}

	public static int getNumero4Digitos() {
	    Random aleatorio = new Random();
	    int numero = aleatorio.nextInt(9000) + 1000; // Genera un número aleatorio entre 1000 y 9999
	    return numero;
	}
	
	public static String getMesDelAño(int numMes) throws MesNoValidoException {
	    switch (numMes) {
	        case Constantes.MES_ENERO:
	            return Constantes.NOMBRE_MES_ENERO;
	        case Constantes.MES_FEBRERO:
	            return Constantes.NOMBRE_MES_FEBRERO;
	        case Constantes.MES_MARZO:
	            return Constantes.NOMBRE_MES_MARZO;
	        case Constantes.MES_ABRIL:
	            return Constantes.NOMBRE_MES_ABRIL;
	        case Constantes.MES_MAYO:
	            return Constantes.NOMBRE_MES_MAYO;
	        case Constantes.MES_JUNIO:
	            return Constantes.NOMBRE_MES_JUNIO;
	        case Constantes.MES_JULIO:
	            return Constantes.NOMBRE_MES_JULIO;
	        case Constantes.MES_AGOSTO:
	            return Constantes.NOMBRE_MES_AGOSTO;
	        case Constantes.MES_SEPTIEMBRE:
	            return Constantes.NOMBRE_MES_SEPTIEMBRE;
	        case Constantes.MES_OCTUBRE:
	            return Constantes.NOMBRE_MES_OCTUBRE;
	        case Constantes.MES_NOVIEMBRE:
	            return Constantes.NOMBRE_MES_NOVIEMBRE;
	        case Constantes.MES_DICIEMBRE:
	            return Constantes.NOMBRE_MES_DICIEMBRE;
	        default:
	            throw new MesNoValidoException(Constantes.NOMBRE_MES_NO_VALIDO);
	    }
	}
	
	
	public static String getTrimestreDelAño(int numMes) throws MesNoValidoException {
	    switch (numMes) {
	        case Constantes.MES_ENERO:
	        case Constantes.MES_FEBRERO:
	        case Constantes.MES_MARZO:
	            return Constantes.NOMBRE_PRIMER_TRIMESTRE;
	        case Constantes.MES_ABRIL:
	        case Constantes.MES_MAYO:
	        case Constantes.MES_JUNIO:
	            return Constantes.NOMBRE_SEGUNDO_TRIMESTRE;
	        case Constantes.MES_JULIO:
	        case Constantes.MES_AGOSTO:
	        case Constantes.MES_SEPTIEMBRE:
	            return Constantes.NOMBRE_TERCER_TRIMESTRE;
	        case Constantes.MES_OCTUBRE:
	        case Constantes.MES_NOVIEMBRE:
	        case Constantes.MES_DICIEMBRE:
	            return Constantes.NOMBRE_CUARTO_TRIMESTRE;
	        default:
	            throw new MesNoValidoException(Constantes.NOMBRE_MES_NO_VALIDO);
	    }
	}
	    
	    public static int bucleWhile() {
	    	 int i = 0;
	    	    int contadorPares = 0;

	    	    while (i < Constantes.numbers.length) {
	    	        if (Constantes.numbers[i] % 2 == 0) {
	    	            System.out.println(Constantes.numbers[i]);
	    	            contadorPares++;
	    	        }
	    	        i++;
	    	    }

	    	    System.out.println("Se encontraron " + contadorPares + " números pares.");
	    	    return contadorPares;
	    	}
	    
	    public static int bucleDoWhile() {
	    	  int sum = 0;
	    	    int i = Constantes.numbers.length - 1;
	    	    do {
	    	        if (Constantes.numbers[i] % 2 != 0) {
	    	            System.out.println(Constantes.numbers[i]);
	    	            sum += Constantes.numbers[i];
	    	        }
	    	        i--;
	    	    } while (i >= 0);
	    	    System.out.println("La suma de los números impares es: " + sum);
	    	    return sum;
	    	}
}
	    




