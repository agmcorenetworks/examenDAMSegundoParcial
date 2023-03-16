package es.corenetworks.dam.examenTema3.utilidades;

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
	
	public static int getNumero4Digitos () {
		
		int numAleatorio = (int) (Math.random() * (9999 - 1000 + 1) + 1000);
		
	    return numAleatorio;
	}
	
	public static String getMesDelAño (int numMes) throws MesNoValidoException {
		
		if (numMes == Constantes.MES_ENERO) {
			return Constantes.NOMBRE_MES_ENERO;
		} else if (numMes == Constantes.MES_FEBRERO) {
			return Constantes.NOMBRE_MES_FEBRERO;
		} else if (numMes == Constantes.MES_MARZO) {
			return Constantes.NOMBRE_MES_MARZO;
		} else if (numMes == Constantes.MES_ABRIL) {
			return Constantes.NOMBRE_MES_ABRIL;
		} else if (numMes == Constantes.MES_MAYO) {
			return Constantes.NOMBRE_MES_MAYO;
		} else if (numMes == Constantes.MES_JUNIO) {
			return Constantes.NOMBRE_MES_JUNIO;
		} else if (numMes == Constantes.MES_JULIO) {
			return Constantes.NOMBRE_MES_JULIO;
		} else if (numMes == Constantes.MES_AGOSTO) {
			return Constantes.NOMBRE_MES_AGOSTO;
		} else if (numMes == Constantes.MES_SEPTIEMBRE) {
			return Constantes.NOMBRE_MES_SEPTIEMBRE;
		} else if (numMes == Constantes.MES_OCTUBRE) {
			return Constantes.NOMBRE_MES_OCTUBRE;
		} else if (numMes == Constantes.MES_NOVIEMBRE) {
			return Constantes.NOMBRE_MES_NOVIEMBRE;
		} else if (numMes == Constantes.MES_DICIEMBRE) {
			return Constantes.NOMBRE_MES_DICIEMBRE;
		} else {
			throw new MesNoValidoException (Constantes.NOMBRE_MES_NO_VALIDO);
		}
		
		}
	
	public static String getTrimestreDelAño (int numMes) throws MesNoValidoException {
		
		switch (numMes) {
		
		case Constantes.MES_ENERO | Constantes.MES_FEBRERO | Constantes.MES_MARZO:
			return "primer trimestre";
		case Constantes.MES_ABRIL | Constantes.MES_MAYO | Constantes.MES_JUNIO:
			return "segundo trimestre";
		case Constantes.MES_JULIO | Constantes.MES_AGOSTO | Constantes.MES_SEPTIEMBRE:
			return "tercer trimestre";
		case Constantes.MES_OCTUBRE | Constantes.MES_NOVIEMBRE:
			return "cuarto trimestre";
		case Constantes.MES_DICIEMBRE:
			return "cuarto trimestre";
		default:
			throw new MesNoValidoException (Constantes.NOMBRE_MES_NO_VALIDO);
		
		}
		
		}
	
	public static int bucleWhile() {
	    int num_pares = 0;
	    int i = 0;  
	    while (i < Constantes.numbers.length) {
	    	if (Constantes.numbers[i] % 2 == 0) {
	            System.out.println("Numero par encontrado: " + Constantes.numbers[i]);
	            num_pares += 1;
	            i += 1;
	    	}
	    }
	    return num_pares;
	}
	
	public static int bucleDoWhile() {
	    int indice = Constantes.numbers.length - 1;
	    int sumaImpares = 0;
	    do {
	        int numero = Constantes.numbers[indice];
	        if (numero % 2 != 0) {
	            System.out.println(numero);
	            sumaImpares += numero;
	        }
	        indice--;
	    } while (indice >= 0);

	    System.out.println("Suma de impares: " + sumaImpares);
	    
	    return sumaImpares;
	}
	
}

	

	
	
	

