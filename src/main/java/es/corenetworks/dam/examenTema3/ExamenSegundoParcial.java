package es.corenetworks.dam.examenTema3;

import es.corenetworks.dam.examenTema3.algoritmos.FuerzaBruta;
import es.corenetworks.dam.examenTema3.excepciones.ExcesivosDigitosException;
import es.corenetworks.dam.examenTema3.excepciones.InsuficientesDigitosException;
import es.corenetworks.dam.examenTema3.utilidades.Utilidades;

public class ExamenSegundoParcial {

	public static void main(String[] args) throws InsuficientesDigitosException, ExcesivosDigitosException {
		CajaFuerte caja1 = new CajaFuerte();
		/*System.out.println(caja1.getContrasenya());
		caja1.abrirCajaFuertePorConsola();
		for (int i=0;i<1000;i++) {
		caja1.checkearContrasenya(Utilidades.getNumero4Digitos());
		}
		CajaFuerte caja2 = new CajaFuerte(1000,4);
		System.out.println(caja2.getContrasenya());
		caja2.abrirCajaFuertePorConsola();
		caja2.checkearContrasenya(2000);
		caja2.checkearContrasenya(3000);
		caja2.checkearContrasenya(1000);*/
		
		FuerzaBruta fuerza1= new FuerzaBruta(caja1);
		fuerza1.sacarCombinacion();
		System.out.println(fuerza1.getTiempo());
	}
}
