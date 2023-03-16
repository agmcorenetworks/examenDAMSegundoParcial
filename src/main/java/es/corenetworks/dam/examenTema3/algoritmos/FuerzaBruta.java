package es.corenetworks.dam.examenTema3.algoritmos;

import java.util.concurrent.TimeUnit;

import es.corenetworks.dam.examenTema3.CajaFuerte;
import es.corenetworks.dam.examenTema3.excepciones.InsuficientesDigitosException;
import es.corenetworks.dam.examenTema3.utilidades.Utilidades;



public class FuerzaBruta {

	private CajaFuerte cajaFuerte;
	private long tiempo;
	private long inicio;
	private long fin;
	
	public FuerzaBruta(CajaFuerte c1) {
		cajaFuerte = c1;
		tiempo = 0;
	}
	
	
	public int sacarCombinacion() throws InsuficientesDigitosException {
		inicio= Utilidades.getTime();
	    int contraseña=0;
		
		for (int i=1000; i<9999; i++) {
			
			if (cajaFuerte.checkearContrasenya(i)==true) {
				contraseña = i;
				fin= Utilidades.getTime();
				break;
			}
	    }
		
	    tiempo = inicio - fin;
		return contraseña;
	}
	
	public long getTiempo() {
		return tiempo;
	}

	
	
	
}
