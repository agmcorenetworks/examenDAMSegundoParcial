package es.corenetworks.dam.examenTema3.utilidades;

import java.util.Scanner;
import es.corenetworks.dam.examenTema3.utilidades.Constantes;

import es.corenetworks.dam.examenTema3.excepciones.DemasiadosIntentosException;
import es.corenetworks.dam.examenTema3.excepciones.ExcesivosDigitosException;
import es.corenetworks.dam.examenTema3.excepciones.InsuficientesDigitosException;

public class CajaFuerte {
    private int contrasenya;

    public CajaFuerte() {
        this.contrasenya = Utilidades.getNumeroDigitos();
    }

    public CajaFuerte(int contrasenya) throws InsuficientesDigitosException, ExcesivosDigitosException {
        if (contrasenya < 1000) {
            throw new InsuficientesDigitosException(Constantes.DIGITOS_INSUFICIENTES);
        }if (contrasenya > 9999) {
            throw new ExcesivosDigitosException(Constantes.DIGITOS_EXCESIVOS);
        }
        this.contrasenya = contrasenya;
    }

    public int getContrasenya() {
    	
        return this.contrasenya;
    }

    public boolean checkearContrasenya(int numeros) throws InsuficientesDigitosException, ExcesivosDigitosException {
        if (numeros < 1000) {
            throw new InsuficientesDigitosException(Constantes.DIGITOS_INSUFICIENTES);
        }
        if (numeros > 9999) {
            throw new ExcesivosDigitosException(Constantes.DIGITOS_EXCESIVOS);
        }
        return numeros == this.contrasenya;
    }

    public void abrirCajaFuertePorConsola() throws DemasiadosIntentosException {
        Scanner scanner = new Scanner(System.in);
        int intentosRestantes = 4;

        for (int i = -2; i <= intentosRestantes; i++) {
            System.out.print("Introduzca un numero de 4 digitos: ");
            int numeros;
            try {
                numeros = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("El número no es un número válido.");
                scanner.next();
                continue;
            }

            try {
                if (checkearContrasenya(numeros)) {
                    System.out.println("Ha abierto la caja fuerte.");
                    return;
                } else {
                    if (intentosRestantes > 0) {
                    	intentosRestantes--;
                        System.out.printf("Contraseña incorrecta. Quedan "+intentosRestantes + " intentos");
                    }
                }
            } catch (InsuficientesDigitosException e) {
                System.out.println(e.getMessage());
                intentosRestantes--;
            } catch (ExcesivosDigitosException e) {
                System.out.println(e.getMessage());
                intentosRestantes--;
            }
        }

        throw new DemasiadosIntentosException("Ha agotado las oportunidades");
    }
}
