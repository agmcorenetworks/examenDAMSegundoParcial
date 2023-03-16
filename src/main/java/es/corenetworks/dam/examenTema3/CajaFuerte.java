package es.corenetworks.dam.examenTema3;

import java.util.Scanner;

import es.corenetworks.dam.examenTema3.excepciones.DemasiadosIntentosException;
import es.corenetworks.dam.examenTema3.excepciones.ExcesivosDigitosException;
import es.corenetworks.dam.examenTema3.excepciones.InsuficientesDigitosException;
import es.corenetworks.dam.examenTema3.utilidades.Constantes;
import es.corenetworks.dam.examenTema3.utilidades.Utilidades;

public class CajaFuerte {
	private int contrasenya;
	private int numeroIntentos;
	
	public CajaFuerte() {
		contrasenya = Utilidades.getNumero4Digitos();
	}
	
	public CajaFuerte(int contrasenya) throws InsuficientesDigitosException, ExcesivosDigitosException {
		if (contrasenya > 9999) {
			throw new ExcesivosDigitosException(Constantes.DIGITOS_EXCESIVOS);
		} else if (contrasenya < 1000) {
			throw new InsuficientesDigitosException(Constantes.DIGITOS_INSUFICIENTES);
		} else {
			this.contrasenya = contrasenya;
		}
	}
	
	public int getContrasenya() {
		return contrasenya;
	}
	public int getNNumeroIntentos() {
		return numeroIntentos;
	}
	
	public boolean checkearContrasenya(int numero) throws ExcesivosDigitosException, InsuficientesDigitosException {
		boolean salida = true;
		if (numero > 9999) {
			salida = false;
			throw new ExcesivosDigitosException(Constantes.DIGITOS_EXCESIVOS);
		} else if (numero < 1000) {
			salida = false;
			throw new InsuficientesDigitosException(Constantes.DIGITOS_INSUFICIENTES);
		} else if (numero != contrasenya) {
			salida = false;
		}
		return salida;
	}
	
	public void abrirCajaFuertePorConsola() throws DemasiadosIntentosException {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Por favor, introduzca un numero de 4 digitos: ");
		int numero = scanner.nextInt();
		try {
			checkearContrasenya(numero);
		} catch (ExcesivosDigitosException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (InsuficientesDigitosException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		while (true) {
			if (numero == contrasenya) {
				System.out.println("Ha abierto la caja fuerte");
				break;
			} else if (numero!=contrasenya && numeroIntentos < Constantes.NUMERO_INTENTOS_CAJA - 1){
				System.out.println("Contraseña incorrecta");
				numeroIntentos ++;
				System.out.print("Vuelva a introducir la contraseña: ");
				numero = scanner.nextInt();
				try {
					checkearContrasenya(numero);
				} catch (ExcesivosDigitosException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				} catch (InsuficientesDigitosException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
			} else if (numeroIntentos == Constantes.NUMERO_INTENTOS_CAJA - 1) {
				throw new DemasiadosIntentosException("Ha agotado las oportunidades");
			}
		}
	}
}
