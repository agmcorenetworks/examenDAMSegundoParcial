# Examen Segundo parcial programación DAM 

INSTRUCCIONES:

El examen práctico de programación consistirá en el desarrollo de los problemas descritos en este documento


(10 puntos)
# Parte 1

(1 punto)
- crear el paquete es.corenetworks.dam.examenTema3.excepciones
- crear las siguientes excepciones:
	- DemasiadosIntentosException
	- ExcesivosDigitosException
	- InsuficientesDigitosException
	- MesNoValidoException
	
	
(1 punto)	
- en el paquete es.corenetworks.dam.examenTema3.utilidades crear la clase Constantes
- dentro de la clase es.corenetworks.dam.examenTema3.utilidades.Constantes crear las siguientes constantes de tipo entero:

	- MES_ENERO = 1;
	- MES_FEBRERO = 2;
	- MES_MARZO = 3;
	- MES_ABRIL = 4;
	- MES_MAYO = 5;
	- MES_JUNIO = 6;
	- MES_JULIO = 7;
	- MES_AGOSTO = 8;
	- MES_SEPTIEMBRE = 9;
	- MES_OCTUBRE = 10;
	- MES_NOVIEMBRE = 11;
	- MES_DICIEMBRE = 12;
	- NUMERO_INTENTOS_CAJA = 4;	
- dentro de la clase es.corenetworks.dam.examenTema3.utilidades.Constantes crear las siguientes constantes de tipo texto:
	- NOMBRE_MES_ENERO = "enero";
	- NOMBRE_MES_FEBRERO = "febrero";
	- NOMBRE_MES_MARZO = "marzo";
	- NOMBRE_MES_ABRIL = "abril";
	- NOMBRE_MES_MAYO = "mayo";
	- NOMBRE_MES_JUNIO = "junio";
	- NOMBRE_MES_JULIO = "julio";
	- NOMBRE_MES_AGOSTO = "agosto";
	- NOMBRE_MES_SEPTIEMBRE = "septiembre";
	- NOMBRE_MES_OCTUBRE = "octubre";
	- NOMBRE_MES_NOVIEMBRE = "noviembre";
	- NOMBRE_MES_DICIEMBRE = "diciembre";
	- NOMBRE_MES_NO_VALIDO = "No es un mes valido";

	- DIGITOS_INSUFICIENTES = "El numero de digitos es insuficiente";
	- DIGITOS_EXCESIVOS = "El numero de digitos es excesivo";
	
(8 puntos)
- en la clase es.corenetworks.dam.examenTema3.utilidades.Utilidades crear los sguientes metodos

	(2 puntos)
	- getNumero4Digitos que devolverá un numero entero de 4 digitos entre 1000 y 9999
	
	(2 puntos)
	- getMesDelAño que tomara como parametro un numero entero y delvolvera el nombre del mes correspondiente a ese numero la comprobación se realizará utilizando las constantes y para devolver el nombre del mes tambien hay que usar las constantes creadas. en caso de recibir un numero que no corresponda a un mes del año se lanzará la excepción MesNoValidoException con el mensaje en la constante NOMBRE_MES_NO_VALIDO.
	suponemos que 1=enero, 2=febrero,...,12=diciembre
	
	(2 puntos)
	- getTrimestreDelAño que tomara como parametro un numero entero y delvolvera el trimestre correspondiente a ese numero la comprobación se realizará mediante una estructura switch, utilizando las constantes y para devolver el trimestre tambien hay que usar las constantes creadas. en caso de recibir un numero que no corresponda a un mes del año se lanzará la excepción MesNoValidoException con el mensaje en la constante NOMBRE_MES_NO_VALIDO.
	suponemos que 1=enero, 2=febrero,...,12=diciembre, suponemos que el año esta dividido en 4 trimestres, primero, segundo, tercero y cuarto
	
	(2 puntos)
	- factorial que tomando un numero entero como parametro devuelva el factorial de dicho numero utilizando un bucle for.
	El factorial de un número se obtiene multiplicando todos los números enteros
	positivos que hay entre el 1 y ese número.
	no se permitirá utilizar la busqueda in internet para este ejercicio
	

	
	