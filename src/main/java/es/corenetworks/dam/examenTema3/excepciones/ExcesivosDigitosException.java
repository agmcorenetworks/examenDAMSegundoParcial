package es.corenetworks.dam.examenTema3.excepciones;

public class ExcesivosDigitosException extends Exception{
	public String mensaje;
	
	public ExcesivosDigitosException(String mensaje) {
		super(mensaje);
	}

}


