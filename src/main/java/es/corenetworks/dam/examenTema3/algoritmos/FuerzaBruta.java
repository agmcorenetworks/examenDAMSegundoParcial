package es.corenetworks.dam.examenTema3.algoritmos;

import es.corenetworks.dam.examenTema3.CajaFuerte;
import es.corenetworks.dam.examenTema3.excepciones.ExcesivosDigitosException;
import es.corenetworks.dam.examenTema3.excepciones.InsuficientesDigitosException;
import es.corenetworks.dam.examenTema3.utilidades.Utilidades;

public class FuerzaBruta {
	
	static CajaFuerte cajaFuerte;
	static long tiempo;
	
	public FuerzaBruta (CajaFuerte caja) {
		cajaFuerte = caja;
		tiempo = 0;
	}
	
	public static int sacarCombinacion () throws InsuficientesDigitosException, ExcesivosDigitosException {
		
		int i = 1000;
		
		while (i < 10000) {
			
			if (cajaFuerte.checkearContrasenya(i) == true) {
				
				System.out.println("La contraseña correcta es: " + i);
				
				break;
			
			} else {
				i+=1;
			}
			
			
			}
		
		return i;
		
		}
	
	public static void sacarCombinacionConTiempo () throws InsuficientesDigitosException, ExcesivosDigitosException {
		
		long inicio = Utilidades.getTime();
		
        int i = 1000;
		
		while (i < 10000) {
			
			if (cajaFuerte.checkearContrasenya(i) == true) {
				
				System.out.println("La contraseña correcta es: " + i);
				
				break;
			
			} else {
				i+=1;
			}
			
			
			}
		
		long fin = Utilidades.getTime();
		
		tiempo = inicio - fin;
		
	}
	
	public static long getTiempo () {
		return tiempo;
	}
	
	public static void main (String args []) throws InsuficientesDigitosException, ExcesivosDigitosException {
		sacarCombinacion();
		System.out.println(cajaFuerte.getContrasenya());
	}
	

}
