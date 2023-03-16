package es.corenetworks.dam.examenTema3;

import es.corenetworks.dam.examenTema3.utilidades.Utilidades;
import es.corenetworks.dam.examenTema3.utilidades.Constantes;
import java.util.Scanner;
import es.corenetworks.dam.examenTema3.excepciones.DemasiadosIntentosException;
import es.corenetworks.dam.examenTema3.excepciones.InsuficientesDigitosException;
import es.corenetworks.dam.examenTema3.excepciones.ExcesivosDigitosException;

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
        contrasenya = Utilidades.getNumero4Digitos();
    }

    public CajaFuerte(int contrasenya) throws InsuficientesDigitosException, ExcesivosDigitosException {
        if (contrasenya < 1000) {
            throw new InsuficientesDigitosException(Constantes.DIGITOS_INSUFICIENTES);
        } else if (contrasenya > 9999) {
            throw new ExcesivosDigitosException(Constantes.DIGITOS_EXCESIVOS);
        }
        this.contrasenya = contrasenya;
    }
    
    public boolean checkearContrasenya(int contrasenya) throws InsuficientesDigitosException, ExcesivosDigitosException {
        if (contrasenya < 1000) {
            throw new InsuficientesDigitosException(Constantes.DIGITOS_INSUFICIENTES);
        } else if (contrasenya > 9999) {
            throw new ExcesivosDigitosException(Constantes.DIGITOS_EXCESIVOS);
        }
        
        numeroIntentos++;
        return this.contrasenya == contrasenya;
    }
    
    public void abrirCajaFuertePorConsola() throws DemasiadosIntentosException {
        Scanner scan = new Scanner(System.in);
        boolean exito = false;

        while (numeroIntentos < Constantes.NUMERO_INTENTOS_CAJA && !exito) {
            System.out.println("Introduzca un número de 4 dígitos para abrir la caja fuerte:");

            try {
                int intento = scan.nextInt();
                exito = checkearContrasenya(intento);

                if (exito) {
                    System.out.println("Ha abierto la caja fuerte.");
                } else {
                    System.out.println("La contraseña introducida es incorrecta.");
                }
            } catch (InsuficientesDigitosException | ExcesivosDigitosException e) {
                System.out.println(e.getMessage());
                numeroIntentos++;
            }
        }

        if (!exito) {
            throw new DemasiadosIntentosException("Ha agotado las oportunidades");
        }
    }
}