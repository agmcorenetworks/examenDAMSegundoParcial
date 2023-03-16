package es.corenetworks.dam.examenTema3;

import java.util.Scanner;

import es.corenetworks.dam.examenTema3.excepciones.DemasiadosIntentosException;
import es.corenetworks.dam.examenTema3.excepciones.ExcesivoDigitosException;
import es.corenetworks.dam.examenTema3.excepciones.InsuficientesDigitosException;
import es.corenetworks.dam.examenTema3.utilidades.Constantes;
import es.corenetworks.dam.examenTema3.utilidades.Utilidades;

public class CajaFuerte {

	private int contrasenya;
    private int numeroIntentos;
    
    
    public int getContrasenya() {
        return this.contrasenya;
    }
    
    public int getNumeroIntentos() {
        return this.numeroIntentos;
    }
    
    //un constructor sin parámetros que inicialice el atributo contrasenya utilizando el método getNumero4Digitos de la clase utilidades
    public CajaFuerte() {
        this.contrasenya = Utilidades.getNumero4Digitos();
        this.numeroIntentos = 0;
    }
    
    public CajaFuerte(int contrasenya) throws InsuficientesDigitosException, ExcesivoDigitosException {
        if (contrasenya < 1000) {
            throw new InsuficientesDigitosException(Constantes.DIGITOS_INSUFICIENTES);
        } else if (contrasenya > 9999) {
            throw new ExcesivoDigitosException(Constantes.DIGITOS_EXCESIVOS);
        } else {
            this.contrasenya = contrasenya;
            this.numeroIntentos = 0;
        }
    }
    
    
    public boolean checkearContrasenya(int intentoContrasenya) throws InsuficientesDigitosException, ExcesivoDigitosException {
        if (intentoContrasenya < 1000) {
            throw new InsuficientesDigitosException(Constantes.DIGITOS_INSUFICIENTES);
        } else if (intentoContrasenya > 9999) {
            throw new ExcesivoDigitosException(Constantes.DIGITOS_EXCESIVOS);
        } else if (intentoContrasenya == this.contrasenya) {
            return true;
        } else {
            this.numeroIntentos++;
            return false;
        }
    }
    
    
    public void abrirCajaFuertePorConsola() throws DemasiadosIntentosException {
        Scanner teclado = new Scanner(System.in);
        int intentosRestantes = Constantes.NUMERO_INTENTOS_CAJA;
        
        while (intentosRestantes > 0) {
            System.out.print("Introduzca la contraseña de 4 dígitos para abrir la caja fuerte: ");
            try {
                int num = teclado.nextInt();
                teclado.close();
                if (checkearContrasenya(num)) {
                    System.out.println("Ha abierto la caja fuerte.");
                    return;
                } else {
                    intentosRestantes--;
                    System.out.println("Contraseña incorrecta. Le quedan " + intentosRestantes + " intentos.");
                }
            } catch (InsuficientesDigitosException e) {
                System.out.println(e.getMessage());
                intentosRestantes--;
            } catch (ExcesivoDigitosException e) {
                System.out.println(e.getMessage());
                intentosRestantes--;
            } catch (Exception e) {
                System.out.println("Se ha producido un error. Inténtelo de nuevo.");
                intentosRestantes--;
            }
        }
        
        throw new DemasiadosIntentosException("Ha agotado las oportunidades.");
    }
	
}
