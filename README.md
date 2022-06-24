# lab-3 sistemas operativos

## Nombres

Nicolás Vargas Pavez - 201904567-9
Sebastián Cifuentes - 201844528-2

## Respuesta: La forma más eficiente y rápida para resolver este problema es utilizando hebras, pues estas resulven de forma concurrente el problema no en el caso de la forma secuencial, pues estaría buscando 1 por 1 y en el peor caso(si es que parte buscando desde arriba), la palabra a buscar podría encontrarse en la ultima posición, por lo cual esta opción se demoraria más.

## Instrucciones de uso:

La sopa de letras debe estar incluida en el incluida en el archivo "matriz.txt", luego por terminal se preguntará la palabra a buscar, esta debe encontrarse dentro de la sopa de letras.
El hilo deberá tomar un cuadrante, el cual es un arreglo de strings y, dado que el largo de la palabra es el mismo que el del cuadrante, la palabra estará o no está en cada posicion del arreglo.
El makefile utilza 3 comando básicos make compile crea los archivos "'.class', luego se utiliza make run para comenzar a utilzar el programa y, por últmo, make clean para eliminar todos los archivos '.class'
Nos faltó implementar el hecho de invocar recurisvamente a cada hebra, por lo que no se podrá utilizar el programa correctamente, pero las funciones en sí están implementadas como el procedimiento de la hebra.

