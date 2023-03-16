package es.corenetworks.dam.examenTema3.utilidades;

import java.util.Random;

import es.corenetworks.dam.examenTema3.excepciones.MesNoValidoException;
import es.corenetworks.dam.examenTema3.utilidades.Constantes;

public class Utilidades {

	private static int numeroAleatorio;
	
	/**
	 * Devuelve el tiempo actual
	 * 
	 * @return
	 */
	public static long getTime() {
		return System.currentTimeMillis();
	}
	
	public static int getNumero4Digitos() {
		
		Random random = new Random();
        numeroAleatorio = random.nextInt(8999) + 1000;
        return numeroAleatorio;
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
	        return "primer trimestre";
	        
	    case Constantes.MES_FEBRERO:
	    	return "primer trimestre";
	        
	    case Constantes.MES_MARZO:
	    	return "primer trimestre";
	        
	    case Constantes.MES_ABRIL:
	    	return "segundo trimestre";
	    	
	    case Constantes.MES_MAYO:
	    	return "segundo trimestre";
	    	
	    case Constantes.MES_JUNIO:
	    	return "segundo trimestre";
	    	
	    case Constantes.MES_JULIO:
	    	return "tercer trimestre";
	    	
	    case Constantes.MES_AGOSTO:
	    	return "tercer trimestre";
	    	
	    case Constantes.MES_SEPTIEMBRE:
	    	return "tercer trimestre";
	    
	    case Constantes.MES_OCTUBRE:
	    	return "cuarto trimestre";
	    	
	    case Constantes.MES_NOVIEMBRE:
	    	return "cuarto trimestre";
	    	
	    case Constantes.MES_DICIEMBRE:
	    	return "cuarto trimestre";
		default:
	        throw new MesNoValidoException(Constantes.NOMBRE_MES_NO_VALIDO);
		
	}
   }
	
	public static int bucleWhile() {
		int i = 0;
		int contador =0;
		
		while (i < Constantes.numbers.length) {
		    int numero = Constantes.numbers[i];
		    if (numero%2 == 0) {
		    	contador++;
		    }
		    i++;
		}
		return contador;
	}
	
	public static int bucleDoWhile() {
		
		int sum = 0;
		
		int indice= Constantes.numbers.length - 1;
		
		
		do {
		    
		    if (Constantes.numbers[indice] % 2 != 0) {
		        
		        System.out.println(Constantes.numbers[indice]);
		        
		        sum += Constantes.numbers[indice];
		        
		        
		        
		    }
		    
		    indice--;
		} while (indice >= 0);
		
		return sum;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
