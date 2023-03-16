# Examen Segundo parcial programación DAM 

INSTRUCCIONES:

El examen práctico de programación consistirá en el desarrollo de los problemas descritos en este documento


# Parte 2 (10 puntos)

En el paquete es.corenetworks.dam.examenTema3 crear la clase CajaFuerte descrita de la siguiente forma:

(1 punto)
La clase debe tener un atributo interno entero llamado contrasenya que guardará la contraseña de la caja fuerte, y un método getContrasenya que devuelva el valor del atributo
La clase debe tener un atributo interno entero llamado numeroIntentos que contendrá el numero de intentos para abrir la caja fuerte, y un método getNumeroIntentos que devuelva el valor del atributo

(1 punto)
La clase debe tener un constructor sin parámetros que inicialice el atributo contrasenya utilizando el método getNumero4Digitos de la clase utilidades

(2 punto)
La clase además debe tener un constructor con un parámetro que indicará la contraseña, que será el valor del atributo contrasenya. Antes de asignar el valor al atributo, debe comprobarse que el valor dado como parámetro está entre 1000 y 9999, se deberan lanzar las excepciónes InsuficientesDigitosException con el mensaje de la constante DIGITOS_INSUFICIENTES si esta es menor de 1000 y la excepción ExcesivosDigitosException con el mensaje de la constante DIGITOS_EXCESIVOS si esta es mayor de 9999.

(2 puntos)
realizar el método checkearContrasenya que recibe un número entero y devuelve true si se ha acertado la contraseña y false en otro caso, este metodo además deberá lanzar las excepciónes InsuficientesDigitosException con el mensaje de la constante DIGITOS_INSUFICIENTES si el número pasado como parámetro es menor de 1000 y la excepción ExcesivosDigitosException con el mensaje de la constante DIGITOS_EXCESIVOS si es mayor de 9999.

(2 puntos)
realizar el método abrirCajaFuertePorConsola que pedirá al usuario por consola que introduzca un número de 4 dígitos para abrir la caja fuerte, el método leerá por consola el número y utilizará el método checkearContrasenya para comprobar la contraseña. Si el usuario acierta se imprimirá el mensaje "Ha abierto la caja fuerte.". Si el usuario no ha acertado se le pedirá una nueva contraseña, hasta que se agote el número de intentos, momento en que el programa terminará.
las posibles excepciones que puedan capturarse deberán de mostrarse al usuario,
Los intentos que lancen excepciones también deben contarse como también como fallos. Cuando se agoten las oportunidades se lanzará la excepción DemasiadosIntentosException, con el mensaje "Ha agotado las oportunidades".

Crear en el paquete es.corenetworks.dam.examenTema3 la clase ExamenSegundoParcial, esta clase contendrá un método main en el que se crearán distintas cajas fuertes con las distintas opciones y se utilizarán los métodos creados para probar la clase:

(1 punto)
crear una caja fuerte caja1 con el constructor sin parámetros
utilizar en caja1 el método abrirCajaFuertePorConsola para intentar abrir la caja fuerte.
utilizar en caja1 el método checkearContrasenya para intentar abrir la caja dentro de un bucle de 1000 iteraciones, pasando como argumento al método un número aleatorio entre 1000 y 9999
obtener la clave de la caja mediante el método getContrasenya y utilizarlo para abrir la caja fuerte

(1 punto)	
crear una caja fuerte caja2 pasando en el constructor la contraseña de la caja fuerte
utilizar en caja2 el método abrirCajaFuertePorConsola para intentar abrir la caja fuerte.
utilizar en caja2 el método checkearContrasenya para intentar abrir la caja, hacer directamente dos llamadas con clave incorrecta y una llamada con la clave correcta.
obtener la clave de la caja mediante el método getContrasenya y utilizarlo para abrir la caja fuerte


