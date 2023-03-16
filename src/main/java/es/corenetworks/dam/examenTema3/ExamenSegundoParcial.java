package es.corenetworks.dam.examenTema3;

import es.corenetworks.dam.examenTema3.excepciones.DemasiadosIntentosException;
import es.corenetworks.dam.examenTema3.excepciones.ExcesivosDigitosException;
import es.corenetworks.dam.examenTema3.excepciones.InsuficientesDigitosException;

public class ExamenSegundoParcial {

	public static void main(String[] args) {
		CajaFuerte caja1 = new CajaFuerte();
		try {
			caja1.abrirCajaFuertePorConsola();
		} catch (DemasiadosIntentosException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		for (int i = 0;i<1000;i++) {
			try {
				System.out.println(caja1.checkearContrasenya((int)(Math.random()*9999+1000))); 
			} catch (ExcesivosDigitosException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} catch (InsuficientesDigitosException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println(caja1.getContrasenya());
		
		try {
			caja1.abrirCajaFuertePorConsola();
		} catch (DemasiadosIntentosException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		try {
			CajaFuerte caja2 = new CajaFuerte(8888);
			try {
				caja2.abrirCajaFuertePorConsola();
			} catch (DemasiadosIntentosException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			System.out.println(caja2.checkearContrasenya(1234));
			System.out.println(caja2.checkearContrasenya(9876));
			System.out.println(caja2.checkearContrasenya(8888));
			System.out.println(caja2.getContrasenya());
			try {
				caja2.abrirCajaFuertePorConsola();
			} catch (DemasiadosIntentosException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		} catch (InsuficientesDigitosException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (ExcesivosDigitosException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}

}
