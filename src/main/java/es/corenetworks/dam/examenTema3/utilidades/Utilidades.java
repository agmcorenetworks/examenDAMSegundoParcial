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

	// Método para generar número.:

	public static int getNumero4Digitos() {
		Random rand = new Random();
		return rand.nextInt(9000) + 1000;
	}

	// Método getMes:

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

			throw new MesNoValidoException(Constantes.NOMBRE_MES_NO_VALIDO);

		}

	}

	public static int bucleWhile() {

		int contador = 0;

		int i = 0;

		while (i < Constantes.numbers.length) {

			int num = Constantes.numbers[i];

			if (num % 2 == 0) {

				System.out.println(num);

				contador++;

			}

			i++;

		}

		return contador;

	}

	public static int bucleDoWhile() {

		int[] numbers = Constantes.numbers;

		int i = numbers.length - 1;

		int sumaMeses = 0;

		do {

			if (numbers[i] % 2 != 0) {

				System.out.println(numbers[i]);

				sumaMeses += numbers[i];

			}

			i--;

		} while (i >= 0);

		System.out.println("La suma total de los números impares es: " + sumaMeses);

		return sumaMeses;

	}

}
