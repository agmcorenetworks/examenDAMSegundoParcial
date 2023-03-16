package es.corenetworks.dam.examenTema3;

import java.util.InputMismatchException;

import java.util.Scanner;

import es.corenetworks.dam.examenTema3.excepciones.*;

import es.corenetworks.dam.examenTema3.utilidades.Constantes;

import es.corenetworks.dam.examenTema3.utilidades.Utilidades;

public class CajaFuerte {

	// Atribntos de la clase

	private int contrasenya;

	private int numeroIntentos;

	// Métodos para obtener contraseña y númeor de intentos
	public int getContrasenya() {

		return contrasenya;

	}

	public int getNumeroIntentos() {

		return numeroIntentos;

	}

	// constructor sin parámetros
	public CajaFuerte() {

		this.contrasenya = Utilidades.getNumero4Digitos();

	}

	// constructor con parámetros
	public CajaFuerte(int contrasenya) throws InsuficientesDigitosException, ExcesivosDigitosException {

		if (contrasenya < 1000) {

			throw new InsuficientesDigitosException(Constantes.DIGITOS_INSUFICIENTES);

		}

		if (contrasenya > 9999) {

			throw new ExcesivosDigitosException(Constantes.DIGITOS_EXCESIVOS);

		}

		this.contrasenya = contrasenya;

	}

	// Método pa comprobar la contraseña.

	public boolean checkearContrasenya(int contrasenya)
			throws InsuficientesDigitosException, ExcesivosDigitosException {

		if (contrasenya < 1000) {

			throw new InsuficientesDigitosException(Constantes.DIGITOS_INSUFICIENTES);

		}

		if (contrasenya > 9999) {

			throw new ExcesivosDigitosException(Constantes.DIGITOS_EXCESIVOS);

		}

		this.numeroIntentos++;

		return this.contrasenya == contrasenya;

	}

	// Método para abrir la cajaFuerte
	public void abrirCajaFuertePorConsola() throws DemasiadosIntentosException {

		@SuppressWarnings("resource") // Me daba la opción eclipse de poner esto para suprimir el warning. No se si es
										// correcto o debería haberlo dejado, ya te preguntaré cuando no estemos en un
										// examen jaja
		Scanner miScanner = new Scanner(System.in);

		int intentosRestantes = 3;

		while (intentosRestantes > 0) {

			System.out.print("Introduce la contraseña de 4 dígitos para abrir la caja fuerte: ");

			try {

				int contrasenya = miScanner.nextInt();

				if (checkearContrasenya(contrasenya)) {

					System.out.println("Ha abierto la caja fuerte.");

					break;

				} else {

					intentosRestantes--;

					System.out.println(
							"Contraseña incorrecta. Inténtalo de nuevo. Intentos restantes: " + intentosRestantes);

				}

			} catch (InsuficientesDigitosException e) {

				System.out.println("La contraseña introducida es demasiado corta. " + e.getMessage()
						+ " Intentos restantes: " + intentosRestantes);

				intentosRestantes--;

			} catch (ExcesivosDigitosException e) {

				System.out.println("La contraseña introducida es demasiado larga. " + e.getMessage()
						+ " Intentos restantes: " + intentosRestantes);

				intentosRestantes--;

			} catch (InputMismatchException e) {

				System.out.println("Entrada incorrecta. Debe introducir un número de 4 dígitos. Intentos restantes: "
						+ intentosRestantes);

				miScanner.next();

				intentosRestantes--;

			}

		}

		throw new DemasiadosIntentosException("Ha agotado las oportunidades");

	}

}