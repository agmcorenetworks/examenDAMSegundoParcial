package es.corenetworks.dam.examenTema3.algoritmos;

import es.corenetworks.dam.examenTema3.CajaFuerte;

import es.corenetworks.dam.examenTema3.excepciones.*;

import es.corenetworks.dam.examenTema3.utilidades.Utilidades;

public class FuerzaBruta {
//Atributos de la clase
	private CajaFuerte cajaFuerte;

	private long tiempo;

	
	//Constructor de la clase

	public FuerzaBruta(CajaFuerte cajaFuerte) {

		this.tiempo = 0;
		this.cajaFuerte = cajaFuerte;

	}
	
	//Método original y modificado como indica el siguiente punto!
	public int sacarCombinacion() throws InsuficientesDigitosException, ExcesivosDigitosException {

		long inicio = Utilidades.getTime();

		int contadorContrasena = -1;

		for (int i = 1000; i <= 9999; i++) {

			if (cajaFuerte.checkearContrasenya(i)) {

				return i;

			}

		}

		long fin = Utilidades.getTime();

		tiempo = fin - inicio;

		return contadorContrasena;

	}

	//Método para obtener el tiempo. 
	public long getTiempo() {

		return tiempo;

	}

}
