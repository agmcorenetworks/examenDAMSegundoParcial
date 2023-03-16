package es.corentetworks.dam.examenTema3;

import java.util.Random;

import es.corenetworks.dam.examenTema3.excepciones.DemasiadosIntentosException;
import es.corenetworks.dam.examenTema3.excepciones.ExcesivosDigitosException;
import es.corenetworks.dam.examenTema3.excepciones.InsuficientesDigitosException;



public class ExamenSegundoParcial {

    public static void main(String[] args) throws InsuficientesDigitosException, ExcesivosDigitosException, DemasiadosIntentosException {
       
        CajaFuerte caja1 = new CajaFuerte();
        //Solo para saber la contraseña y saber que pasa si acertamos System.out.println(caja1.getContrasenya());
        try {
            caja1.abrirCajaFuertePorConsola();
        } catch (DemasiadosIntentosException e) {
            System.out.println(e.getMessage());
        }
        
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            int numero = 1000 + random.nextInt(9000);
            try {
                if (caja1.checkearContrasenya(numero)) {
                    System.out.println("La caja fuerte se abrió con el número aleatorio " + numero);
                    break;
                }
            } catch (InsuficientesDigitosException | ExcesivosDigitosException e) {
            	System.out.println(e.getMessage());
            }
        }
  
        int claveCaja1 = caja1.getContrasenya();
        try {
            if (caja1.checkearContrasenya(claveCaja1)) {
                System.out.println("La caja fuerte se abrió con la clave " + claveCaja1);
            } else {
                System.out.println("No se pudo abrir la caja fuerte con la clave " + claveCaja1);
            }
        } catch (InsuficientesDigitosException | ExcesivosDigitosException e) {
            System.out.println(e.getMessage());
        }
        // Crear una caja fuerte caja2 pasando en el constructor la contraseña de la caja fuerte
        
        /**CajaFuerte caja2 = new CajaFuerte();
        System.out.println(caja2.getContrasenya());
        try {
            caja2.abrirCajaFuertePorConsola();
        } catch (DemasiadosIntentosException e) {
            System.out.println(e.getMessage());
        }*/
        
   }
}

