package es.corenetworks.dam.examenTema3.algoritmos;

import java.util.concurrent.TimeUnit;

import es.corenetworks.dam.examenTema3.excepciones.ExcesivosDigitosException;
import es.corenetworks.dam.examenTema3.excepciones.InsuficientesDigitosException;
import es.corenetworks.dam.examenTema3.utilidades.Utilidades;

public class FuerzaBruta {
    private es.corenetworks.dam.examenTema.CajaFuerte cajaFuerte;
    private long tiempo;

    
    public FuerzaBruta(es.corenetworks.dam.examenTema.CajaFuerte cajaFuerte) {
        this.cajaFuerte = cajaFuerte;
        this.tiempo = 0;
    }

    
    public int sacarCombinacion() throws InsuficientesDigitosException, ExcesivosDigitosException {
        long inicio = Utilidades.getTime();
        int combinacionEncontrada = 0;
        for (int numero = 1000; numero <= 9999; numero++) {
            if (cajaFuerte.checkearContrasenya(numero)) {
                combinacionEncontrada = numero;
                break;
            }
        }
        long fin = Utilidades.getTime();
        tiempo = TimeUnit.MILLISECONDS.toSeconds(fin - inicio);
        return combinacionEncontrada;
    }

    
    public long getTiempo() {
        return tiempo;
    }

    
	public void sacarCombinacion(int i) {
		// TODO Auto-generated method stub
		
	}
}

