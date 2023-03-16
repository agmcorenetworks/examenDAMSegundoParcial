package es.corenetworks.dam.examenTema3.excepciones;

public class MesNoValidoException extends Exception {
	
	public String msj;
	
	public MesNoValidoException (String msj) {
		super(msj);
	}
	
}