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
import es.corenetworks.dam.examenTema3.excepciones.DemasiadosIntentosException;
import es.corenetworks.dam.examenTema3.excepciones.ExcesivosDigitosException;
import es.corenetworks.dam.examenTema3.excepciones.InsuficientesDigitosException;

public class Parte2 {
	
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
				CajaFuerte caja2 = new CajaFuerte(1234);
				assertEquals(1234, caja2.getContrasenya());

				CajaFuerte caja3 = new CajaFuerte(999);
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
		public void test_abrirCajaFuertePorConsola_1() throws UnsupportedEncodingException {
			InputStream is = System.in;
			PrintStream orig = System.out;

			System.setIn(new ByteArrayInputStream("4444\n".getBytes()));

			ByteArrayOutputStream os = new ByteArrayOutputStream();
			System.setOut(new PrintStream(os, false, "UTF-8"));

			try {
				CajaFuerte test = new CajaFuerte(4444);
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
				CajaFuerte test = new CajaFuerte(4444);
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
				CajaFuerte test = new CajaFuerte(4444);
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

	

}
