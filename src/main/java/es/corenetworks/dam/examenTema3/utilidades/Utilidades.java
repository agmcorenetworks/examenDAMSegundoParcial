package es.corenetworks.dam.examenTema3.utilidades;

import es.corenetworks.dam.examenTema3.excepciones.MesNoValidoException;

public class Utilidades {

	
	/**
	 * Devuelve el tiempo actual
	 * 
	 * @return
	 */
	public static long getTime() {
		return System.currentTimeMillis();
	}
	public static int getNumero4Digitos() {
		int aleatorio = (int) (Math.random()*9000+1000);
		return aleatorio;
	}
	
	public static String getMesDelAño(int numMes) throws MesNoValidoException {
		Constantes con = new Constantes();
		String salida="";
		switch (numMes) {
		case 1: salida= con.NOMBRE_MES_ENERO; 
				break;
		case 2: salida = con.NOMBRE_MES_FEBRERO;
				break;
		case 3: salida = con.NOMBRE_MES_MARZO;
				break;
		case 4: salida = con.NOMBRE_MES_ABRIL;
				break;
		case 5: salida = con.NOMBRE_MES_MAYO;
				break;
		case 6: salida = con.NOMBRE_MES_JUNIO;
				break;
		case 7: salida = con.NOMBRE_MES_JULIO;
				break;
		case 8: salida = con.NOMBRE_MES_AGOSTO;
				break;
		case 9: salida = con.NOMBRE_MES_SEPTIEMBRE;
				break;
		case 10: salida = con.NOMBRE_MES_OCTUBRE;
				break;
		case 11: salida = con.NOMBRE_MES_NOVIEMBRE;
				break;
		case 12: salida = con.NOMBRE_MES_DICIEMBRE;
				break;
		default: throw new MesNoValidoException(con.NOMBRE_MES_NO_VALIDO);
		} //cierre del switch
		return salida;
	} //Cierre de metodo
	
	//Este ejercicio no estoy seguro de haberlo entendido del todo y creo que soy redundante pero
	public static String getTrimestreDelAño(int numMes) throws MesNoValidoException  { 
		Constantes con = new Constantes();
		String salida="";
		switch (numMes) {
		case 1: salida= con.NOMBRE_MES_ENERO; 
				break;
		case 2: salida = con.NOMBRE_MES_FEBRERO;
				break;
		case 3: salida = con.NOMBRE_MES_MARZO;
				break;
		case 4: salida = con.NOMBRE_MES_ABRIL;
				break;
		case 5: salida = con.NOMBRE_MES_MAYO;
				break;
		case 6: salida = con.NOMBRE_MES_JUNIO;
				break;
		case 7: salida = con.NOMBRE_MES_JULIO;
				break;
		case 8: salida = con.NOMBRE_MES_AGOSTO;
				break;
		case 9: salida = con.NOMBRE_MES_SEPTIEMBRE;
				break;
		case 10: salida = con.NOMBRE_MES_OCTUBRE;
				break;
		case 11: salida = con.NOMBRE_MES_NOVIEMBRE;
				break;
		case 12: salida = con.NOMBRE_MES_DICIEMBRE;
				break;
				
		default: throw new MesNoValidoException(con.NOMBRE_MES_NO_VALIDO);
		} //cierre del switch
		
		switch (salida) { 
		case "enero": salida= "primer trimestre"; 
				break;
		case "febrero": salida = "primer trimestre";
				break;
		case "marzo": salida = "primer trimestre";
				break;
		case "abril": salida = "segundo trimestre";
				break;
		case "mayo": salida = "segundo trimestre";
				break;
		case "junio": salida = "segundo trimestre";
				break;
		case "julio": salida = "tercer trimestre";
				break;
		case "agosto": salida = "tercer trimestre";
				break;
		case "septiembre": salida ="tercer trimestre";
				break;
		case "octubre": salida = "cuarto trimestre";
				break;
		case "noviembre": salida = "cuarto trimestre";
				break;
		case "diciembre": salida = "cuarto trimestre";
				break;
		} //cierre del switch
		
		return salida;
	} //Cierre de metodo

	public static int bucleWhile(){
		Constantes con = new Constantes();
		int contador=0;
		int salida=0;
		while(contador<con.NUMBERS.length) {
			if (con.NUMBERS[contador]%2==0) {
				System.out.println(con.NUMBERS[contador]);	
				salida++;
			}
		contador++;
		}
		return salida;
	}
	public static int bucleDoWhile(){
		Constantes con = new Constantes();
		int contador=con.NUMBERS.length-1;
		int salida=0;
		while(contador>=0) {
			if (con.NUMBERS[contador]%2==1) {
				System.out.println(con.NUMBERS[contador]);	
				salida+=con.NUMBERS[contador];
			}
		contador--;
		}
		return salida;
	}
	
public static void main(String[] args) throws MesNoValidoException {
	getTrimestreDelAño(0);
}
	
}//Cierre de clase
