package es.corenetworks.dam.examenTema3;

import es.corenetworks.dam.examenTema3.excepciones.DemasiadosIntentosException;
import es.corenetworks.dam.examenTema3.excepciones.ExcesivosDigitosException;
import es.corenetworks.dam.examenTema3.excepciones.InsuficientesDigitosException;
import es.corenetworks.dam.examenTema3.utilidades.Utilidades;

public class ExamenSegundoParcial {
	
	public static void main (String args []) throws InsuficientesDigitosException, ExcesivosDigitosException, DemasiadosIntentosException {
		
		CajaFuerte caja1 = new CajaFuerte();
		
		caja1.abrirCajaFuertePorConsola();
		
		int n = 0;
		
		if (n <= 1000) {
			while ( caja1.checkearContrasenya(Utilidades.getNumero4Digitos()) == false ) {
				n += 1;
			}
		}
		
		System.out.println("La contraseña de la caja fuerte es : " + caja1.getContrasenya());
		
		caja1.abrirCajaFuertePorConsola();
		
	}
	
}
