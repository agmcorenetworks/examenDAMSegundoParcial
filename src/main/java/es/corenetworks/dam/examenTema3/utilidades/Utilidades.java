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
	
	// Método que devuelve un numero entero
	public static int getNumero4Digitos() {
	    Random random = new Random();
	    int numero = random.nextInt(8999) + 1000;
	    return numero;
	}
	
	
	// Método que nos dice nombre del mes proporcionando el numero del mes
	public static String getMesDelAño(int numero) throws MesNoValidoException {
	    String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
	    if (numero < 1 || numero > 12) {
	        throw new MesNoValidoException(Constantes.NOMBRE_MES_NO_VALIDO);
	    }
	    return meses[numero - 1];
	}
	
	
	// Método que nos dice el trimestre en el que estamos gracias al mes
	public static String getTrimestreDelAño(int mes) throws MesNoValidoException {
	    switch (mes) {
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
	
	
	// Método para mostar numeros pares
    public static int bucleWhile() {
    	int[] numbers = Constantes.numbers;
    	int contador = 0;
    	int i = 0;

    	while (i < numbers.length) {
    		if (numbers[i] % 2 == 0) {
    			System.out.println(numbers[i]);
    			contador++;
    		}
            	i++;
        }

        return contador;   }
    
    
    // Método para mostrar todos los números impares
    public static int bucleDoWhile() {
        int[] numbers = Constantes.numbers;
        int sumImpares = 0;
        int i = numbers.length - 1;
        do {
            if (numbers[i] % 2 != 0) {
                System.out.println(numbers[i]);
                sumImpares += numbers[i];
            }
            i--;
        } while (i >= 0);

        System.out.println("La suma de los números impares es: " + sumImpares);
        return sumImpares;
    }





	
}
