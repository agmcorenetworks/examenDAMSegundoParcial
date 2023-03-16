package es.corenetworks.dam.examenTema3;

import es.corenetworks.dam.examenTema3.algoritmos.FuerzaBruta;
import es.corenetworks.dam.examenTema3.excepciones.DemasiadosIntentosException;
import es.corenetworks.dam.examenTema3.excepciones.ExcesivosDigitosException;
import es.corenetworks.dam.examenTema3.excepciones.InsuficientesDigitosException;
import es.corenetworks.dam.examenTema3.utilidades.Utilidades;

public class ExamenSegundoParcial {
	    public static void main(String[] args) throws DemasiadosIntentosException, InsuficientesDigitosException, ExcesivosDigitosException {
	        // Crear caja1 con constructor sin parámetros
	        CajaFuerte caja1 = new CajaFuerte();
	        FuerzaBruta fb1 = new FuerzaBruta(caja1);
	        System.out.println("Intentando abrir caja1 con método abrirCajaFuertePorConsola...");
	        caja1.abrirCajaFuertePorConsola();

	        System.out.println("\nIntentando abrir caja1 con método checkearContrasenya...");
	        long inicio1 = Utilidades.getTime();
	        for (int i = 0; i < 1000; i++) {
	            int claveAleatoria = (int)(Math.random() * (9999 - 1000 + 1) + 1000);
	            fb1.sacarCombinacion();
	        }
	        long fin1 = Utilidades.getTime();
	        System.out.println("Tiempo empleado en abrir caja1: " + fb1.getTiempo() + " ms");

	        System.out.println("\n----------------------------------------------\n");

	        // Crear caja2 con contraseña "1234"
	        CajaFuerte caja2 = new CajaFuerte();
	        FuerzaBruta fb2 = new FuerzaBruta(caja2);
	        System.out.println("Intentando abrir caja2 con método abrirCajaFuertePorConsola...");
	        caja2.abrirCajaFuertePorConsola();

	        System.out.println("\nIntentando abrir caja2 con método checkearContrasenya...");
	        long inicio2 = Utilidades.getTime();
	        fb2.sacarCombinacion(1111);
	        fb2.sacarCombinacion(9876);
	        fb2.sacarCombinacion(1234);
	        long fin2 = Utilidades.getTime();
	        System.out.println("Tiempo empleado en abrir caja2: " + fb2.getTiempo() + " ms");
	    }
	}



