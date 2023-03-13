package examenTema3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import es.corenetworks.dam.examenTema3.CajaFuerte;
import es.corenetworks.dam.examenTema3.algoritmos.Algoritmos;
import es.corenetworks.dam.examenTema3.excepciones.DemasiadosIntentosException;
import es.corenetworks.dam.examenTema3.excepciones.ExcesivosDigitosException;
import es.corenetworks.dam.examenTema3.excepciones.InsuficientesDigitosException;
import es.corenetworks.dam.examenTema3.utilidades.Constantes;
import es.corenetworks.dam.examenTema3.utilidades.Utilidades;

public class TestsJunit {

	// tests de constantes
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
			assertTrue(numero > 1000 && numero < 9999);
		}
	}

	@Test
	public void checkUtilidades_getMesDelAño() {

		assertEquals(Utilidades.getMesDelAño(1), "enero", "el mes no está bien");
		assertEquals(Utilidades.getMesDelAño(2), "febrero", "el mes no está bien");
		assertEquals(Utilidades.getMesDelAño(3), "marzo", "el mes no está bien");
		assertEquals(Utilidades.getMesDelAño(4), "abril", "el mes no está bien");
		assertEquals(Utilidades.getMesDelAño(5), "mayo", "el mes no está bien");
		assertEquals(Utilidades.getMesDelAño(6), "junio", "el mes no está bien");
		assertEquals(Utilidades.getMesDelAño(7), "julio", "el mes no está bien");
		assertEquals(Utilidades.getMesDelAño(8), "agosto", "el mes no está bien");
		assertEquals(Utilidades.getMesDelAño(9), "septiembre", "el mes no está bien");
		assertEquals(Utilidades.getMesDelAño(10), "octubre", "el mes no está bien");
		assertEquals(Utilidades.getMesDelAño(11), "noviembre", "el mes no está bien");
		assertEquals(Utilidades.getMesDelAño(12), "diciembre", "el mes no está bien");
		assertEquals(Utilidades.getMesDelAño(0), "No es un mes valido", "el caso defult esta mal");
		assertEquals(Utilidades.getMesDelAño(13), "No es un mes valido", "el caso defult esta mal");
	}

	@Test
	public void checkUtilidades_getTrimestreDelAño() {

		assertEquals(Utilidades.getTrimestreDelAño(1), "primer trimestre");
		assertEquals(Utilidades.getTrimestreDelAño(2), "primer trimestre");
		assertEquals(Utilidades.getTrimestreDelAño(3), "primer trimestre");
		assertEquals(Utilidades.getTrimestreDelAño(4), "segundo trimestre");
		assertEquals(Utilidades.getTrimestreDelAño(5), "segundo trimestre");
		assertEquals(Utilidades.getTrimestreDelAño(6), "segundo trimestre");
		assertEquals(Utilidades.getTrimestreDelAño(7), "tercer trimestre");
		assertEquals(Utilidades.getTrimestreDelAño(8), "tercer trimestre");
		assertEquals(Utilidades.getTrimestreDelAño(9), "tercer trimestre");
		assertEquals(Utilidades.getTrimestreDelAño(10), "cuarto trimestre");
		assertEquals(Utilidades.getTrimestreDelAño(11), "cuarto trimestre");
		assertEquals(Utilidades.getTrimestreDelAño(12), "cuarto trimestre");
		assertEquals(Utilidades.getTrimestreDelAño(0), "No es un mes valido");
		assertEquals(Utilidades.getTrimestreDelAño(13), "No es un mes valido");
	}

	@Test
	public void checkUtilidades_factorial() {

		assertEquals(Utilidades.factorial(2), 2);
		assertEquals(Utilidades.factorial(3), 6);
		assertEquals(Utilidades.factorial(4), 24);
		assertEquals(Utilidades.factorial(5), 120);
		assertEquals(Utilidades.factorial(6), 720);
		assertEquals(Utilidades.factorial(7), 5040);
		assertEquals(Utilidades.factorial(8), 40320);
		assertEquals(Utilidades.factorial(9), 362880);
		assertEquals(Utilidades.factorial(10), 3628800);
	}

	@Test
	public void test_checkExcepciones() throws ClassNotFoundException {
		Class.forName("es.corenetworks.dam.examenTema3.excepciones.DemasiadosIntentosException");
		Class.forName("es.corenetworks.dam.examenTema3.excepciones.ExcesivosDigitosException");
		Class.forName("es.corenetworks.dam.examenTema3.excepciones.InsuficientesDigitosException");
	}

	// ---------------------------------------------------------
	// TEsts de la caja fuerte
	@Test
	public void test_check_cajaFuerte_class() throws ClassNotFoundException {
		Class.forName("es.corenetworks.dam.examenTema3.CajaFuerte");
		Class.forName("es.corenetworks.dam.examenTema3.excepciones.ExcesivosDigitosException");
		Class.forName("es.corenetworks.dam.examenTema3.excepciones.InsuficientesDigitosException");
	}

	@Test
	public void test_check_cajaFuerteConstructor_sin_parametros() {
		CajaFuerte caja = new CajaFuerte();
		int pass = caja.getContrasenya();
		assertNotNull(caja);
		assertTrue(pass > 1000);
		assertTrue(pass < 9999);

		try {
			CajaFuerte caja2 = new CajaFuerte(1234, 4);
			assertEquals(1234, caja2.getContrasenya());

			CajaFuerte caja3 = new CajaFuerte(999, 4);
			Assertions.fail("Se debería de generar una excepcion");
		} catch (Exception e) {
			assertEquals(e.getMessage(), "El numero de digitos es insuficiente");
		}

	}

	@Test
	public void test_check_cajaFuerteConstructor_con_1_parametros() {

		try {

			CajaFuerte caja3 = new CajaFuerte(12345);
			Assertions.fail("Se debería de generar una excepcion");
		} catch (Exception e) {
			assertEquals(e.getMessage(), "El numero de digitos es excesivo");
		}

		try {
			CajaFuerte caja2 = new CajaFuerte(1234);
			assertEquals(1234, caja2.getContrasenya());
			assertTrue(caja2.checkearContrasenya(1234));
			assertFalse(caja2.checkearContrasenya(1235));
			assertFalse(caja2.checkearContrasenya(2342));
			assertFalse(caja2.checkearContrasenya(5674));
			assertFalse(caja2.checkearContrasenya(3467));
			assertFalse(caja2.checkearContrasenya(5476));
			assertFalse(caja2.checkearContrasenya(3452));
			assertFalse(caja2.checkearContrasenya(99));

			Assertions.fail("Se debería de generar una excepcion");
		} catch (Exception e) {
			assertEquals(e.getMessage(), "El numero de digitos es insuficiente");
		}

		try {
			CajaFuerte caja2 = new CajaFuerte(5555);
			assertFalse(caja2.checkearContrasenya(55555));

			Assertions.fail("Se debería de generar una excepcion");
		} catch (Exception e) {
			assertEquals(e.getMessage(), "El numero de digitos es excesivo");
		}

	}

	@Test
	public void test_check_cajaFuerteConstructor_con_2_parametros() {

		try {

			CajaFuerte caja3 = new CajaFuerte(12345, 4);
			Assertions.fail("Se debería de generar una excepcion");
		} catch (Exception e) {
			assertEquals(e.getMessage(), "El numero de digitos es excesivo");
		}

		try {
			CajaFuerte caja2 = new CajaFuerte(1234, 4);
			assertEquals(1234, caja2.getContrasenya());
			assertTrue(caja2.checkearContrasenya(1234));
			assertFalse(caja2.checkearContrasenya(1235));
			assertFalse(caja2.checkearContrasenya(2342));
			assertFalse(caja2.checkearContrasenya(5674));
			assertFalse(caja2.checkearContrasenya(3467));
			assertFalse(caja2.checkearContrasenya(5476));
			assertFalse(caja2.checkearContrasenya(3452));
			assertFalse(caja2.checkearContrasenya(99));

			Assertions.fail("Se debería de generar una excepcion");
		} catch (Exception e) {
			assertEquals(e.getMessage(), "El numero de digitos es insuficiente");
		}

		try {
			CajaFuerte caja2 = new CajaFuerte(5555, 4);
			assertFalse(caja2.checkearContrasenya(55555));

			Assertions.fail("Se debería de generar una excepcion");
		} catch (Exception e) {
			assertEquals(e.getMessage(), "El numero de digitos es excesivo");
		}

	}

	@Test
	public void test_abrirCajaFuertePorConsola_1() throws UnsupportedEncodingException {
		InputStream is = System.in;
		PrintStream orig = System.out;

		System.setIn(new ByteArrayInputStream("4444\n".getBytes()));

		ByteArrayOutputStream os = new ByteArrayOutputStream();
		System.setOut(new PrintStream(os, false, "UTF-8"));

		try {
			CajaFuerte test = new CajaFuerte(4444, 4);
			test.abrirCajaFuertePorConsola();

		} catch (InsuficientesDigitosException e1) {

			System.out.println(e1.getMessage());
		} catch (ExcesivosDigitosException e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
		} catch (DemasiadosIntentosException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} finally {
			System.setIn(is);
			System.setOut(orig);
			// Print 100 lines of "Hello World" here since out was restored
			System.out.println(os.toString("UTF-8"));
			assertEquals(
					"Introduzca la clave de la caja fuerte: Clave 4444 correcta\r\n" + "Ha abierto la caja fuerte.\r\n",
					os.toString());
		}
	}

	@Test
	public void test_abrirCajaFuertePorConsola_2() throws UnsupportedEncodingException {
		InputStream is = System.in;
		PrintStream orig = System.out;

		System.setIn(new ByteArrayInputStream("4441\n4444\n".getBytes()));

		ByteArrayOutputStream os = new ByteArrayOutputStream();
		System.setOut(new PrintStream(os, false, "UTF-8"));

		try {
			CajaFuerte test = new CajaFuerte(4444, 4);
			test.abrirCajaFuertePorConsola();
			assertTrue(test.checkearContrasenya(4444));
		} catch (InsuficientesDigitosException e1) {
			System.out.println(e1.getMessage());
		} catch (ExcesivosDigitosException e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
		} catch (DemasiadosIntentosException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} finally {
			System.setIn(is);
			System.setOut(orig);

		}
	}

	@Test
	public void test_abrirCajaFuertePorConsola_excepcion_demasiados_intentos() throws UnsupportedEncodingException {
		InputStream is = System.in;
		PrintStream orig = System.out;

		System.setIn(new ByteArrayInputStream("4441\n4442\n4443\n4445\n".getBytes()));

		ByteArrayOutputStream os = new ByteArrayOutputStream();
		System.setOut(new PrintStream(os, false, "UTF-8"));

		try {
			CajaFuerte test = new CajaFuerte(4444, 4);
			test.abrirCajaFuertePorConsola();

		} catch (InsuficientesDigitosException e1) {
			System.out.println(e1.getMessage());
		} catch (ExcesivosDigitosException e1) {
			System.out.println(e1.getMessage());
		} catch (DemasiadosIntentosException e) {
			System.out.println(e.getMessage());
			assertEquals(e.getMessage(), "Ha agotado las oportunidades");
		} finally {
			System.setIn(is);
			System.setOut(orig);
			// Print 100 lines of "Hello World" here since out was restored
			System.out.println(os.toString("UTF-8"));
		}
	}

	
	@Test
	public void test_abrirCajaFuerte_fuerzaBruta() {		
			int clave=7453;
			CajaFuerte micaja;
			try {
				micaja = new CajaFuerte(7453);
				assertEquals(clave,Algoritmos.fuerzaBruta(micaja));			
				micaja = new CajaFuerte();
				int claveDevuelta=Algoritmos.fuerzaBruta(micaja);
				assertTrue(claveDevuelta>1000 && claveDevuelta<9999);
				assertEquals(claveDevuelta, micaja.getContrasenya());
			} catch (InsuficientesDigitosException e) {
				e.printStackTrace();
			} catch (ExcesivosDigitosException e) {
				e.printStackTrace();
			}
	}
}
