package es.corenetworks.dam.examenTema3.algoritmos;

import es.corenetworks.dam.examenTema3.CajaFuerte;
import es.corenetworks.dam.examenTema3.excepciones.DemasiadosIntentosException;
import es.corenetworks.dam.examenTema3.excepciones.ExcesivoDigitosException;
import es.corenetworks.dam.examenTema3.excepciones.InsuficientesDigitosException;
import es.corenetworks.dam.examenTema3.utilidades.Utilidades;

public class FuerzaBruta {

	CajaFuerte cajafuerte = new CajaFuerte();
	long tiempo;
	
	
	public FuerzaBruta(CajaFuerte cajaFuerte) {
		
	        this.cajafuerte = cajaFuerte;
	        this.tiempo = 0;
	}
	
	public int sacarCombinacion() throws DemasiadosIntentosException {
        for (int i = 1000; i <= 9999; i++) {
            try {
                this.tiempo++;
                if (cajafuerte.checkearContrasenya(i)) {
                    return i;
                }
            } catch (InsuficientesDigitosException | ExcesivoDigitosException e) {
                // No hacer nada, simplemente continuar con la siguiente iteración
            }
        }
        throw new DemasiadosIntentosException("Ha agotado las oportunidades.");
    }
	
	
	
	public int sacarCombinaciones() throws DemasiadosIntentosException, InsuficientesDigitosException, ExcesivoDigitosException {
	    long inicio = Utilidades.getTime(); // tiempo de inicio
	    int contrasenyaEncontrada = -1; // valor por defecto en caso de no encontrar la contraseña
	    for (int i = 1000; i <= 9999; i++) {
	        try {
	            if (cajafuerte.checkearContrasenya(i)) {
	                contrasenyaEncontrada = i;
	                break;
	            }
	        } catch (InsuficientesDigitosException | ExcesivoDigitosException e) {
	            // No hacemos nada, seguimos probando otras combinaciones
	        }
	    }
	    long fin = Utilidades.getTime(); // tiempo de finalización
	    System.out.println("Tiempo transcurrido: " + (fin - inicio) + " milisegundos");
	    return contrasenyaEncontrada;
	}
	
	public long getTiempo() {
        return this.tiempo;
    }

}

