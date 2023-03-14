# Examen Segundo parcial programación DAM 

INSTRUCCIONES:

El examen práctico de programación consistirá en el desarrollo de los problemas descritos en este documento


(10 puntos)
# Parte 3

* En el paquete es.corenetworks.dam.examenTema3.algoritmos crear la clase FuerzaBruta:

(2 puntos)
- Esta clase contendrá un objeto de la clase CajaFuerte que será inicializada en el constructor mediante un parametro, la clase solo debe contener un constructor, la clase además, tendrá un atributo tipo long para medir el tiempo que tarda el algoritmo en obtener la clave por defecto el valor de este atributo es 0.

(3 puntos)
- contendrá un metodo sacarCombinacion que utiliza el atributo interno de la caja fuerte para sacar la combinación de la caja fuerte utilizando un bucle y el metodo checkearContrasenya de la caja fuerte, este metodo devolverá la combinación encontrada por el algoritmo, no se tendrá en cuenta el tiempo que tarda en encontrarse la contraseña.

(3 puntos)
- Crear el metodo getTiempo que devuelve el tiempo obtenido en encontrar una contraseña. Para ello, modificar el metodo anterior para calcular el tiempo que tarda el algoritmo en encotrar la contraseña. Para hacer esto se utilizará el metodo getTime de la clase Utilidades que devuelve el tiempo transcurrido desde el 1 de enero de 1900 en milisegundos en milisegundos, una vez calculado el tiempo en el metodo anterior se debe guardar en el atributo tiempo. Un ejemplo del valor (bastante real) de este atributo podría ser 355 milisegundos.

(2 puntos)
- Modificar la clase ExamenSegundoParcial del paquete es.corenetworks.dam.examenTema3, para usar el algoritmo de fuerza bruta y calcular el tiempo empleado en las distintas cajas fuertes 