package es.corenetworks.dam.examenTema3.algoritmos;

import es.corenetworks.dam.examenTema3.CajaFuerte;
import es.corenetworks.dam.examenTema3.excepciones.ExcesivosDigitosException;
import es.corenetworks.dam.examenTema3.excepciones.InsuficientesDigitosException;
import es.corenetworks.dam.examenTema3.utilidades.Utilidades;

public class FuerzaBruta {
	CajaFuerte cajaFuerte;
	long tiempo;
	
	public FuerzaBruta(CajaFuerte cajaFuerte){
		this.cajaFuerte = cajaFuerte;
		tiempo=0;
	}
	public int sacarCombinacion() throws InsuficientesDigitosException, ExcesivosDigitosException {
		int contraseña=0;
		long inicio = 0;
		long fin = 0;
		
		inicio=Utilidades.getTime();
		for (int i=1000;i<=9999;i++)
		{
			if(cajaFuerte.checkearContrasenya(i)) {
				contraseña=i;
				fin=Utilidades.getTime();
			}
		}
		tiempo=fin-inicio;
		return contraseña;
	}
	public long getTiempo(){
		return tiempo;
	}
}
