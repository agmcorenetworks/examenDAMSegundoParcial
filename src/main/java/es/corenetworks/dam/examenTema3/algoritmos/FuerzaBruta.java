package es.corenetworks.dam.examenTema3.algoritmos;


import es.corentetworks.dam.examenTema3.CajaFuerte;

public class FuerzaBruta {

    private CajaFuerte cajaFuerte;
    private long tiempo;

    public FuerzaBruta(CajaFuerte cajaFuerte) {
        this.cajaFuerte = cajaFuerte;
        this.tiempo = 0;
    }
		

    public long getTiempo() {
        return tiempo;
    }
}