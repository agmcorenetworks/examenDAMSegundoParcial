package es.corenetworks.dam.examenTema3.utilidades;

import java.util.Random;
import es.corenetworks.dam.examenTema3.excepciones.MesNoValidoException;

public class Utilidades {

	
	public static int getNumero4Digitos() {
	    Random random = new Random();
	    return random.nextInt(9000) + 1000;
	}
	
	public static String getMesDelAño(int numeroMes) throws MesNoValidoException {
	    switch(numeroMes) {
	        case 1:
	            return Constantes.NOMBRE_MES_ENERO;
	        case 2:
	            return Constantes.NOMBRE_MES_FEBRERO;
	        case 3:
	            return Constantes.NOMBRE_MES_MARZO;
	        case 4:
	            return Constantes.NOMBRE_MES_ABRIL;
	        case 5:
	            return Constantes.NOMBRE_MES_MAYO;
	        case 6:
	            return Constantes.NOMBRE_MES_JUNIO;
	        case 7:
	            return Constantes.NOMBRE_MES_JULIO;
	        case 8:
	            return Constantes.NOMBRE_MES_AGOSTO;
	        case 9:
	            return Constantes.NOMBRE_MES_SEPTIEMBRE;
	        case 10:
	            return Constantes.NOMBRE_MES_OCTUBRE;
	        case 11:
	            return Constantes.NOMBRE_MES_NOVIEMBRE;
	        case 12:
	            return Constantes.NOMBRE_MES_DICIEMBRE;
	        default:
	            throw new MesNoValidoException(Constantes.NOMBRE_MES_NO_VALIDO);
	    }
	}
	
	public static String getTrimestreDelAño(int numeroMes) throws MesNoValidoException {
	    switch(numeroMes) {
	        case 1:
	        case 2:
	        case 3:
	            return "Primer Trimestre del Año";
	        case 4:
	        case 5:
	        case 6:
	            return "Segundo Trimestre del Año";
	        case 7:
	        case 8:
	        case 9:
	            return "Tercer Trimestre del Año";
	        case 10:
	        case 11:
	        case 12:
	            return "Cuarto Trimestre del Año";
	        default:
	            throw new MesNoValidoException(Constantes.NOMBRE_MES_NO_VALIDO);
	    }
	}
	
	public static int bucleWhile(int[] numbers) {
	    int i = 0;
	    int count = 0;
	    while (i < numbers.length) {
	        if (numbers[i] % 2 == 0) {
	            System.out.println(numbers[i]);
	            count++;
	        }
	        i++;
	    }
	    return count;
	}
	
	public static int bucleDoWhile(int[] numbers) {
	    int i = numbers.length - 1;
	    int sum = 0;
	    do {
	        if (numbers[i] % 2 != 0) {
	            System.out.println(numbers[i]);
	            sum += numbers[i];
	        }
	        i--;
	    } while (i >= 0);
	    System.out.println("La suma de los números impares es: " + sum);
	    return sum;
	}
	
	
	
	/**
	 * Devuelve el tiempo actual
	 * 
	 * @return
	 */
	public static long getTime() {
		return System.currentTimeMillis();
	}

	
}
