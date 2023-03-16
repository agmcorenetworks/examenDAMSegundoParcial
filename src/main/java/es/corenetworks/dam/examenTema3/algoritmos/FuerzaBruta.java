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

    public String sacarCombinacion() {
        long inicio = Utilidades.getTime();
        for (int i = 1000; i <= 9999; i++) {
            try {
				if (cajaFuerte.checkearContrasenya(i)) {
				    long fin = Utilidades.getTime();
				    tiempo = fin - inicio;
				    return String.valueOf(i);
				}
			} catch (InsuficientesDigitosException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExcesivosDigitosException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        return null;
    }

    public long getTiempo() {
        return tiempo;
    }
}