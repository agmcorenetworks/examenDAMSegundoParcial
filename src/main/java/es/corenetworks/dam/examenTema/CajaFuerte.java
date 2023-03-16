package es.corenetworks.dam.examenTema;

import java.util.Scanner;

import es.corenetworks.dam.examenTema3.excepciones.DemasiadosIntentosException;
import es.corenetworks.dam.examenTema3.excepciones.ExcesivosDigitosException;
import es.corenetworks.dam.examenTema3.excepciones.InsuficientesDigitosException;
import es.corenetworks.dam.examenTema3.utilidades.Utilidades;

public class CajaFuerte {
    private int contrasenya;
    private int numeroIntentos;
    private final int MAX_NUMERO_INTENTOS = 3;
    private final String DIGITOS_INSUFICIENTES = "La contraseña debe tener al menos 4 dígitos";
    private final String DIGITOS_EXCESIVOS = "La contraseña no puede tener más de 4 dígitos";
    private final String DEMASIADOS_INTENTOS = "Ha agotado las oportunidades";
    
    public CajaFuerte() {
        this.contrasenya = Utilidades.getNumero4Digitos();
    }
    
    public CajaFuerte(int contrasenya) throws InsuficientesDigitosException, ExcesivosDigitosException {
        if (contrasenya < 1000) {
            throw new InsuficientesDigitosException(DIGITOS_INSUFICIENTES);
        } else if (contrasenya > 9999) {
            throw new ExcesivosDigitosException(DIGITOS_EXCESIVOS);
        } else {
            this.contrasenya = contrasenya;
        }
    }
    
    public int getContrasenya() {
        return contrasenya;
    }
    
    public int getNumeroIntentos() {
        return numeroIntentos;
    }
    
    
    // Método para verificar contraseña
    public boolean checkearContrasenya(int numero) throws InsuficientesDigitosException, ExcesivosDigitosException {
        if (numero < 1000) {
            throw new InsuficientesDigitosException(DIGITOS_INSUFICIENTES);
        } else if (numero > 9999) {
            throw new ExcesivosDigitosException(DIGITOS_EXCESIVOS);
        } else {
            return numero == contrasenya;
        }
    }
    
    
    // Método para abrir la caja fuerte
    public void abrirCajaFuertePorConsola() throws DemasiadosIntentosException {
        Scanner scanner = new Scanner(System.in);
        boolean abierta = false;
        while (!abierta && numeroIntentos < MAX_NUMERO_INTENTOS) {
            System.out.println("Introduce la contraseña de 4 dígitos para abrir la caja fuerte:");
            try {
                int numero = scanner.nextInt();
                scanner.nextLine(); // Consumir el \n dejado por nextInt
                if (checkearContrasenya(numero)) {
                    System.out.println("Ha abierto la caja fuerte.");
                    abierta = true;
                } else {
                    System.out.println("Contraseña incorrecta.");
                    numeroIntentos++;
                }
            } catch (InsuficientesDigitosException | ExcesivosDigitosException e) {
                System.out.println("Contraseña inválida. " + e.getMessage());
                numeroIntentos++;
            } catch (Exception e) {
                System.out.println("Error al leer la contraseña.");
                numeroIntentos++;
            }
        }
        if (!abierta) {
            throw new DemasiadosIntentosException(DEMASIADOS_INTENTOS);
        }
    }
}


