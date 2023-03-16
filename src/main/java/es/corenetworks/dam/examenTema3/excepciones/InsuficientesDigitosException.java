package es.corenetworks.dam.examenTema3.excepciones;

public class InsuficientesDigitosException extends Exception {

	
	String msj;

	public InsuficientesDigitosException (String msj) {
		
		super(msj);
		
	}
}
