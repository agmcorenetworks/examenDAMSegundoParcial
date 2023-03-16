package es.corenetworks.dam.examenTema3.excepciones;

public class DemasiadosIntentosException extends Exception{
	public String msj;
	public DemasiadosIntentosException(String msj) {
		super(msj);
	}

}
