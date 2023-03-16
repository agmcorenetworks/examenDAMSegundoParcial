package es.corenetworks.dam.examenTema3.utilidades;

import java.util.Random;

import es.corenetworks.dam.examenTema3.excepciones.*;

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
	    Random numRand = new Random();
	    int numero = numRand.nextInt(9000) + 1000; // Genera un número aleatorio entre 1000 y 9999
	    return numero;
	}
	
	public static String getMesDelAño(int numeroMes) throws MesNoValidoException {
	    switch (numeroMes) {
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
	
	// no he creado las constantes para los trimestres porque no lo pedía el enunciado
	public static String getTrimestreDelAño(int mes) throws MesNoValidoException {
	    switch(mes) {
	        case Constantes.MES_ENERO:
	        case Constantes.MES_FEBRERO:
	        case Constantes.MES_MARZO:
	            return "primer trimestre";
	        case Constantes.MES_ABRIL:
	        case Constantes.MES_MAYO:
	        case Constantes.MES_JUNIO:
	            return "segundo trimestre";
	        case Constantes.MES_JULIO:
	        case Constantes.MES_AGOSTO:
	        case Constantes.MES_SEPTIEMBRE:
	            return "tercer trimestre";
	        case Constantes.MES_OCTUBRE:
	        case Constantes.MES_NOVIEMBRE:
	        case Constantes.MES_DICIEMBRE:
	            return "cuarto trimestre";
	        default:
	            throw new MesNoValidoException(Constantes.NOMBRE_MES_NO_VALIDO);
	    }
	}
	
	public static int bucleWhile() {
	    int count = 0;
	    int i = 0;
	    while (i < Constantes.numbers.length) {
	        int num = Constantes.numbers[i];
	        if (num % 2 == 0) {
	            System.out.println(num);
	            count++;
	        }
	        i++;
	    }
	    return count;
	}

	
	public static int bucleDoWhile() {
	    int[] numbers = Constantes.numbers;
	    int i = numbers.length - 1;
	    int sum = 0;
	    do {
	        if (numbers[i] % 2 != 0) {
	            System.out.println(numbers[i]);
	            sum += numbers[i];
	        }
	        i--;
	    } while (i >= 0);
	    System.out.println("La suma total de los números impares es: " + sum);
	    return sum;
	}

	
}

