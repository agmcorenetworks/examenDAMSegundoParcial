package es.corenetworks.dam.examenTema3;

import java.util.Random;
import es.corenetworks.dam.examenTema3.excepciones.DemasiadosIntentosException;
import es.corenetworks.dam.examenTema3.excepciones.ExcesivosDigitosException;
import es.corenetworks.dam.examenTema3.excepciones.InsuficientesDigitosException;
import es.corenetworks.dam.examenTema3.algoritmos.FuerzaBruta;


public class ExamenSegundoParcial {
    public static void main(String[] args) throws InsuficientesDigitosException, ExcesivosDigitosException {
        CajaFuerte caja1 = new CajaFuerte();

        try {
            caja1.abrirCajaFuertePorConsola();
        } catch (DemasiadosIntentosException e) {
            System.out.println(e.getMessage());
        }

        Random rand = new Random();
        for (int i = 0; i < 1000; i++) {
            int randomNum = 1000 + rand.nextInt(9000);
            try {
                if (caja1.checkearContrasenya(randomNum)) {
                    System.out.println("La caja fuerte ha sido abierta con éxito en el intento: " + (i + 1));
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        try {
            if (caja1.checkearContrasenya(caja1.getContrasenya())) {
                System.out.println("La caja fuerte ha sido abierta con éxito usando getContrasenya.");
            }
            FuerzaBruta fuerzaBrutaCaja1 = new FuerzaBruta(caja1);
            int contraseñaEncontradaCaja1 = fuerzaBrutaCaja1.sacarCombinacion();
            long tiempoCaja1 = fuerzaBrutaCaja1.getTiempo();
            System.out.println("Contraseña de la caja1 encontrada: " + contraseñaEncontradaCaja1);
            System.out.println("Tiempo empleado para la caja1: " + tiempoCaja1 + " ms");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        CajaFuerte caja2 = new CajaFuerte(caja1.getContrasenya());

        try {
            caja2.abrirCajaFuertePorConsola();
        } catch (DemasiadosIntentosException e) {
            System.out.println(e.getMessage());
        }

        try {
            caja2.checkearContrasenya(caja2.getContrasenya() - 1); // Intento incorrecto
            caja2.checkearContrasenya(caja2.getContrasenya() + 1); // Intento incorrecto
            if (caja2.checkearContrasenya(caja2.getContrasenya())) { // Intento correcto
                System.out.println("La caja fuerte caja2 ha sido abierta con éxito.");
            }
            FuerzaBruta fuerzaBrutaCaja2 = new FuerzaBruta(caja2);
            int contraseñaEncontradaCaja2 = fuerzaBrutaCaja2.sacarCombinacion();
            long tiempoCaja2 = fuerzaBrutaCaja2.getTiempo();
            System.out.println("Contraseña de la caja2 encontrada: " + contraseñaEncontradaCaja2);
            System.out.println("Tiempo empleado para la caja2: " + tiempoCaja2 + " ms");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}