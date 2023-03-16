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
		tiempo = 0;
	}
	
	public long getTiempo() {
		return tiempo;
	}
	
	public int sacarCombinacion() {
		int salida = 0;
		long inicio = Utilidades.getTime();
		long fin = 0;
		for (int i=1000;i<=9999;i++) {
			if (i == 1000) {

			}
			try {
				boolean intento = cajaFuerte.checkearContrasenya(i);
				if (intento == true) {
					salida = i;
				}
			} catch (ExcesivosDigitosException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} catch (InsuficientesDigitosException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}
		fin = Utilidades.getTime();
		tiempo = fin - inicio;
		return salida;
	}
	
	public static void main(String[] args) {
		CajaFuerte caja1 = new CajaFuerte();
		FuerzaBruta fuerzaBruta	= new FuerzaBruta(caja1);
		System.out.println(fuerzaBruta.sacarCombinacion());
		System.out.println(fuerzaBruta.getTiempo());
	}
	
}
