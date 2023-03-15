package examenTema3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import es.corenetworks.dam.examenTema3.CajaFuerte;
import es.corenetworks.dam.examenTema3.algoritmos.FuerzaBruta;
import es.corenetworks.dam.examenTema3.excepciones.DemasiadosIntentosException;
import es.corenetworks.dam.examenTema3.excepciones.ExcesivosDigitosException;
import es.corenetworks.dam.examenTema3.excepciones.InsuficientesDigitosException;

public class Parte3 {
	
	
	
	@Test
	public void test_abrirCajaFuerte_fuerzaBruta() {		
			int clave=7453;
			CajaFuerte micaja;
			try {
				micaja = new CajaFuerte(7453);
				assertTrue(clave==micaja.getContrasenya());
				
				FuerzaBruta FuerzaBruta=new FuerzaBruta(micaja);
				
				assertEquals(clave,FuerzaBruta.sacarCombinacion());
				System.out.println("tiempo empleado en milisegundos: " + FuerzaBruta.getTiempo());
				assertTrue(FuerzaBruta.getTiempo()>0);
				
				
				CajaFuerte segundaCaja = new CajaFuerte(4345);
				FuerzaBruta=new FuerzaBruta(segundaCaja);
				assertEquals(4345,FuerzaBruta.sacarCombinacion());
				System.out.println("tiempo empleado en milisegundos: " + FuerzaBruta.getTiempo());
				assertTrue(FuerzaBruta.getTiempo()>0);
				segundaCaja.abrirCajaFuertePorConsola();	
				
				CajaFuerte terceraCaja= new CajaFuerte();
				FuerzaBruta=new FuerzaBruta(terceraCaja);
				int claveDevuelta=FuerzaBruta.sacarCombinacion();
				
				assertTrue(claveDevuelta>1000 && claveDevuelta<9999);
				assertEquals(claveDevuelta, micaja.getContrasenya());
			} catch (InsuficientesDigitosException e) {
				e.getMessage();
			} catch (ExcesivosDigitosException e) {
				e.getMessage();
			} catch (DemasiadosIntentosException e) {
				e.getMessage();

			}
	}


}
