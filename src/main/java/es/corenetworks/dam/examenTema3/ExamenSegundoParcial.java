package es.corenetworks.dam.examenTema3;

import java.util.Random;

import es.corenetworks.dam.examenTema3.excepciones.DemasiadosIntentosException;
import es.corenetworks.dam.examenTema3.excepciones.ExcesivoDigitosException;
import es.corenetworks.dam.examenTema3.excepciones.InsuficientesDigitosException;


public class ExamenSegundoParcial {

	public static void main(String[] args) throws InsuficientesDigitosException, ExcesivoDigitosException, DemasiadosIntentosException {
		// Crear una caja fuerte con el constructor sin parámetros
        CajaFuerte caja1 = new CajaFuerte();

        // Intentar abrir la caja fuerte usando la consola
        try {
            caja1.abrirCajaFuertePorConsola();
        } catch (DemasiadosIntentosException e) {
            System.out.println(e.getMessage());
        }

        // Intentar abrir la caja fuerte usando el método checkearContrasenya
        for (int i = 0; i < 1000; i++) {
            int randomNum = new Random().nextInt(9000) + 1000;
            try {
                if (caja1.checkearContrasenya(randomNum)) {
                    System.out.println("Ha acertado la contraseña.");
                    break;
                }
            } catch (InsuficientesDigitosException | ExcesivoDigitosException e) {
                System.out.println(e.getMessage());
            }
        }

        // Obtener la contraseña de la caja y utilizarla para abrir la caja fuerte
        int contrasenya = caja1.getContrasenya();
        try {
            if (caja1.checkearContrasenya(contrasenya)) {
                System.out.println("Ha abierto la caja fuerte.");
            } else {
                System.out.println("No ha acertado la contraseña.");
            }
        } catch (InsuficientesDigitosException | ExcesivoDigitosException e) {
            System.out.println(e.getMessage());
        }
        
        
        
        // Crear una caja fuerte con una contraseña específica
        CajaFuerte caja2 = new CajaFuerte(1234);

        // Intentar abrir la caja fuerte usando la consola
        try {
            caja2.abrirCajaFuertePorConsola();
        } catch (DemasiadosIntentosException e) {
            System.out.println(e.getMessage());
        }

        // Intentar abrir la caja fuerte usando el método checkearContrasenya
        try {
            if (caja2.checkearContrasenya(1111)) {
                System.out.println("Ha acertado la contraseña.");
            } else {
                System.out.println("No ha acertado la contraseña.");
            }
            if (caja2.checkearContrasenya(2222)) {
                System.out.println("Ha acertado la contraseña.");
            } else {
                System.out.println("No ha acertado la contraseña.");
            }
            if (caja2.checkearContrasenya(1234)) {
                System.out.println("Ha abierto la caja fuerte.");
            } else {
                System.out.println("No ha acertado la contraseña.");
            }
        } catch (InsuficientesDigitosException | ExcesivoDigitosException e) {
            System.out.println(e.getMessage());
        }
        
        //Obtener la contraseña de la caja y utilizarla para abrir la caja fuerte
        int contrasenya2 = caja2.getContrasenya();
        try {
            if (caja2.checkearContrasenya(contrasenya2)) {
                System.out.println("Ha abierto la caja fuerte.");
            } else {
                System.out.println("No ha acertado la contraseña.");
            }
        } catch (InsuficientesDigitosException | ExcesivoDigitosException e) {
            System.out.println(e.getMessage());
        }
    }
}


