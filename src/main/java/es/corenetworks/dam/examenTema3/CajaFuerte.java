package es.corenetworks.dam.examenTema3;

import java.util.Scanner;

import es.corenetworks.dam.examenTema3.excepciones.DemasiadosIntentosException;
import es.corenetworks.dam.examenTema3.excepciones.ExcesivosDigitosException;
import es.corenetworks.dam.examenTema3.excepciones.InsuficientesDigitosException;
import es.corenetworks.dam.examenTema3.utilidades.Constantes;
import es.corenetworks.dam.examenTema3.utilidades.Utilidades;

public class CajaFuerte {

	private static Scanner leerTeclado;
	private int contrasenya;
	private int numeroIntentos;

	public int getContrasenya() {
		return this.contrasenya;
	}

	public int getNumeroIntentos() {
		return this.numeroIntentos;
	}

	public CajaFuerte() {
		this.numeroIntentos = 4;
		this.contrasenya = Utilidades.getNumero4Digitos();
		leerTeclado = new Scanner(System.in);
	}

	public CajaFuerte(int contrasenya) throws InsuficientesDigitosException, ExcesivosDigitosException {
		this.numeroIntentos = 4;
		if (contrasenya < 1000) {
			throw new InsuficientesDigitosException(Constantes.DIGITOS_INSUFICIENTES);
		} else if (contrasenya > 9999)
			throw new ExcesivosDigitosException(Constantes.DIGITOS_EXCESIVOS);
		else {
			this.contrasenya = contrasenya;
			leerTeclado = new Scanner(System.in);
		}
	}

	public CajaFuerte(int contrasenya, int numeroIntentos)
			throws InsuficientesDigitosException, ExcesivosDigitosException {
		this.numeroIntentos = numeroIntentos;
		if (contrasenya < 1000) {
			throw new InsuficientesDigitosException(Constantes.DIGITOS_INSUFICIENTES);
		} else if (contrasenya > 9999)
			throw new ExcesivosDigitosException(Constantes.DIGITOS_EXCESIVOS);
		else {
			this.contrasenya = contrasenya;
			leerTeclado = new Scanner(System.in);
		}
	}

	public boolean checkearContrasenya(int paramContrasenya)
			throws InsuficientesDigitosException, ExcesivosDigitosException {
		boolean acertado = false;

		if (paramContrasenya < 1000) {
			throw new InsuficientesDigitosException(Constantes.DIGITOS_INSUFICIENTES);
		} else if (paramContrasenya > 9999)
			throw new ExcesivosDigitosException(Constantes.DIGITOS_EXCESIVOS);
		else {
			if (paramContrasenya == contrasenya) {
				System.out.println("Clave " + paramContrasenya + " correcta");
				acertado = true;
			} else {
				System.out.println("Clave " + paramContrasenya + " incorrecta");
			}
			return acertado;
		}

	}

	public void abrirCajaFuertePorConsola() throws DemasiadosIntentosException {

		int intentos = 4;
		int numeroIntroducido;
		boolean acertado = false;

		do {

			System.out.print("Introduzca la clave de la caja fuerte: ");
			numeroIntroducido = Integer.parseInt(leerTeclado.nextLine());
			try {
				acertado = checkearContrasenya(numeroIntroducido);
			} catch (InsuficientesDigitosException e) {
				System.out.println(e.getMessage());
			} catch (ExcesivosDigitosException e) {
				System.out.println(e.getMessage());
			}
			intentos--;

		} while ((intentos > 0) && (!acertado));

		if (acertado) {
			System.out.println("Ha abierto la caja fuerte.");
		} else {
			throw new DemasiadosIntentosException("Ha agotado las oportunidades");
		}
	}

}
