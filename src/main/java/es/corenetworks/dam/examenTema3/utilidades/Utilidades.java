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
	    Random rand = new Random();
	    int num = rand.nextInt(9000) + 1000;
	    return num;
	}

	public static String getMesDelAño(int mes) throws MesNoValidoException {
        switch (mes) {
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
	
	public static String getTrimestreDelAño(int mes) throws MesNoValidoException {
        switch (mes) {
            case Constantes.MES_ENERO:
            case Constantes.MES_FEBRERO:
            case Constantes.MES_MARZO:
                return "Primer Trimestre";
            case Constantes.MES_ABRIL:
            case Constantes.MES_MAYO:
            case Constantes.MES_JUNIO:
                return "Segundo Trimestre";
            case Constantes.MES_JULIO:
            case Constantes.MES_AGOSTO:
            case Constantes.MES_SEPTIEMBRE:
                return "Tercer Trimestre";
            case Constantes.MES_OCTUBRE:
            case Constantes.MES_NOVIEMBRE:
            case Constantes.MES_DICIEMBRE:
                return "Cuarto Trimestre";
            default:
                throw new MesNoValidoException(Constantes.NOMBRE_MES_NO_VALIDO);
        }
    }
	
	public static int bucleWhile() {
        int contadorPares = 0;
        int index = 0;

        while (index < Constantes.numbers.length) {
            int numero = Constantes.numbers[index];

            if (numero % 2 == 0) {
                System.out.println("Número par: " + numero);
                contadorPares++;
            }

            index++;
        }

        return contadorPares;
    }
	
	public static int bucleDoWhile() {
        int sumaImpares = 0;
        int index = Constantes.numbers.length - 1;

        do {
            int numero = Constantes.numbers[index];

            if (numero % 2 != 0) {
                System.out.println("Número impar: " + numero);
                sumaImpares += numero;
            }

            index--;
        } while (index >= 0);

        System.out.println("Suma de números impares: " + sumaImpares);
        return sumaImpares;
    }
	
	
	
}
