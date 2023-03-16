package es.corenetworks.dam.examenTema3;

import java.util.Random;

import es.corenetworks.dam.examenTema3.excepciones.DemasiadosIntentosException;
import es.corenetworks.dam.examenTema3.excepciones.ExcesivosDigitosException;
import es.corenetworks.dam.examenTema3.excepciones.InsuficientesDigitosException;

public class ExamenSegundoParcial {
	public static void main(String[] args) throws DemasiadosIntentosException, InsuficientesDigitosException, ExcesivosDigitosException {
        CajaFuerte caja1 = new CajaFuerte();
        try {
            caja1.abrirCajaFuertePorConsola();
        } catch (DemasiadosIntentosException e) {
            System.out.println(e.getMessage());
        }
        Random r = new Random();
        for (int i = 0; i < 1000; i++) {
            int clave = r.nextInt(9000) + 1000;
            try {
                if (caja1.checkearContrasenya(clave)) {
                    System.out.println("La clave correcta es: " + caja1.getContrasenya());
                    break;
                }
            } catch (InsuficientesDigitosException | ExcesivosDigitosException e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            if (caja1.checkearContrasenya(caja1.getContrasenya())) {
                System.out.println("Ha abierto la caja fuerte.");
            } else {
                System.out.println("No ha podido abrir la caja fuerte.");
            }
        } catch (InsuficientesDigitosException | ExcesivosDigitosException e) {
            System.out.println(e.getMessage());
        }
        
        CajaFuerte caja2 = new CajaFuerte(1234);
        try {
            caja2.abrirCajaFuertePorConsola();
        } catch (DemasiadosIntentosException e) {
            System.out.println(e.getMessage());
        }
        try {
            caja2.checkearContrasenya(4321);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            caja2.checkearContrasenya(5678);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            caja2.checkearContrasenya(1234);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        int contrasenya2 = caja2.getContrasenya();
        System.out.println("La contraseña de la caja fuerte es: " + contrasenya2);
    }

	
}

