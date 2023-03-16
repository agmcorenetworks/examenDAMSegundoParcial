package es.corenetworks.dam.examenTema3;

import es.corenetworks.dam.examenTema3.excepciones.DemasiadosIntentosException;
import es.corenetworks.dam.examenTema3.excepciones.ExcesivosDigitosException;
import es.corenetworks.dam.examenTema3.excepciones.InsuficientesDigitosException;
import es.corenetworks.dam.examenTema3.utilidades.Constantes;
import es.corenetworks.dam.examenTema3.utilidades.Utilidades;
import java.util.Scanner;

public class CajaFuerte {

	private static int contrasenya = Utilidades.getNumero4Digitos();
	private static int numeroIntentos;

	public static int getContrasenya() {
		return contrasenya;
	}

	public static int getNumeroIntentos() {
		return numeroIntentos;
	}

	public CajaFuerte() {
		contrasenya = Utilidades.getNumero4Digitos();
	}

	public CajaFuerte(int password) throws InsuficientesDigitosException, ExcesivosDigitosException {
		if (password < 1000) {
			throw new InsuficientesDigitosException(Constantes.DIGITOS_INSUFICIENTES);
		} else if (password > 9999) {
			throw new ExcesivosDigitosException(Constantes.DIGITOS_EXCESIVOS);
		} else {
			contrasenya = password;
		}
	}

	public static boolean checkearContrasenya(int cnt) throws InsuficientesDigitosException, ExcesivosDigitosException {
		if (cnt < 1000) {
			throw new InsuficientesDigitosException(Constantes.DIGITOS_INSUFICIENTES);
		} else if (cnt > 9999) {
			throw new ExcesivosDigitosException(Constantes.DIGITOS_EXCESIVOS);
		} else if (cnt == contrasenya) {
			return true;
		} else {
			return false;
		}
	}

	public static void abrirCajaFuertePorConsola()
			throws InsuficientesDigitosException, ExcesivosDigitosException, DemasiadosIntentosException {

		Scanner consola = new Scanner(System.in);

		while (true) {

			System.out.println("Introduce un número de cuatro dígitos: ");

			int cnt = consola.nextInt();

			try {

				if (numeroIntentos > Constantes.NUMERO_INTENTOS_CAJA) {
					throw new DemasiadosIntentosException("Ha agotado las oportunidades");
				}
			} catch (DemasiadosIntentosException e) {
				System.out.println(e.getMessage());
				break;
			}

			try {
				checkearContrasenya(cnt);
				if (cnt == contrasenya) {
					System.out.println("Ha abierto la caja fuerte.");
					break;
				}
			} catch (InsuficientesDigitosException e) {
				System.out.println(e.getMessage());
				;
				numeroIntentos += 1;
			} catch (ExcesivosDigitosException e) {
				System.out.println(e.getMessage());
				numeroIntentos += 1;
			}

		}

	}
	
}
