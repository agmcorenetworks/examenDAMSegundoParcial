package es.corenetworks.dam.examenTema3;

import java.util.Random;

import es.corenetworks.dam.examenTema3.algoritmos.FuerzaBruta;
import es.corenetworks.dam.examenTema3.excepciones.DemasiadosIntentosException;
import es.corenetworks.dam.examenTema3.excepciones.ExcesivosDigitosException;
import es.corenetworks.dam.examenTema3.excepciones.InsuficientesDigitosException;

public class ExamenSegundoParcial {

	public static void main(String[] args)
			throws InsuficientesDigitosException, ExcesivosDigitosException, DemasiadosIntentosException {

		CajaFuerte caja1 = new CajaFuerte();

		try {
			caja1.abrirCajaFuertePorConsola();
		} catch (DemasiadosIntentosException e) {
			System.out.println(e.getMessage());
		}

		for (int i = 0; i < 1000; i++) {
			int randomNum = new Random().nextInt(9000) + 1000;
			try {
				if (caja1.checkearContrasenya(randomNum)) {
					System.out.println("Caja fuerte abierta");
					break;
				}
			} catch (InsuficientesDigitosException | ExcesivosDigitosException e) {
				System.out.println(e.getMessage());
			}
		}

		int contrasenya = caja1.getContrasenya();
		try {
			if (caja1.checkearContrasenya(contrasenya)) {
				System.out.println("Caja fuerte abierta.");
			} else {
				System.out.println("Contraseña incorrecta.");
			}
		} catch (InsuficientesDigitosException | ExcesivosDigitosException e) {
			System.out.println(e.getMessage());
		}

		CajaFuerte caja2 = new CajaFuerte(1234);

		try {
			caja2.abrirCajaFuertePorConsola();
		} catch (DemasiadosIntentosException e) {
			System.out.println(e.getMessage());
		}

		try {
			if (caja2.checkearContrasenya(1234)) {
				System.out.println("Caja fuerte abierta.");
			} else {
				System.out.println("Contraseña incorrecta.");
			}
			if (caja2.checkearContrasenya(9999)) {
				System.out.println("Caja fuerte abierta.");
			} else {
				System.out.println("Contraseña incorrecta");
			}
			if (caja2.checkearContrasenya(0000)) {
				System.out.println("Caja fuerte abierta.");
			} else {
				System.out.println("Contraseña incorrecta.");
			}
		} catch (InsuficientesDigitosException | ExcesivosDigitosException e) {
			System.out.println(e.getMessage());
		}

		int contrasenya2 = caja2.getContrasenya();
		try {
			if (caja2.checkearContrasenya(contrasenya2)) {
				System.out.println("Caja fuerte abierta");
			} else {
				System.out.println("Contraseña incorrecta.");
			}
		} catch (InsuficientesDigitosException | ExcesivosDigitosException e) {
			System.out.println(e.getMessage());
		}
	}

	// Aquí iba el uso de la fuerza bruta para las cajas pero no encontraba un error
	// y después de mil intentos he decidido no entregar la parte porque me estaba
	// fastidiando el resto del código de tanto cambiar.

}
