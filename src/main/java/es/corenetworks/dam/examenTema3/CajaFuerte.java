package es.corenetworks.dam.examenTema3;

import java.util.Scanner;

import es.corenetworks.dam.examenTema3.excepciones.ExcesivosDigitosException;
import es.corenetworks.dam.examenTema3.excepciones.InsuficientesDigitosException;
import es.corenetworks.dam.examenTema3.utilidades.Constantes;
import es.corenetworks.dam.examenTema3.utilidades.Utilidades;

public class CajaFuerte {
	private int contrasenya;
	private int numeroIntentos;
	
	public int getContrasenya(){
		return contrasenya;
	}
	public void getNumerosIntentos(int numeroIntentos){
		this.numeroIntentos=numeroIntentos;
	}
	
	CajaFuerte() throws InsuficientesDigitosException, ExcesivosDigitosException{
		if(Utilidades.getNumero4Digitos()<1000){
			throw new InsuficientesDigitosException(Constantes.DIGITOS_INSUFICIENTES);
		}
		else if(Utilidades.getNumero4Digitos()>9999){
			throw new ExcesivosDigitosException(Constantes.DIGITOS_EXCESIVOS);
		}
		else {
		contrasenya= Utilidades.getNumero4Digitos();
		}
		numeroIntentos=Constantes.NUMERO_INTENTOS_CAJA;
	}
	CajaFuerte(int contrasenya, int numeroIntentos) throws InsuficientesDigitosException, ExcesivosDigitosException{
		if(contrasenya<1000){
			throw new InsuficientesDigitosException(Constantes.DIGITOS_INSUFICIENTES);
		}
		else if(contrasenya>9999){
			throw new ExcesivosDigitosException(Constantes.DIGITOS_EXCESIVOS);
		}
		else {
		this.contrasenya= contrasenya;
		}
		this.numeroIntentos=numeroIntentos;
	}
	
	public boolean checkearContrasenya(int num) throws InsuficientesDigitosException, ExcesivosDigitosException {
		boolean salida=false;
		if (num<1000){
			throw new InsuficientesDigitosException(Constantes.DIGITOS_INSUFICIENTES);		
		}
		else if(num>9999){
			throw new ExcesivosDigitosException(Constantes.DIGITOS_EXCESIVOS);
		}
		else if (num==contrasenya) {
			salida=true;
		}
		return salida;
	}
	void abrirCajaFuertePorConsola() throws InsuficientesDigitosException, ExcesivosDigitosException{
		int contador=1;
		while(contador<=Constantes.NUMERO_INTENTOS_CAJA) {
			Scanner entrada= new Scanner(System.in);
			contador++;
			int prueba = entrada.nextInt();
			checkearContrasenya(prueba);
			if (prueba==contrasenya) {
				System.out.println("Ha abierto la caja fuerte");
				break;
			}
		}//cierre while
		if (contador>Constantes.NUMERO_INTENTOS_CAJA)
		{
			System.out.println("Ha agotado las oportunidades");
		}	
	}//cierre metodo
	
}
