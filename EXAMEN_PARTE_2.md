# Examen Segundo parcial programación DAM 

INSTRUCCIONES:

El examen práctico de programación consistirá en el desarrollo de los problemas descritos en este documento


(10 puntos)
# Parte 2

* En el paquete es.corenetworks.dam.examenTema3 crear la clase CajaFuerte descrita de la siguiente forma:


(1 punto)
La clase debe tener un atributo interno entero llamado contrasenya que guardará la contraseña de la caja fuerte
La clase debe tener un atributo interno entero llamado numeroIntentos que contendrá el numero de intentos para abrir la caja fuerte


(1 punto)
La clase debe tener un constructor sin parametros que inicialice el atributo contrasenya utilizando el metodo getNumero4Digitos de la clase utilidades


(2 punto)
La clase además debe tener un constructor con un parametro que indicará la contraseña, que será el valor del atributo contrasenya. Antes de asignar el valor debe comprobarse que el valor dado como parametro está entre 1000 y 9999, se deberan lanzar las excepciónes InsuficientesDigitosException con el mensaje de la constante DIGITOS_INSUFICIENTES si esta es menor de 1000 y la excepción ExcesivosDigitosException con el mensaje de la constante DIGITOS_EXCESIVOS si esta es mayor de 9999.



(2 puntos)
- realizar el metodo checkearContrasenya que recibe un numero entero y devuelve true si se ha acertado la contraseña y false en otro caso, este metodo además deberá lanzar las excepciónes InsuficientesDigitosException con el mensaje de la constante DIGITOS_INSUFICIENTES si el numero pasado como parametro es menor de 1000 y la excepción ExcesivosDigitosException con el mensaje de la constante DIGITOS_EXCESIVOS si es mayor de 9999.



(2 puntos)
- realizar el metodo abrirCajaFuertePorConsola que pedirá al usuario por consola que intrduzca un numero de 4 digitos para abrir la caja fuerte, el metodo leerá por consola el numero y utilizará el metodo checkearContrasenya para comprobar la contraseña. Si el usuario acierta se imprimirá el mensaje "Ha abierto la caja fuerte.", Si el usuario no ha acertado se le pedirá una nueva contraseña hasta que se agote el numero de intentos.

las posibles excepciones que puedan capturarse deberán de mostrarse al usuario,
Los intentos que lancen excepciones tambien deben contarse como tambien como fallos. Cuando se agoten las oportunidades se lanzará la excepción DemasiadosIntentosException, con el mensaje "Ha agotado las oportunidades".



(2 puntos)
* crear en el paquete es.corenetworks.dam.examenTema3 la clase ExamenSegundoParcial, esta clase contendrá un metodo main en el que se crearán distintas cajas fuertes con las distintas opciones y se utilizarán los metodos creados para probar la clase, crear un minimo de 2 cajas fuertes que utilicen los metodos descritos.

