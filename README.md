# Examen Segundo parcial programación DAM 

INSTRUCCIONES:

El examen práctico de programación consistirá en el desarrollo de los problemas descritos en el documento EXAMEN.md

Antes de la realización del examen, el alumno deberá:

- acceder a la pagina de git del profesor
- acceder al repositorio examenDAMSegundoParcial
- copiar la url del repositorio
- crear una carpeta en el disco duro local en c: llamada examen_DAM
- clonar el repositorio en la carpeta local c:\examen_DAM mediante el comando git clone
- una vez creado el repositorio se creará una nueva con el formato nombre_apellido1_apellido2 
usando el comando git checkout -r nombre_apellido1_apellido2
- realizar un git push para subir la rama recién creada
- realizar el git  git push --set-upstream origin nombre_apellido1_apellido2

Una vez hechos estos pasos se podrá empezar a codificar
Para entregar el examen el alumno deberá hacer un commit y un push al repositorio ende git en la nube del profesor. 

# El examen de cada alumno se considerará el código creado en su rama de git, por lo que no olvideis realizar commit y push a vuestra rama antes de abandonar el examen

Si no se realiza el correspondiente push, la rama existirá vacía por lo que se considerará como examen no entregado.

Cualquier accion de un alumno en la rama de otro alumno supondrá el suspenso para ambos alumnos. El historico de git indicará las acciones realizadas por cada usuarios en cada rama, en la rama de un alumno unicamente podrá haber acciones de ese alumno, cualquier registro de un alumno en el historico de git de otro alumnos supondrá el suspenso automatico de ambos alumnos


Los tests unitarios pueden utilizarse para comprobar el codigo, pero no son un indicador de la corrección del código, es decir, el que un test unitario se ejecute sin fallos no indica que el codigo sea correcto, unicamente que la comprobación de ese test no ha fallado, por ejemplo: Si se pide un metodo que genere un metodo aleatorio del 1 al 100 y el alumno genera el numero del 1 al 10 es posible que el test no falle sin embargo el codigo no sería correcto. 

La nota de cada ejercicio será puesta por el profesor según evaluación del correspondiente examen, durante la misma los tests se utilizarán como primer filtro, pero se evaluará personalmente cada ejercicio.
