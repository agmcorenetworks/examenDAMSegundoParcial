package es.corenetworks.dam.examenTema3.excepciones;

public class ExcesivosDigitosException extends Exception {
	public String msj;
	public ExcesivosDigitosException(String msj) {
		super(msj);
	}
}
