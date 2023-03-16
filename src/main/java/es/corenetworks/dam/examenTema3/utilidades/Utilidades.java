package es.corenetworks.dam.examenTema3.utilidades;

import es.corenetworks.dam.examenTema3.excepciones.MesNoValidoException;

import java.util.Random;

public class Utilidades {
	
	// Ejercicio 1

	public static int getNumero4Digitos() {
		Random r = new Random();
		return r.nextInt((9999-1000) + 1) + 1000;
	}
	
	public static String getMesDelAño(int numeroMes) throws MesNoValidoException {
		switch (numeroMes) {
		case Constantes.MES_ENERO : 
			return Constantes.NOMBRE_MES_ENERO;
		case Constantes.MES_FEBRERO :
			return Constantes.NOMBRE_MES_FEBRERO;
		case Constantes.MES_MARZO :
			return Constantes.NOMBRE_MES_MARZO;
		case Constantes.MES_ABRIL :
			return Constantes.NOMBRE_MES_ABRIL;
		case Constantes.MES_MAYO :
			return Constantes.NOMBRE_MES_MAYO;
		case Constantes.MES_JUNIO :
			return Constantes.NOMBRE_MES_JUNIO;
		case Constantes.MES_JULIO :
			return Constantes.NOMBRE_MES_JULIO;
		case Constantes.MES_AGOSTO :
			return Constantes.NOMBRE_MES_AGOSTO;
		case Constantes.MES_SEPTIEMBRE :
			return Constantes.NOMBRE_MES_SEPTIEMBRE;
		case Constantes.MES_OCTUBRE :
			return Constantes.NOMBRE_MES_OCTUBRE;
		case Constantes.MES_NOVIEMBRE :
			return Constantes.NOMBRE_MES_NOVIEMBRE;
		case Constantes.MES_DICIEMBRE :
			return Constantes.NOMBRE_MES_DICIEMBRE;
		default:
			throw new MesNoValidoException(Constantes.NOMBRE_MES_NO_VALIDO);
		}
	}
	
	public static String getTrimestreDelAño(int numeroMes) throws MesNoValidoException {
		switch (numeroMes) {
		case Constantes.MES_ENERO,Constantes.MES_FEBRERO,Constantes.MES_MARZO :
			return Constantes.PRIMER_TRIMESTRE;
		case Constantes.MES_ABRIL,Constantes.MES_MAYO,Constantes.MES_JUNIO :
			return Constantes.SEGUNDO_TRIMESTRE;
		case Constantes.MES_JULIO,Constantes.MES_AGOSTO,Constantes.MES_SEPTIEMBRE :
			return Constantes.TERCER_TRIMESTRE;
		case Constantes.MES_OCTUBRE,Constantes.MES_NOVIEMBRE,Constantes.MES_DICIEMBRE :
			return Constantes.CUARTO_TRIMESTRE;
		default :
			throw new MesNoValidoException(Constantes.NOMBRE_MES_NO_VALIDO);
		}
	}
	
	public static int bucleWhile() {
		int salida = 0;
		int i = 0;
		while (i < Constantes.numbers.length) {
			if (Constantes.numbers[i]%2 == 0) {
				System.out.println(Constantes.numbers[i]);
				salida += 1;
			}
			i++;
		}
		return salida;
	}
	
	public static int bucleDoWhile() {
		int salida = 0;
		int i = Constantes.numbers.length - 1;
		do {
			if (Constantes.numbers[i]%2 != 0) {
				System.out.println(Constantes.numbers[i]);
				salida += Constantes.numbers[i];
			}
			i--;
		} while (i >= 0);
		return salida;
	}
	
	/**
	 * Devuelve el tiempo actual
	 * 
	 * @return
	 */
	public static long getTime() {
		return System.currentTimeMillis();
	}
	
	public static void main(String[] args) {
		System.out.println(bucleDoWhile());
	}
}
