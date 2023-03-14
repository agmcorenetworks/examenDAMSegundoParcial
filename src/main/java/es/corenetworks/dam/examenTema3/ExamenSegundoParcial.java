package es.corenetworks.dam.examenTema3;

import es.corenetworks.dam.examenTema3.algoritmos.FuerzaBruta;
import es.corenetworks.dam.examenTema3.excepciones.DemasiadosIntentosException;
import es.corenetworks.dam.examenTema3.excepciones.ExcesivosDigitosException;
import es.corenetworks.dam.examenTema3.excepciones.InsuficientesDigitosException;

public class ExamenSegundoParcial {

	public static void main(String[] args) {
		try {
			CajaFuerte micaja = new CajaFuerte();
			FuerzaBruta FuerzaBruta=new FuerzaBruta(micaja);
			FuerzaBruta.sacarCombinacion();
			System.out.println("tiempo empleado en milisegundos: " + FuerzaBruta.getTiempo());
			CajaFuerte segundaCaja = new CajaFuerte(4345,4);
			segundaCaja.abrirCajaFuertePorConsola();
		} catch (DemasiadosIntentosException e) {
			System.out.println("error: " + e.getMessage());
		} catch (InsuficientesDigitosException e) {
			System.out.println("error: " + e.getMessage());

		} catch (ExcesivosDigitosException e) {
			System.out.println("error: " + e.getMessage());

		}
	}
}
