package es.corenetworks.dam.examenTema3.algoritmos;

import es.corenetworks.dam.examenTema3.CajaFuerte;
import es.corenetworks.dam.examenTema3.excepciones.ExcesivosDigitosException;
import es.corenetworks.dam.examenTema3.excepciones.InsuficientesDigitosException;
import es.corenetworks.dam.examenTema3.utilidades.Utilidades;

public class FuerzaBruta {
	
	private long tiempo;
	private CajaFuerte cajaFuerte;
	
	public FuerzaBruta(CajaFuerte cajaFuerte) {
		this.cajaFuerte=cajaFuerte;
	}

	public int sacarCombinacion() {
		System.out.println("Realizando fuerza bruta con contraseña");
		int a = 1000;
		boolean encontrado = false;
		long inicio = Utilidades.getTime();
		long fin;
		int clave=1000;
		while (!encontrado) {
			try {
				encontrado = cajaFuerte.checkearContrasenya(a);
			} catch (InsuficientesDigitosException e) {
				System.out.println(e.getMessage());
			} catch (ExcesivosDigitosException e) {
				System.out.println(e.getMessage());
			}
			if (encontrado) {
				clave=a;
				fin = Utilidades.getTime();
				tiempo=fin - inicio;
				System.out.println("contraseña encontrada: " + a);
				System.out.println("tiempo empleado en milisegundos: " + (fin - inicio));
			}
			a++;
		}
		return clave;
	}
	
	public long getTiempo() {
		return tiempo;
	}

}
