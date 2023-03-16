package es.corenetworks.dam.examenTema3;

import es.corenetworks.dam.examenTema3.excepciones.DemasiadosIntentosException;
import es.corenetworks.dam.examenTema3.excepciones.ExcesivosDigitosException;
import es.corenetworks.dam.examenTema3.excepciones.InsuficientesDigitosException;
import es.corenetworks.dam.examenTema3.utilidades.Constantes;
import es.corenetworks.dam.examenTema3.utilidades.Utilidades;

public class CajaFuerte {
	 private int contrasenya;
	 private int numeroIntentos;
	 
	 public int getContrasenya() {
	        return contrasenya;
	    }
	 
	 public int getNumeroIntentos() {
	        return numeroIntentos;
	    }
	 
	 public CajaFuerte() {
	        this.contrasenya = Utilidades.getNumero4Digitos();
	    }
	 
	 public CajaFuerte(int contrasenya) throws InsuficientesDigitosException, ExcesivosDigitosException {
	        if (contrasenya < 1000) {
	            throw new InsuficientesDigitosException(Constantes.DIGITOS_INSUFICIENTES);
	        } else if (contrasenya > 9999) {
	            throw new ExcesivosDigitosException(Constantes.DIGITOS_EXCESIVOS);
	        } else {
	            this.contrasenya = contrasenya;
	        }
	    }
	 
	 public boolean checkearContrasenya(int contrasenya) throws InsuficientesDigitosException, ExcesivosDigitosException {
	        if (contrasenya < 1000) {
	            throw new InsuficientesDigitosException(Constantes.DIGITOS_INSUFICIENTES);
	        } else if (contrasenya > 9999) {
	            throw new ExcesivosDigitosException(Constantes.DIGITOS_EXCESIVOS);
	        } else if (this.contrasenya == contrasenya) {
	            return true;
	        } else {
	            return false;
	        }
	 }
	 
	 public void abrirCajaFuertePorConsola() throws DemasiadosIntentosException {
	        int intentos = 0;
	        boolean cajaAbierta = false;
	        while (!cajaAbierta && intentos < Constantes.NUMERO_INTENTOS_CAJA) {
	            try {
	                System.out.print("Introduce la contraseña (4 digitos): ");
	                int num = Integer.parseInt(System.console().readLine());
	                cajaAbierta = checkearContrasenya(num);
	                if (cajaAbierta) {
	                    System.out.println("Ha abierto la caja fuerte.");
	                } else {
	                    System.out.println("Contraseña incorrecta, intenta de nuevo.");
	                }
	            } catch (InsuficientesDigitosException | ExcesivosDigitosException e) {
	                System.out.println(e.getMessage());
	            }
	            intentos++;
	        }
	        if (!cajaAbierta) {
	            throw new DemasiadosIntentosException("Ha agotado las oportunidades.");
	        }
	    }
}

