package es.corenetworks.dam.examenTema3.algoritmos;

import es.corenetworks.dam.examenTema3.CajaFuerte;
import es.corenetworks.dam.examenTema3.excepciones.*;
import es.corenetworks.dam.examenTema3.utilidades.Utilidades;


public class FuerzaBruta {
    private CajaFuerte cajaFuerte;
    private long tiempo;

    public FuerzaBruta(CajaFuerte cajaFuerte) {
        this.cajaFuerte = cajaFuerte;
        this.tiempo = 0;
    }
    
    
    public int sacarCombinacion() throws InsuficientesDigitosException, ExcesivosDigitosException {
        long inicio = Utilidades.getTime();
        int combinacion = -1;
        for (int i = 1000; i <= 9999; i++) {
            if (cajaFuerte.checkearContrasenya(i)) {
                combinacion = i;
                break;
            }
        }
        long fin = Utilidades.getTime();
        tiempo = fin - inicio;
        return combinacion;
    }


    public long getTiempo() {
        return tiempo;
    }

    

    
}
