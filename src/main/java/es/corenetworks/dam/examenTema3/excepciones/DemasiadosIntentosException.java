package es.corenetworks.dam.examenTema3.excepciones;


public class DemasiadosIntentosException extends Exception {
	public String mensaje;
	
	public DemasiadosIntentosException(String mensaje) {
		super(mensaje);
	}
}