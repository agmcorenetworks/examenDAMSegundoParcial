package es.corenetworks.dam.examenTema3.excepciones;

public class MesNoValidoException extends Exception{
	public String mensaje;
	
	public MesNoValidoException(String mensaje) {
		super(mensaje);
	}

}
