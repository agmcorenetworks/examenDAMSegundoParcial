# Examen Segundo parcial programación DAM 

INSTRUCCIONES:

El examen práctico de programación consistirá en el desarrollo de los problemas descritos en los documentos EXAMEN_PARTE_X.md

Está divida en tres partes, no hay un tiempo específico para cada una, el total de esta parte será de 3 horas.

Para la realización del examen, el alumno deberá:
- acceder a la página del repositorio de git del profesor
- acceder al repositorio examenDAMSegundoParcial
- copiar la url del repositorio
- crear una carpeta en el disco duro local en c: llamada examen_DAM
- clonar el repositorio en la carpeta local c:\examen_DAM mediante el comando git clone
- una vez creado el repositorio se hacer un checkout de la rama examen_16032023_v2
- crear una rama nueva con el formato nombre_apellido1_apellido2
usando el comando git checkout -b nombre_apellido1_apellido2
- realizar un git push para subir la rama recién creada
- realizar el git git push --set-upstream origin nombre_apellido1_apellido2
Una vez hechos estos pasos se podrá empezar a codificar.

Para cargar el proyecto en eclipse seleccionar File → import →Maven → Existing maven projects → browse → seleccionamos c:\examen_DAM donde debe de estar nuestro proyecto maven, aceptamos y el proyecto debería cargarse sin problemas.

Para ejecutar los tests unitarios:
Hacemos click en la clase junit que queramos arrancar con el botón derecho del ratón → Run as → junit tests. Si no aparece esta opción, modificamos la versión de java con la que se ha cargado el proyecto:
En eclipse, clic con el botón derecho del ratón sobre la carpeta del proyecto → build path… → configure build path → pestaña libraries → JRE System library → edit → Execution environment → seleccionar del desplegable  java SE 19 ( cualquiera a partir de la 1.8 valdría)
Los tests unitarios darán error de compilación si no están todas las clases/métodos creados, para evitar los errores se pueden comentar los que no estén creados aun.
