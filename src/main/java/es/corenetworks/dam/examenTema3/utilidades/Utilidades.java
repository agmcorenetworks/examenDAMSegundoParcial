package es.corenetworks.dam.examenTema3.utilidades;

import es.corenetworks.dam.examenTema3.excepciones.MesNoValidoException;

public class Utilidades {

	/**
	 * Devuelve un numero aleatorio entre 1000 y 9999
	 * 
	 * @return
	 */
	public static int getNumero4Digitos() {
		double numero = 1000 + Math.random() * 9000;
		return (int) numero;
	}

	/**
	 * Devuelve el tiempo actual
	 * 
	 * @return
	 */
	public static long getTime() {
		return System.currentTimeMillis();
	}

	// ejercicios de switch
	public static String getMesDelAño(int mes) throws MesNoValidoException {
		System.out.println(mes);
		

		String nombreMes = Constantes.NOMBRE_MES_NO_VALIDO;
		switch (mes)

		{
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
			throw new MesNoValidoException(Constantes.NOMBRE_MES_NO_VALIDO);			
		}
		return nombreMes;

	}

	// ejercicios de switch
	public static String getTrimestreDelAño(int mes) {
		System.out.println(mes);
		String nombreTrimestre = Constantes.NOMBRE_MES_NO_VALIDO;

		switch (mes)

		{
		case 1:
		case 2:
		case 3:
			nombreTrimestre="primer trimestre";
			break;
		case 4:
		case 5:
		case 6:
			nombreTrimestre="segundo trimestre";
			break;
		case 7:
		case 8:
		case 9:
			nombreTrimestre="tercer trimestre";
			break;
		case 10:
		case 11:
		case 12:
			nombreTrimestre="cuarto trimestre";
			break;
		default:
			nombreTrimestre=Constantes.NOMBRE_MES_NO_VALIDO;
			break;
		}
		return nombreTrimestre;
	}

	// Dado un número entero positivo, mostrar su factorial utilizando un bucle for.
	// El factorial de un número se obtiene multiplicando todos los números enteros
	// positivos que hay entre el 1 y ese número.
	public static int factorial(int numero) {
		int factorial = 1;
		for (int x = 2; x <= numero; x++)
			factorial = factorial * x;
		return factorial;
	}
}
