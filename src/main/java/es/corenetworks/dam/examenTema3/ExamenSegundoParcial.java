package es.corenetworks.dam.examenTema3;

import es.corenetworks.dam.examenTema3.utilidades.Constantes;
import es.corenetworks.dam.examenTema3.utilidades.Utilidades;
import es.corenetworks.dam.examenTema3.CajaFuerte;
import es.corenetworks.dam.examenTema3.excepciones.DemasiadosIntentosException;
import es.corenetworks.dam.examenTema3.excepciones.ExcesivosDigitosException;
import es.corenetworks.dam.examenTema3.excepciones.InsuficientesDigitosException;

public class ExamenSegundoParcial {

	public static void main(String[] args) {
		//CAJA 1
		CajaFuerte caja1 = new CajaFuerte();
		
		//ABRIR CAJA FUERTE
		try {
			caja1.abrirCajaFuertePorConsola();
		} catch (InsuficientesDigitosException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (ExcesivosDigitosException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (DemasiadosIntentosException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		
		//OBTENER LA CLAVE
		System.out.println(caja1.getContrasenya());
		
		
		//CAJA2
		
		CajaFuerte caja2 = null;
		try {
			caja2 = new CajaFuerte(3456);
		} catch (InsuficientesDigitosException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ExcesivosDigitosException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//ABRIR CAJA FUERTE
		try {
			caja1.abrirCajaFuertePorConsola();
		} catch (InsuficientesDigitosException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExcesivosDigitosException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DemasiadosIntentosException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		//CHECKEAR
		try {
			caja2.checkearContrasenya(3456);
		} catch (InsuficientesDigitosException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExcesivosDigitosException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//OBTENER CONTRASEÑA
		System.out.println(caja2.getContrasenya());
	}

}
