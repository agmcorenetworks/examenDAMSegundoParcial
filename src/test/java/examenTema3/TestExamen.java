package examenTema3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import es.corenetworks.dam.examenTema3.CajaFuerte;
import es.corenetworks.dam.examenTema3.algoritmos.FuerzaBruta;
import es.corenetworks.dam.examenTema3.excepciones.DemasiadosIntentosException;
import es.corenetworks.dam.examenTema3.excepciones.ExcesivosDigitosException;
import es.corenetworks.dam.examenTema3.excepciones.InsuficientesDigitosException;

public class TestExamen {

	@Test
	public void test_abrirCajaFuerte_fuerzaBruta() {
		
		int clave = 5;
		
		switch (clave) {
		case 1:
			System.out.println("A");
		case 2:
			System.out.println("A");
		case 3:
			System.out.println("A");
			break;
		case 4:
			System.out.println("A");

		}

	}

}
