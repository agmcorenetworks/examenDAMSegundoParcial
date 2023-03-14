# Examen Segundo parcial programación DAM 

INSTRUCCIONES:

El examen práctico de programación consistirá en el desarrollo de los problemas descritos en este documento


(10 puntos)
# Parte 2

* En el paquete es.corenetworks.dam.examenTema3 crear la clase CajaFuerte descrita de la siguiente forma:

(3 puntos)
- modelar una caja fuerte que tendrá una contraseña para abrirse, esta contraseña será un entero entre 1000 y 9999 y numero de intentos maximo para abrirse, la caja podrá crearse 
	- sin parametros, en cuyo caso se tomara la combinación de la caja usando la función getNumero4Digitos de la clase utilidades y el numero de intentos se determinara mediante la constante NUMERO_INTENTOS_CAJA
	- indicando en el parametro la combinación de la caja al construirla, en este caso el numero de intentos se determinara mediante la constante NUMERO_INTENTOS_CAJA
	- indicando ambos parametros en el constructor, en este caso la contraseña será el primer paramtro y el numero de intentos el segundo 
	Cuando se especifique la constraseña, crear la caja, se deberan las excepciónes InsuficientesDigitosException con el mensaje de la constante DIGITOS_INSUFICIENTES si esta es menor de 1000 y la excepción ExcesivosDigitosException con el mensaje de la constante DIGITOS_EXCESIVOS si esta es mayor de 1000.

(3 puntos)
- realizar el metodo checkearContrasenya que recibe un numero entero y devuelve true si se ha acertado la contraseña y false en otro caso, este metodo además deberá lanzar las excepciónes InsuficientesDigitosException con el mensaje de la constante DIGITOS_INSUFICIENTES si el numero pasado como parametro es menor de 1000 y la excepción ExcesivosDigitosException con el mensaje de la constante DIGITOS_EXCESIVOS si es mayor de 9999.

(2 puntos)
- realizar el metodo abrirCajaFuertePorConsola que pedirá al usuario por consola que intrduzca un numero para abrir la caja fuerte, el metodo leerá por consola el numero y utilizará el metodo anterior para comprobar la contraseña si el usuario acierta se imprimirá el mensaje "Ha abierto la caja fuerte.", las excepciones generadas deberán de mostrarse al usuario. Si el usuario no ha acertado se le pedirá una nueva contraseña hasta que se agoten las oportunidades con la que se creo la caja fuerte, los intentos que lancen excepciones tambien deben contarse como tambien como fallos. Cuando se agoten las oportunidades se lanzará la excepción DemasiadosIntentosException, con el mensaje "Ha agotado las oportunidades".

(2 puntos)
* crear en el paquete es.corenetworks.dam.examenTema3 la clase ExamenSegundoParcial, esta clase contendrá un metodo main en el que se crearán distintas cajas fuertes con las distintas opciones y se utilizarán los metodos creados para probar la clase, crear un minimo de 3 cajas fuertes que utilicen los metodos descritos.

