package es.corenetworks.dam.examenTema3;
import java.util.InputMismatchException;
import java.util.Scanner;

import es.corenetworks.dam.examenTema3.excepciones.*;
import es.corenetworks.dam.examenTema3.utilidades.Constantes;
import es.corenetworks.dam.examenTema3.utilidades.Utilidades;

public class CajaFuerte {
    
    private int contrasenya;
    private int numeroIntentos;
    
    public CajaFuerte() {
        this.contrasenya = Utilidades.getNumero4Digitos();
    }
    
    public CajaFuerte(int contrasenya) throws InsuficientesDigitosException, ExcesivosDigitosException {
        if (contrasenya < 1000) {
            throw new InsuficientesDigitosException(Constantes.DIGITOS_INSUFICIENTES);
        }
        if (contrasenya > 9999) {
            throw new ExcesivosDigitosException(Constantes.DIGITOS_EXCESIVOS);
        }
        this.contrasenya = contrasenya;
    }
    
    public boolean checkearContrasenya(int contrasenya) throws InsuficientesDigitosException, ExcesivosDigitosException {
        if (contrasenya < 1000) {
            throw new InsuficientesDigitosException(Constantes.DIGITOS_INSUFICIENTES);
        }
        if (contrasenya > 9999) {
            throw new ExcesivosDigitosException(Constantes.DIGITOS_EXCESIVOS);
        }
        this.numeroIntentos++;
        return this.contrasenya == contrasenya;
    }

    public void abrirCajaFuertePorConsola() throws DemasiadosIntentosException {
        Scanner scanner = new Scanner(System.in);
        int intentosRestantes = 3;

        while (intentosRestantes > 0) {
            System.out.print("Introduce la contraseña de 4 dígitos para abrir la caja fuerte: ");
            try {
                int contrasenya = scanner.nextInt();
                if (checkearContrasenya(contrasenya)) {
                    System.out.println("Ha abierto la caja fuerte.");
                    return;
                } else {
                    intentosRestantes--;
                    System.out.println("Contraseña incorrecta. Inténtalo de nuevo. Intentos restantes: " + intentosRestantes);
                }
            } catch (InsuficientesDigitosException e) {
                System.out.println("Contraseña demasiado corta. " + e.getMessage() + " Intentos restantes: " + intentosRestantes);
                intentosRestantes--;
            } catch (ExcesivosDigitosException e) {
                System.out.println("Contraseña demasiado larga. " + e.getMessage() + " Intentos restantes: " + intentosRestantes);
                intentosRestantes--;
            } catch (InputMismatchException e) {
                System.out.println("Entrada incorrecta. Debe introducir un número de 4 dígitos. Intentos restantes: " + intentosRestantes);
                scanner.next();
                intentosRestantes--;
            }
        }
        throw new DemasiadosIntentosException("Demasiados intentos");
    }

    
    public int getContrasenya() {
        return contrasenya;
    }
    
    public int getNumeroIntentos() {
        return numeroIntentos;
    }
    
    
}
