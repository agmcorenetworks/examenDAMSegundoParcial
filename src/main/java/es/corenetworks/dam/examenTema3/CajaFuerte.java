package es.corenetworks.dam.examenTema3;

import java.util.Scanner;

import es.corenetworks.dam.examenTema3.excepciones.DemasiadosIntentosException;
import es.corenetworks.dam.examenTema3.excepciones.InsuficientesDigitosException;
import es.corenetworks.dam.examenTema3.utilidades.Constantes;
import es.corenetworks.dam.examenTema3.utilidades.Utilidades;

public class CajaFuerte {
	private int contrasenya;
	private int numeroIntentos = Constantes.NUMERO_INTENTOS_CAJA;
	
	
	public CajaFuerte() {
		contrasenya = Utilidades.getNumero4Digitos();
	}
	
	public CajaFuerte(int contrasenya) throws InsuficientesDigitosException {
		if (contrasenya>=1000 && contrasenya<=9999) {
			this.contrasenya = contrasenya;
		}else if (contrasenya <1000){
			throw new InsuficientesDigitosException(Constantes.DIGITOS_INSUFICIENTES);
		}else {
			throw new InsuficientesDigitosException(Constantes.DIGITOS_EXCESIVOS);
		}
		
	}
	
	
	public int getContrasenya() {
		return contrasenya;
	}
	
	
	public int getNumeroIntentos() {
		return numeroIntentos;
	}
	
	
	public boolean checkearContrasenya(int num) throws InsuficientesDigitosException {
		boolean estado = false;
		if (num>=1000 && num<=9999 && (num == contrasenya)) {
			
			estado = true;
		}else if (num <1000){
			
			throw new InsuficientesDigitosException(Constantes.DIGITOS_INSUFICIENTES);
		}else if (num >9999){
			
			throw new InsuficientesDigitosException(Constantes.DIGITOS_EXCESIVOS);
		}
		return estado;
	}
	
	
	public void abrirCajaFuertePorConsola() throws InsuficientesDigitosException, DemasiadosIntentosException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número entero: ");
		int num = sc.nextInt();
		boolean estado = checkearContrasenya(num);
		int contador = 0;
		
		if(estado=true) {
			System.out.println("Ha abierto la caja fuerte");
		}else if (estado ==false){
			if(contador == numeroIntentos) {
				throw new DemasiadosIntentosException("Ha agotado las oportunidades");
			}else {
				while(estado ==false) {
					System.out.println("Introduce otro numero entero: ");
					 num = sc.nextInt();
					 contador++;
			}
			
				 
			}
		}
	 }
	

}
