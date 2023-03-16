package es.corenetworks.dam.examenTema3;

import java.util.Scanner;

import es.corenetworks.dam.examenTema3.excepciones.DemasiadosIntentosException;
import es.corenetworks.dam.examenTema3.excepciones.ExcesivosDigitosException;
import es.corenetworks.dam.examenTema3.excepciones.InsuficientesDigitosException;
import es.corenetworks.dam.examenTema3.utilidades.Utilidades;
import es.corenetworks.dam.examenTema3.utilidades.Constantes;

public class CajaFuerte {

	private int contrasenya;
	private int numeroIntentos = Constantes.NUMERO_INTENTOS_CAJA;

	// CONSTRUCTOR SIN PARAMETROS
	public CajaFuerte() {
		this.contrasenya = Utilidades.getNumeroDigitos();
	}

	// CONSTRUCTOR CON PARAMETROS Y COMPROBACION
	public CajaFuerte(int contrasenya) throws InsuficientesDigitosException, ExcesivosDigitosException {
		if (contrasenya < 1000) {
			throw new InsuficientesDigitosException(Constantes.DIGITOS_INSUFICIENTES);
		} else if (contrasenya > 9999) {
			throw new ExcesivosDigitosException(Constantes.DIGITOS_EXCESIVOS);
		} else {
			this.contrasenya = contrasenya;
		}
	}

	// METODO CHEQUEAR CONTRASEÑA
	public boolean checkearContrasenya(int numero) throws InsuficientesDigitosException, ExcesivosDigitosException {
		if (numero < 1000) {
			throw new InsuficientesDigitosException(Constantes.DIGITOS_INSUFICIENTES);
		} else if (numero > 9999) {
			throw new ExcesivosDigitosException(Constantes.DIGITOS_EXCESIVOS);
		} else if (this.contrasenya == numero) {
			return true;
		} else {
			return false;
		}
	}

	public void abrirCajaFuertePorConsola()
			throws InsuficientesDigitosException, ExcesivosDigitosException, DemasiadosIntentosException {
		int intentosRestantes = 0;
		Scanner scanner = new Scanner(System.in);
		intentosRestantes = Constantes.NUMERO_INTENTOS_CAJA;

		while (intentosRestantes > 0) {
			System.out.print("Introduzca la contraseña de 4 dígitos: ");
			int numeroIngresado = scanner.nextInt();

			if (checkearContrasenya(numeroIngresado)) {
				System.out.println("Ha abierto la caja fuerte");
				return; 
			} else {
				intentosRestantes--;
			}
			if (intentosRestantes == 0) {

				throw new DemasiadosIntentosException("Has agotado las oportunidades");
			}
		}
	}

	public int getContrasenya() {
		return this.contrasenya;
	}

	public int getNumeroIntentos() {
		return this.numeroIntentos;
	}

}
