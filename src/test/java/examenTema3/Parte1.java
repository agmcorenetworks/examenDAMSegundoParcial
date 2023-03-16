package examenTema3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import es.corenetworks.dam.examenTema3.excepciones.MesNoValidoException;
import es.corenetworks.dam.examenTema3.utilidades.Constantes;
import es.corenetworks.dam.examenTema3.utilidades.Utilidades;

public class Parte1 {

	// ---------------------------------------------------------
	// tests de constantes
	
	
	//Comentar los tests que esten fallando y no se quieran lanzar asÃ­:
/*
	@Test()
	public void checkClassConstantes() throws ClassNotFoundException {
		Class.forName("es.corenetworks.dam.examenTema3.utilidades.Constantes");
	}
*/
	
	@Test()
	public void checkClassConstantes() throws ClassNotFoundException {
		Class.forName("es.corenetworks.dam.examenTema3.utilidades.Constantes");
	}

	@Test()
	public void checkConstantesMesNumero() throws ClassNotFoundException {
		assertTrue(Constantes.MES_ENERO == 1);
		assertTrue(Constantes.MES_FEBRERO == 2);
		assertTrue(Constantes.MES_MARZO == 3);
		assertTrue(Constantes.MES_ABRIL == 4);
		assertTrue(Constantes.MES_MAYO == 5);
		assertTrue(Constantes.MES_JUNIO == 6);
		assertTrue(Constantes.MES_JULIO == 7);
		assertTrue(Constantes.MES_AGOSTO == 8);
		assertTrue(Constantes.MES_SEPTIEMBRE == 9);
		assertTrue(Constantes.MES_OCTUBRE == 10);
		assertTrue(Constantes.MES_NOVIEMBRE == 11);
		assertTrue(Constantes.MES_DICIEMBRE == 12);
	}

	@Test()
	public void checkConstantesMesNobre() throws ClassNotFoundException {
		assertEquals(Constantes.NOMBRE_MES_ENERO, "enero");
		assertEquals(Constantes.NOMBRE_MES_FEBRERO, "febrero");
		assertEquals(Constantes.NOMBRE_MES_MARZO, "marzo");
		assertEquals(Constantes.NOMBRE_MES_ABRIL, "abril");
		assertEquals(Constantes.NOMBRE_MES_MAYO, "mayo");
		assertEquals(Constantes.NOMBRE_MES_JUNIO, "junio");
		assertEquals(Constantes.NOMBRE_MES_JULIO, "julio");
		assertEquals(Constantes.NOMBRE_MES_AGOSTO, "agosto");
		assertEquals(Constantes.NOMBRE_MES_SEPTIEMBRE, "septiembre");
		assertEquals(Constantes.NOMBRE_MES_OCTUBRE, "octubre");
		assertEquals(Constantes.NOMBRE_MES_NOVIEMBRE, "noviembre");
		assertEquals(Constantes.NOMBRE_MES_DICIEMBRE, "diciembre");
		assertEquals(Constantes.NOMBRE_MES_NO_VALIDO, "No es un mes valido");

	}

	@Test()
	public void checkConstantesCajaFuerte() throws ClassNotFoundException {
		assertTrue(Constantes.NUMERO_INTENTOS_CAJA == 4);
		assertEquals(Constantes.DIGITOS_INSUFICIENTES, "El numero de digitos es insuficiente");
		assertEquals(Constantes.DIGITOS_EXCESIVOS, "El numero de digitos es excesivo");
	}

	// TEsts de utilidades
	@Test()
	public void checkClassUtilidades() throws ClassNotFoundException {
		Class.forName("es.corenetworks.dam.examenTema3.utilidades.Utilidades");
	}

	@Test
	public void checkUtilidades_getNumero4Digitos() {
		for (int i = 0; i < 100; i++) {
			int numero = Utilidades.getNumero4Digitos();
			System.out.println("numero: "+numero);
			assertTrue(numero > 1000 && numero < 9999);
		}
	}

