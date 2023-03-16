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
	
	//Método que genera un numero aleatorio entre el 0 y el 8999, luego le suma 1000
	public static int getNumero4Digitos() {
		Random numero_aleatorio = new Random();
		int numero = numero_aleatorio.nextInt(9000) + 1000;
		return numero;
	}

	
	//Método al que le damos un valor, si comprende entre 1 y el 12, mostrará el nombre de dicho mes
	public static String  getMesDelAño(int mes) throws MesNoValidoException {
		
		switch(mes) {
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
	//Método para saber el trimestre correspondiente a cada mes
	public static String getTrimestreDelAño(int mes) throws MesNoValidoException {
		
	    String trimestre;

	    switch (mes) {
	        case Constantes.MES_ENERO:
	        case Constantes.MES_FEBRERO:
	        case Constantes.MES_MARZO:
	            trimestre = Constantes.PRIMER_TRIMESTRE;
	            break;

	        case Constantes.MES_ABRIL:
	        case Constantes.MES_MAYO:
	        case Constantes.MES_JUNIO:
	            trimestre = Constantes.SEGUNDO_TRIMESTRE;
	            break;

	        case Constantes.MES_JULIO:
	        case Constantes.MES_AGOSTO:
	        case Constantes.MES_SEPTIEMBRE:
	            trimestre = Constantes.TERCER_TRIMESTRE;
	            break;

	        case Constantes.MES_OCTUBRE:
	        case Constantes.MES_NOVIEMBRE:
	        case Constantes.MES_DICIEMBRE:
	            trimestre = Constantes.CUARTO_TRIMESTRE;
	            break;

	        default:
	            throw new MesNoValidoException(Constantes.NOMBRE_MES_NO_VALIDO);
	    }

	    return trimestre;
	}

	public static int bucleWhile() {
	    int contador = 0;
	    int i = 0;
	    while (i < Constantes.numbers.length) {
	        if (Constantes.numbers[i] % 2 == 0) {
	            System.out.println(Constantes.numbers[i]);
	            contador++;
	        }
	        i++;
	    }
	    return contador;
	}
	
	public static int bucleDoWhile() {
	    int suma_impares = 0;
	    int i = Constantes.numbers.length - 1;
	    do {
	        if (Constantes.numbers[i] % 2 != 0) {
	            System.out.println(Constantes.numbers[i]);
	            suma_impares += Constantes.numbers[i];
	        }
	        i--;
	    } while (i >= 0);
	    System.out.println("La suma de los números impares es: " + suma_impares);
	    return suma_impares;
	}



}