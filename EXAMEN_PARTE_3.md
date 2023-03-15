# Examen Segundo parcial programación DAM 

INSTRUCCIONES:

El examen práctico de programación consistirá en el desarrollo de los problemas descritos en este documento


(10 puntos)
# Parte 3

* En el paquete es.corenetworks.dam.examenTema3.algoritmos crear la clase FuerzaBruta:

(1 puntos)
- Esta clase contendrá tendrá un atributo llamado cajaFuerte de tipo CajaFuerte 
- Esta clase contendrá tendrá un atributo llamado tiempo  de tipo long 


(1 punto)
La clase tendra un constructor que recibirá un parametro de tipo caja fuerte, que servirá para inicializar el atributo cajaFuerte, la clase solo debe contener un constructor, el constructor además debe inicializar el atributo tiempo a 0.


(3 puntos)
- crear el metodo sacarCombinacion que adivine la contraseña de la caja fuerte mediante un bucle enter 1000 y 9999 (ambos inclusive) en el cual se utilizará el atributo interno cajaFuerte para invocar al metodo checkearContrasenya de la caja fuerte, pasandole en cada iteración un numero.
Este metodo devolverá la combinación encontrada por el algoritmo, no se tendrá en cuenta el tiempo que tarda en encontrarse la contraseña.


(1 puntos)
- Modificar el metodo anterior incluyendo un atributo llamado inicio antes de que comience a buscarse la contraseña, que tome el valor dado por el metodo getTime de la clase utilidades (el metodo getTime devuelve en milisegundos el momento en el que se invoca)
 Modificar el metodo anterior incluyendo un atributo llamado fin cuando la busqueda finalice o la contraseña se haya encontrado, que tome el valor dado por el metodo getTime de la clase utilidades (el metodo getTime devuelve en milisegundos el momento en el que se invoca)

(1 puntos)
- Utilizar las variables inicio y fin para calcular el tiempo usado por el algoritmo para encontrar la contraseña y guardar el valor en el atributo tiempo (el tiempo será la diferencia del inicio - el final,  Un ejemplo del valor (bastante real) de este atributo podría ser 355 milisegundos.)

(1 puntos)
- Crear el metodo getTiempo que devuelve el tiempo obtenido en encontrar una contraseña.

(2 puntos)
- Modificar la clase ExamenSegundoParcial del paquete es.corenetworks.dam.examenTema3, para usar el algoritmo de fuerza bruta y calcular el tiempo empleado en las distintas cajas fuertes 