	@Test
	public void checkUtilidades_getMesDelAño() {

		try {
			assertEquals(Utilidades.getMesDelAño(1), "enero", "el mes no estÃ¡ bien");
			assertEquals(Utilidades.getMesDelAño(2), "febrero", "el mes no estÃ¡ bien");
			assertEquals(Utilidades.getMesDelAño(3), "marzo", "el mes no estÃ¡ bien");
			assertEquals(Utilidades.getMesDelAño(4), "abril", "el mes no estÃ¡ bien");
			assertEquals(Utilidades.getMesDelAño(5), "mayo", "el mes no estÃ¡ bien");
			assertEquals(Utilidades.getMesDelAño(6), "junio", "el mes no estÃ¡ bien");
			assertEquals(Utilidades.getMesDelAño(7), "julio", "el mes no estÃ¡ bien");
			assertEquals(Utilidades.getMesDelAño(8), "agosto", "el mes no estÃ¡ bien");
			assertEquals(Utilidades.getMesDelAño(9), "septiembre", "el mes no estÃ¡ bien");
			assertEquals(Utilidades.getMesDelAño(10), "octubre", "el mes no estÃ¡ bien");
			assertEquals(Utilidades.getMesDelAño(11), "noviembre", "el mes no estÃ¡ bien");
			assertEquals(Utilidades.getMesDelAño(12), "diciembre", "el mes no estÃ¡ bien");
			assertEquals(Utilidades.getMesDelAño(0), "No es un mes valido", "el caso defult esta mal");
			assertEquals(Utilidades.getMesDelAño(13), "No es un mes valido", "el caso defult esta mal");
		} catch (MesNoValidoException e) {
			assertEquals(e.getMessage(), "No es un mes valido", "el caso defult esta mal");

		}

	}

	@Test
	public void checkUtilidades_getTrimestreDelAño() {

		try {
			assertEquals(Utilidades.getTrimestreDelAño(1), "primer trimestre");
		} catch (MesNoValidoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		try {
			assertEquals(Utilidades.getTrimestreDelAño(2), "primer trimestre");
		} catch (MesNoValidoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		try {
			assertEquals(Utilidades.getTrimestreDelAño(3), "primer trimestre");
		} catch (MesNoValidoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		try {
			assertEquals(Utilidades.getTrimestreDelAño(4), "segundo trimestre");
		} catch (MesNoValidoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		try {
			assertEquals(Utilidades.getTrimestreDelAño(5), "segundo trimestre");
		} catch (MesNoValidoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		try {
			assertEquals(Utilidades.getTrimestreDelAño(6), "segundo trimestre");
		} catch (MesNoValidoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		try {
			assertEquals(Utilidades.getTrimestreDelAño(7), "tercer trimestre");
		} catch (MesNoValidoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		try {
			assertEquals(Utilidades.getTrimestreDelAño(8), "tercer trimestre");
		} catch (MesNoValidoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		try {
			assertEquals(Utilidades.getTrimestreDelAño(9), "tercer trimestre");
		} catch (MesNoValidoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		try {
			assertEquals(Utilidades.getTrimestreDelAño(10), "cuarto trimestre");
		} catch (MesNoValidoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		try {
			assertEquals(Utilidades.getTrimestreDelAño(11), "cuarto trimestre");
		} catch (MesNoValidoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		try {
			assertEquals(Utilidades.getTrimestreDelAño(12), "cuarto trimestre");
		} catch (MesNoValidoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		try {
			assertEquals(Utilidades.getTrimestreDelAño(0), "No es un mes valido");
		} catch (MesNoValidoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		try {
			assertEquals(Utilidades.getTrimestreDelAño(13), "No es un mes valido");
		} catch (MesNoValidoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void checkUtilidades_bucleWhile() {
		assertTrue(6 == Utilidades.bucleWhile());

	}
	
	@Test
	public void checkUtilidades_bucleDoWhile() {
		assertTrue(157 == Utilidades.bucleDoWhile());
	}

	@Test
	public void test_checkExcepciones() throws ClassNotFoundException {
		Class.forName("es.corenetworks.dam.examenTema3.excepciones.DemasiadosIntentosException");
		Class.forName("es.corenetworks.dam.examenTema3.excepciones.ExcesivosDigitosException");
		Class.forName("es.corenetworks.dam.examenTema3.excepciones.InsuficientesDigitosException");
	}

}
