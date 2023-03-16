package es.corentetworks.dam.examenTema3;

import java.util.Scanner;

import es.corenetworks.dam.examenTema3.excepciones.DemasiadosIntentosException;
import es.corenetworks.dam.examenTema3.excepciones.ExcesivosDigitosException;
import es.corenetworks.dam.examenTema3.excepciones.InsuficientesDigitosException;
import es.corenetworks.dam.examenTema3.utilidades.Constantes;
import es.corenetworks.dam.examenTema3.utilidades.Utilidades;

public class CajaFuerte {
	//Atributos de CajaFuerte
	private int contrasenya;
	private int numeroIntentos;
	
	//Constructor sin parámetros
	 public CajaFuerte() {
	        this.contrasenya = Utilidades.getNumero4Digitos();
	        this.numeroIntentos = 0;
	    }
	
	//Métodos para obtener la contraseña y el numero de intentos
	public int getContrasenya() {
		return contrasenya;
	}
	
	public int getNumeroIntentos() {
		return numeroIntentos;
	}
	
	
	//Constructor que indicará la contraseña, si no esta comprendida entre 1000 y 9999 saltarán las excepciones, sino, se le asignará el valor dado
	  public CajaFuerte(int contrasenya) throws InsuficientesDigitosException, ExcesivosDigitosException {
	        if (contrasenya < 1000) {
	            throw new InsuficientesDigitosException(Constantes.DIGITOS_INSUFICIENTES);
	        }
	        if (contrasenya > 9999) {
	            throw new ExcesivosDigitosException(Constantes.DIGITOS_EXCESIVOS);
	        }
	        this.contrasenya = contrasenya;
	        this.numeroIntentos = 0;
	    }
	  
	  public boolean checkearContrasenya(int numero) throws InsuficientesDigitosException, ExcesivosDigitosException {
	        if (numero < 1000) {
	            throw new InsuficientesDigitosException(Constantes.DIGITOS_INSUFICIENTES);
	        }
	        if (numero > 9999) {
	            throw new ExcesivosDigitosException(Constantes.DIGITOS_EXCESIVOS);
	        }
	        numeroIntentos++;
	        return numero == contrasenya;
	  }
	  
	  
	  public void abrirCajaFuertePorConsola() throws DemasiadosIntentosException {
	        Scanner sc = new Scanner(System.in);
	        boolean acertado = false;
	        while (numeroIntentos < 4 && !acertado) {
	            try {
	                System.out.print("Introduzca la contraseña de la caja fuerte: ");
	                int numero = sc.nextInt();
	                acertado = checkearContrasenya(numero);
	                if (acertado) {
	                    System.out.println("Has abierto la caja fuerte");
	                } else {
	                    System.out.println("Contraseña incorrecta");
	                }
	            } catch (InsuficientesDigitosException | ExcesivosDigitosException e) {
	                System.out.println(e.getMessage());
	            }
	        }
	        sc.close();
	        if (!acertado) {
	            throw new DemasiadosIntentosException("Has agotado las oportunidades");
	        }
	    }
}

	
