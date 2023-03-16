package es.corenetworks.dam.examenTema3;

import es.corenetworks.dam.examenTema3.excepciones.DemasiadosIntentosException;
import es.corenetworks.dam.examenTema3.excepciones.InsuficientesDigitosException;
import es.corenetworks.dam.examenTema3.utilidades.Utilidades;

public class ExamenSegundoParcial {

	public static void main(String[] args) throws InsuficientesDigitosException {
		CajaFuerte caja1 = new CajaFuerte();
		
		try {
			caja1.abrirCajaFuertePorConsola();
		} catch (InsuficientesDigitosException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DemasiadosIntentosException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i=0; i<100; i++) {
		caja1.checkearContrasenya(Utilidades.getNumero4Digitos());
		}
		
		caja1.getContrasenya();
		
		
		
		CajaFuerte caja2 = new CajaFuerte(5678);
		
		try {
			caja2.abrirCajaFuertePorConsola();
		} catch (InsuficientesDigitosException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DemasiadosIntentosException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		caja2.checkearContrasenya(578);
		caja2.checkearContrasenya(5222);
		
		caja2.checkearContrasenya(caja2.getContrasenya());
		
		
		
		
	}

}
