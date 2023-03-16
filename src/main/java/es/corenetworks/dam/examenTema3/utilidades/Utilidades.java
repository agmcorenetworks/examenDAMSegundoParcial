package es.corenetworks.dam.examenTema3.utilidades;

import java.util.Random;

import es.corenetworks.dam.examenTema3.excepciones.MesNoValidoException;
import es.corenetworks.dam.examenTema3.utilidades.Constantes;

public class Utilidades {

	/**
	 * Devuelve el tiempo actual
	 * 
	 * @return
	 */
	public static long getTime() {
		return System.currentTimeMillis();
	}

	public static int getNumeroDigitos() {

		Random rand = new Random();
		int num = rand.nextInt(9000) + 1000;
		return num;
	}

	public static String getMesDelAño(int numero) throws MesNoValidoException {

		switch (numero) {

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

	public static String getTrimestreDelAño(int numero) throws MesNoValidoException {
		
		switch (numero) {

		case Constantes.MES_ENERO:
			return "Primer trimestre";
		case Constantes.MES_FEBRERO:
			return "Primer trimestre";

		case Constantes.MES_MARZO:
			return "Primer trimestre";

		case Constantes.MES_ABRIL:
			return "Segundo trimestre";

		case Constantes.MES_MAYO:
			return "Segundo trimestre";

		case Constantes.MES_JUNIO:
			return "Segundo trimestre";

		case Constantes.MES_JULIO:
			return "Tercer trimestre";

		case Constantes.MES_AGOSTO:
			return "Tercer trimestre";

		case Constantes.MES_SEPTIEMBRE:
			return "Tercer trimestre";

		case Constantes.MES_OCTUBRE:
			return "Cuarto Trimestre";

		case Constantes.MES_NOVIEMBRE:
			return "Cuarto Trimestre";

		case Constantes.MES_DICIEMBRE:
			return "Cuarto Trimestre";

		default:
			throw new MesNoValidoException(Constantes.NOMBRE_MES_NO_VALIDO);
		}
	}
	
	public static int bucleWhile() {
		
		int numero=0;
		int incremento=0;
		while(numero < Constantes.numbers.length) {
			
			if(numero%2 == 0) {
				incremento++;
			}
			
			
		}
		
		return incremento;
	}
	
	public static int bucleDoWhile() {
		int sumaDeNumerosImpares = 0;
		int numero = Constantes.numbers.length-1;
		
		do {
			if (Constantes.numbers[numero] % 2 != 0) { 
	            sumaDeNumerosImpares += Constantes.numbers[numero];
	            System.out.println(Constantes.numbers[numero]);
			}
			numero--;
		} while(numero >=0);
		
		return sumaDeNumerosImpares;
		
	}

}
