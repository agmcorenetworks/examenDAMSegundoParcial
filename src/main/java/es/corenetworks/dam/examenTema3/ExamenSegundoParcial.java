package es.corenetworks.dam.examenTema3;

import java.util.Random;
import java.util.Scanner;

import es.corenetworks.dam.examenTema3.excepciones.*;
import es.corenetworks.dam.examenTema3.algoritmos.FuerzaBruta;


public class ExamenSegundoParcial {

    public static void main(String[] args) throws InsuficientesDigitosException, ExcesivosDigitosException, DemasiadosIntentosException {

       
        CajaFuerte caja1 = new CajaFuerte();

        
        System.out.println("Intentando abrir caja1 por consola...");
        caja1.abrirCajaFuertePorConsola();

     
        Random rand = new Random();
        System.out.println("Intentando abrir caja1 con un bucle de 1000 iteraciones...");
        for (int i = 0; i < 1000; i++) {
            int randomNum = rand.nextInt(9000) + 1000;
            if (caja1.checkearContrasenya(randomNum)) {
                System.out.println("Caja1 abierta con la clave " + randomNum);
                break;
            }
        }
        

        
        int claveCaja1 = caja1.getContrasenya();
        System.out.println("Intentando abrir caja1 con la clave obtenida...");
        if (caja1.checkearContrasenya(claveCaja1)) {
            System.out.println("Caja1 abierta con la clave " + claveCaja1);
        } else {
            System.out.println("No se pudo abrir caja1 con la clave " + claveCaja1);
        }

        
        int claveCaja2 = 1234;
        CajaFuerte caja2 = new CajaFuerte(claveCaja2);
        

        
        System.out.println("Intentando abrir caja2 por consola...");
        caja2.abrirCajaFuertePorConsola();

        
        System.out.println("Intentando abrir caja2 con claves incorrectas...");
        for (int i = 0; i < 2; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduzca la clave para abrir caja2:");
            int claveIntroducida = scanner.nextInt();
            if (caja2.checkearContrasenya(claveIntroducida)) {
                System.out.println("Caja2 abierta con la clave " + claveIntroducida);
                break;
            }
            scanner.close();
        }
        
        FuerzaBruta fbCaja1 = new FuerzaBruta(caja1);
        int combinacionCaja1 = fbCaja1.sacarCombinacion();
        System.out.println("Caja1 abierta con la clave " + combinacionCaja1);
        System.out.println("Tiempo empleado en abrir caja1 con fuerza bruta: " + fbCaja1.getTiempo() + " ms");
        
        FuerzaBruta fbCaja2 = new FuerzaBruta(caja2);
        int combinacionCaja2 = fbCaja2.sacarCombinacion();
        System.out.println("Caja2 abierta con la clave " + combinacionCaja2);
        System.out.println("Tiempo empleado en abrir caja2 con fuerza bruta: " + fbCaja2.getTiempo() + " ms");
        
    }
}
  
