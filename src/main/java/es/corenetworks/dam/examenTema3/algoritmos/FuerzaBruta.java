package es.corenetworks.dam.examenTema3.algoritmos;

import es.corenetworks.dam.examenTema3.CajaFuerte;
import es.corenetworks.dam.examenTema3.excepciones.ExcesivosDigitosException;
import es.corenetworks.dam.examenTema3.excepciones.InsuficientesDigitosException;
import es.corenetworks.dam.examenTema3.utilidades.Utilidades;

public class FuerzaBruta {
    private CajaFuerte cajaFuerte;
    private long tiempo;

    public FuerzaBruta(CajaFuerte cajaFuerte) {
        this.cajaFuerte = cajaFuerte;
        this.tiempo = 0;
    }

    public int sacarCombinacion() {
        int contraseñaEncontrada = -1;
        boolean exito = false;

        long inicio = Utilidades.getTime();

        for (int i = 1000; i <= 9999 && !exito; i++) {
            try {
                exito = cajaFuerte.checkearContrasenya(i);

                if (exito) {
                    contraseñaEncontrada = i;
                }
            } catch (InsuficientesDigitosException | ExcesivosDigitosException e) {
                
            }
        }

        long fin = Utilidades.getTime();
        tiempo = fin - inicio;

        return contraseñaEncontrada;
    }
    
    public long getTiempo() {
        return tiempo;
    }
    
}
