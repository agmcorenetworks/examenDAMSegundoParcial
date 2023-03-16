package es.corenetworks.dam.examenTema3.utilidades;
import es.corenetworks.dam.examenTema3.excepciones.MesNoValidoException;
import gestionExcepcepcionesAleatorias.ExcepcionesAleatorias;

import java.util.Random;

public class Utilidades {
	
	private static String nombreMes;
	private static String nombreTrimestre;

	public static int getNumeroDigitos() {
		
		Random random = new Random();
		int numeroRandom = random.nextInt(9000)+1000;
		return numeroRandom;
		
	}
	
	//public static void main(String[]args) throws MesNoValidoException {
	public static String getMesDelAño(int numeroMes) throws MesNoValidoException {
		String nombreMes;
		
		switch(numeroMes) {
		case Constantes.MES_ENERO:
            nombreMes = Constantes.NOMBRE_MES_ENERO;
            break;
        case Constantes.MES_FEBRERO:
            nombreMes = Constantes.NOMBRE_MES_FEBRERO;
            break;
        case Constantes.MES_MARZO:
            nombreMes = Constantes.NOMBRE_MES_MARZO;
            break;
        case Constantes.MES_ABRIL:
            nombreMes = Constantes.NOMBRE_MES_ABRIL;
            break;
        case Constantes.MES_MAYO:
            nombreMes = Constantes.NOMBRE_MES_MAYO;
            break;
        case Constantes.MES_JUNIO:
            nombreMes = Constantes.NOMBRE_MES_JUNIO;
            break;
        case Constantes.MES_JULIO:
            nombreMes = Constantes.NOMBRE_MES_JULIO;
            break;
        case Constantes.MES_AGOSTO:
            nombreMes = Constantes.NOMBRE_MES_AGOSTO;
            break;
        case Constantes.MES_SEPTIEMBRE:
            nombreMes = Constantes.NOMBRE_MES_SEPTIEMBRE;
            break;
        case Constantes.MES_OCTUBRE:
            nombreMes = Constantes.NOMBRE_MES_OCTUBRE;
            break;
        case Constantes.MES_NOVIEMBRE:
            nombreMes = Constantes.NOMBRE_MES_NOVIEMBRE;
            break;
        case Constantes.MES_DICIEMBRE:
            nombreMes = Constantes.NOMBRE_MES_DICIEMBRE;
            break;
        default:
        	throw new MesNoValidoException("NOMBRE_MES_NO_VALIDO");
		}
		return nombreMes;
		//System.out.println(nombreMes);
	}
	
	public static String getTrimestreAño(int numeroMes) throws MesNoValidoException {
		switch (numeroMes) {
        case Constantes.MES_ENERO:
        case Constantes.MES_FEBRERO:
        case Constantes.MES_MARZO:
            return "Primer trimestre";
        case Constantes.MES_ABRIL:
        case Constantes.MES_MAYO:
        case Constantes.MES_JUNIO:
            return "Segundo trimestre";
        case Constantes.MES_JULIO:
        case Constantes.MES_AGOSTO:
        case Constantes.MES_SEPTIEMBRE:
            return "Tercer trimestre";
        case Constantes.MES_OCTUBRE:
        case Constantes.MES_NOVIEMBRE:
        case Constantes.MES_DICIEMBRE:
            return "Cuarto trimestre";
        default:
            throw new MesNoValidoException("NOMBRE_MES_NO_VALIDO");
		}
	}
	
	
	public static int bucleWhile() {
		 int count = 0;
		 int i = 0;
		 while (i < Constantes.numbers.length) {
			 if (Constantes.numbers[i] % 2 == 0) {
				 System.out.println(Constantes.numbers[i]);
				 count++;
				 }
			 i++;
			 }
		 return count;	
		 }

	public static int bucleDoWhile() {
	    int count = 0;
	    int sum = 0;
	    int i = Constantes.numbers.length - 1;
	    
	    do {
	        if (Constantes.numbers[i] % 2 != 0) {
	            System.out.println(Constantes.numbers[i]);
	            sum += Constantes.numbers[i];
	            count++;
	        }
	        i--;
	    } while (i >= 0);
	    
	    System.out.println("Suma total de impares: " + sum);
	    return sum;
	}
	
	public static void main(String[] args) {
	    try {
	        String mes = getMesDelAño(13);
	    } catch (MesNoValidoException e) {
	        System.out.println("Se ha producido una excepción: " + e.getMessage());
	    }

	    try {
	        String trimestre = getTrimestreAño(15); 
	    } catch (MesNoValidoException e) {
	        System.out.println("Se ha producido una excepción: " + e.getMessage());
	    }
	}

  
}

	
	/**
	 * Devuelve el tiempo actual
	 * 
	 * @return
	 */
	/*public static long getTime() {
		return System.currentTimeMillis();
	}
	*/
	

