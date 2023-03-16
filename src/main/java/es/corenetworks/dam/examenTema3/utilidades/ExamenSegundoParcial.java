package es.corenetworks.dam.examenTema3.utilidades;

import es.corenetworks.dam.examenTema3.excepciones.DemasiadosIntentosException;
import es.corenetworks.dam.examenTema3.excepciones.ExcesivosDigitosException;
import es.corenetworks.dam.examenTema3.excepciones.InsuficientesDigitosException;

import java.util.Random;

public class ExamenSegundoParcial {
    public static void main(String[] args) {
        try {
            CajaFuerte caja1 = new CajaFuerte();
            caja1.abrirCajaFuertePorConsola();
            
            //1000 claves aleatorias
            Random random = new Random();
            for (int i = 0; i < 1000; i++) {
                int clave = random.nextInt(9000) + 1000;
                if (caja1.checkearContrasenya(clave)) {
                    System.out.println("Caja1 tiene clave: " + clave);
                    break;
                }
            }
            int claveCaja1 = caja1.getContrasenya();
            if (caja1.checkearContrasenya(claveCaja1)) {
                System.out.println("Caja1 tiene clave: " + claveCaja1);
            }

            // Caja2
            CajaFuerte caja2 = new CajaFuerte(1234);
            caja2.abrirCajaFuertePorConsola();
            caja2.checkearContrasenya(2345);
            caja2.checkearContrasenya(3456);
            if (caja2.checkearContrasenya(1234)) {
                System.out.println("Caja 2 tiene clave: 1234");
            }
            
            int claveCaja2 = caja2.getContrasenya();
            if (caja2.checkearContrasenya(claveCaja2)) {
                System.out.println("Caja 2 tiene clave: " + claveCaja2);
            }

        } catch (InsuficientesDigitosException | ExcesivosDigitosException | DemasiadosIntentosException e) {
            System.out.println("La excepcion generada es: " + e.getMessage());
        }
    }
}
