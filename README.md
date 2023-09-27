# Dev_Challenges_2022

####  **Challenge #51**

 Enunciado: Crea tu propio enunciado para que forme parte de los retos de 2023.
 - Ten en cuenta que su dificultad debe ser asumible por la comunidad y seguir
 un estilosemejante a los que hemos realizado durante el año.
 - Si quieres también puedes proponer tu propia solución al reto
   (en el lenguaje que quieras).

 ####  **Challenge #50**

 Enunciado: Crea una función que sea capaz de encriptar y desencriptar texto
 utilizando el algoritmo de encriptación de Karaca
 (debes buscar información sobre él).

 ####  **Challenge #49**

 Enunciado: Crea una función que sea capaz de detectar y retornar todos los
 handles de un texto usando solamente Expresiones Regulares.
 Debes crear una expresión regular para cada caso:
 - Handle usuario: Los que comienzan por "@"
 - Handle hashtag: Los que comienzan por "#"
 - Handle web: Los que comienzan por "www.", "http://", "https://"
   y finalizan con un dominio (.com, .es...)

 ####  **Challenge #48**

 ¿Conoces el calendario de adviento de la comunidad (https://adviento.dev)?
 24 días, 24 regalos sorpresa relacionados con desarrollo de software,
 ciencia y tecnología desde el 1 de diciembre.

 Enunciado: Crea una función que reciba un objeto de tipo "Date" y retorne
 lo siguiente:
 - Si la fecha coincide con el calendario de aDEViento 2022: Retornará el regalo
   de ese día (a tu elección) y cuánto queda para que finalice el sorteo de ese día.
 - Si la fecha es anterior: Cuánto queda para que comience el calendario.
 - Si la fecha es posterior: Cuánto tiempo ha pasado desde que ha finalizado.

 Notas:
 - Tenemos en cuenta que cada día del calendario comienza a medianoche 00:00:00
   y finaliza a las 23:59:59.
 - Debemos trabajar con fechas que tengan año, mes, día, horas, minutos
   y segundos.
 - 🎁 Cada persona que aporte su solución entrará en un nuevo sorteo
   del calendario de aDEViento hasta el día de su corrección
   (sorteo exclusivo para quien entregue su solución).

 ####  **Challenge #47**

 Enunciado: Crea un función que reciba un texto y retorne la vocal que
 más veces se repita.
 - Ten cuidado con algunos casos especiales.
 - Si no hay vocales podrá devolver vacío.

 ####  **Challenge #46**

 Enunciado: Calcula dónde estará un robot (sus coordenadas finales) que se
 encuentra en una cuadrícula representada por los ejes "x" e "y".
 - El robot comienza en la coordenada (0, 0).
 - Para idicarle que se mueva, le enviamos un array formado por enteros
   (positivos o negativos) que indican la secuencia de pasos a dar.
 - Por ejemplo: [10, 5, -2] indica que primero se mueve 10 pasos, se detiene,
   luego 5, se detiene, y finalmente 2.
   El resultado en este caso sería (x: -5, y: 12)
 - Si el número de pasos es negativo, se desplazaría en sentido contrario al
   que está mirando.
 - Los primeros pasos los hace en el eje "y". Interpretamos que está mirando
   hacia la parte positiva del eje "y".
 - El robot tiene un fallo en su programación: cada vez que finaliza una
   secuencia de pasos gira 90 grados en el sentido contrario a las agujas
   del reloj.

 ####  **Challenge #45**

 Enunciado: Dado un array de números enteros positivos, donde cada uno
 representa unidades de bloques apilados, debemos calcular cuantas unidades
 de agua quedarán atrapadas entre ellos.

 - Ejemplo: Dado el array [4, 0, 3, 6, 1, 3].

         ⏹
         ⏹
   ⏹💧💧⏹
   ⏹💧⏹⏹💧⏹
   ⏹💧⏹⏹💧⏹
   ⏹💧⏹⏹⏹⏹

   Representando bloque con ⏹︎ y agua con 💧, quedarán atrapadas 7 unidades
   de agua. Suponemos que existe un suelo impermeable en la parte inferior
   que retiene el agua.

 ####  **Challenge #44**

 Enunciado: Crea una función que retorne el número total de bumeranes de
 un array de números enteros e imprima cada uno de ellos.
 - Un bumerán (búmeran, boomerang) es una secuencia formada por 3 números
   seguidos, en el que el primero y el último son iguales, y el segundo
   es diferente. Por ejemplo [2, 1, 2].
 - En el array [2, 1, 2, 3, 3, 4, 2, 4] hay 2 bumeranes ([2, 1, 2]
   y [4, 2, 4]).

 ####  **Challenge #43**

 Enunciado: Este es un reto especial por Halloween.
 Deberemos crear un programa al que le indiquemos si queremos realizar "Truco
 o Trato" y un listado (array) de personas con las siguientes propiedades:
 - Nombre de la niña o niño
 - Edad
 - Altura en centímetros

 Si las personas han pedido truco, el programa retornará sustos (aleatorios)
 siguiendo estos criterios:
 - Un susto por cada 2 letras del nombre por persona
 - Dos sustos por cada edad que sea un número par
 - Tres sustos por cada 100 cm de altura entre todas las personas
 - Sustos: 🎃 👻 💀 🕷 🕸 🦇

 Si las personas han pedido trato, el programa retornará dulces (aleatorios)
 siguiendo estos criterios:
 - Un dulce por cada letra de nombre
 - Un dulce por cada 3 años cumplidos hasta un máximo de 10 años por persona
 - Dos dulces por cada 50 cm de altura hasta un máximo de 150 cm por persona
 - Dulces: 🍰 🍬 🍡 🍭 🍪 🍫 🧁 🍩

 ####  **Challenge #42**

 Enunciado: Crea una función que transforme grados Celsius en Fahrenheit
 y viceversa.

 - Para que un dato de entrada sea correcto debe poseer un símbolo "°"
   y su unidad ("C" o "F").
 - En caso contrario retornará un error.
 - ¿Quieres emplear lo aprendido en este reto?
   Revisa el reto mensual y crea una App:
   https://retosdeprogramacion.com/mensuales2022

 ####  **Challenge #41**

 Enunciado: Crea una función que calcule el valor del parámetro perdido
 correspondiente a la ley de Ohm.
 - Enviaremos a la función 2 de los 3 parámetros (V, R, I), y retornará
   el valor del tercero (redondeado a 2 decimales).
 - Si los parámetros son incorrectos o insuficientes, la función retornará
   la cadena de texto "Invalid values".

 ####  **Challenge #40**

 Enunciado: Crea una función que sea capaz de dibujar el "Triángulo de Pascal"
 indicándole únicamente el tamaño del lado.

 - Aquí puedes ver rápidamente cómo se calcula el triángulo:
   https://commons.wikimedia.org/wiki/File:PascalTriangleAnimated2.gif

 ####  **Challenge #39**

 Enunciado: Implementa uno de los algoritmos de ordenación más famosos:
 el "Quick Sort", creado por C.A.R. Hoare.
 - Entender el funcionamiento de los algoritmos más utilizados de la historia
   Nos ayuda a mejorar nuestro conocimiento sobre ingeniería de software.
   Dedícale tiempo a entenderlo, no únicamente a copiar su implementación.
 - Esta es una nueva serie de retos llamada "TOP ALGORITMOS",
   donde trabajaremos y entenderemos los más famosos de la historia.

 ####  **Challenge #38**

 Enunciado: Crea un programa se encargue de transformar un número binario
 a decimal sin utilizar funciones propias del lenguaje que
 lo hagan directamente.

 ####  **Challenge #37**

 Enunciado: ¡Han anunciado un nuevo "The Legend of Zelda"!
 Se llamará "Tears of the Kingdom" y se lanzará el 12 de mayo de 2023.
 Pero, ¿recuerdas cuánto tiempo ha pasado entre los distintos
 "The Legend of Zelda" de la historia?
 Crea un programa que calcule cuántos años y días hay entre 2 juegos de Zelda
 que tú selecciones.
 - Debes buscar cada uno de los títulos y su día de lanzamiento
   (si no encuentras el día exacto puedes usar el mes, o incluso inventártelo)

 ####  **Challenge #36**

 Enunciado: ¡La Tierra Media está en guerra! En ella lucharán razas leales
 a Sauron contra otras bondadosas que no quieren que el mal reine
 sobre sus tierras.
 Cada raza tiene asociado un "valor" entre 1 y 5:
 - Razas bondadosas: Pelosos (1), Sureños buenos (2), Enanos (3),
   Númenóreanos (4), Elfos (5)
 - Razas malvadas: Sureños malos (2), Orcos (2), Goblins (2),
   Huargos (3), Trolls (5)
 Crea un programa que calcule el resultado de la batalla entre
 los 2 tipos de ejércitos:
 - El resultado puede ser que gane el bien, el mal, o exista un empate.
   Dependiendo de la suma del valor del ejército y el número de integrantes.
 - Cada ejército puede estar compuesto por un número de integrantes variable
   de cada raza.
 - Tienes total libertad para modelar los datos del ejercicio.
 Ej: 1 Peloso pierde contra 1 Orco
     2 Pelosos empatan contra 1 Orco
     3 Pelosos ganan a 1 Orco

 ####  **Challenge #35**

 Enunciado: Crea un programa que calcule el daño de un ataque durante
 una batalla Pokémon.
 - La fórmula será la siguiente: daño = 50 * (ataque / defensa) * efectividad
 - Efectividad: x2 (súper efectivo), x1 (neutral), x0.5 (no es muy efectivo)
 - Sólo hay 4 tipos de Pokémon: Agua, Fuego, Planta y Eléctrico
   (buscar su efectividad)
 - El programa recibe los siguientes parámetros:
  - Tipo del Pokémon atacante.
  - Tipo del Pokémon defensor.
  - Ataque: Entre 1 y 100.
  - Defensa: Entre 1 y 100.

 ####  **Challenge #34**

 Enunciado: Dado un array de enteros ordenado y sin repetidos,
 crea una función que calcule y retorne todos los que faltan entre
 el mayor y el menor.
 - Lanza un error si el array de entrada no es correcto.

 ####  **Challenge #33**

 Enunciado: Crea un función, que dado un año, indique el elemento
 y animal correspondiente en el ciclo sexagenario del zodíaco chino.
 - Info: https://www.travelchinaguide.com/intro/astrology/60year-cycle.htm
 - El ciclo sexagenario se corresponde con la combinación de los elementos
   madera, fuego, tierra, metal, agua y los animales rata, buey, tigre,
   conejo, dragón, serpiente, caballo, oveja, mono, gallo, perro, cerdo
   (en este orden).
 - Cada elemento se repite dos años seguidos.
 - El último ciclo sexagenario comenzó en 1984 (Madera Rata).

 ####  **Challenge #32**

 Dado un listado de números, encuentra el SEGUNDO más grande.

 ####  **Challenge #31**

 Crea una función que imprima los 30 próximos años bisiestos
 siguientes a uno dado.
 - Utiliza el menor número de líneas para resolver el ejercicio.

 ####  **Challenge #30**

 Crea una función que reciba un texto y muestre cada palabra en una línea,
 formando un marco rectangular de asteriscos.
 - ¿Qué te parece el reto? Se vería así:
   **********
   * ¿Qué   *
   * te     *
   * parece *
   * el     *
   * reto?  *
   **********

 ####  **Challenge #29**

 Crea una función que ordene y retorne una matriz de números.
 - La función recibirá un listado (por ejemplo [2, 4, 6, 8, 9]) y un parámetro
   adicional "Asc" o "Desc" para indicar si debe ordenarse de menor a mayor
   o de mayor a menor.
 - No se pueden utilizar funciones propias del lenguaje que lo resuelvan
   automáticamente.

 ####  **Challenge #28**

 Simula el funcionamiento de una máquina expendedora creando una operación
 que reciba dinero (array de monedas) y un número que indique la selección
 del producto.
 - El programa retornará el nombre del producto y un array con el dinero
   de vuelta (con el menor número de monedas).
 - Si el dinero es insuficiente o el número de producto no existe,
   deberá indicarse con un mensaje y retornar todas las monedas.
 - Si no hay dinero de vuelta, el array se retornará vacío.
 - Para que resulte más simple, trabajaremos en céntimos con monedas
   de 5, 10, 50, 100 y 200.
 - Debemos controlar que las monedas enviadas estén dentro de las soportadas.

 ####  **Challenge #27**

 Crea un programa que determine si dos vectores son ortogonales.
 - Los dos array deben tener la misma longitud.
 - Cada vector se podría representar como un array. Ejemplo: [1, -2]

 ####  **Challenge #26**

 Crea un programa que dibuje un cuadrado o un triángulo con asteriscos "*".
 - Indicaremos el tamaño del lado y si la figura a dibujar es una u otra.
 - EXTRA: ¿Eres capaz de dibujar más figuras?

 ####  **Challenge #25**

 Crea un programa que calcule quien gana más partidas al piedra,
 papel, tijera.
 - El resultado puede ser: "Player 1", "Player 2", "Tie" (empate)
 - La función recibe un listado que contiene pares, representando cada jugada.
 - El par puede contener combinaciones de "R" (piedra), "P" (papel)
   o "S" (tijera).
 - Ejemplo. Entrada: [("R","S"), ("S","R"), ("P","S")]. Resultado: "Player 2".

 ####  **Challenge #24**

 Quiero contar del 1 al 100 de uno en uno (imprimiendo cada uno).
 ¿De cuántas maneras eres capaz de hacerlo?
 Crea el código para cada una de ellas.

 ####  **Challenge #23**

 Crea dos funciones, una que calcule el máximo común divisor (MCD) y otra
 que calcule el mínimo común múltiplo (mcm) de dos números enteros.
 - No se pueden utilizar operaciones del lenguaje que
   lo resuelvan directamente.

 ####  **Challenge #22**

 Crea una función que reciba dos array, un booleano y retorne un array.
 - Si el booleano es verdadero buscará y retornará los elementos comunes
   de los dos array.
 - Si el booleano es falso buscará y retornará los elementos no comunes
   de los dos array.
 - No se pueden utilizar operaciones del lenguaje que
   lo resuelvan directamente.

 ####  **Challenge #21**

 Lee el fichero "Challenge21.txt" incluido en el proyecto, calcula su
 resultado e imprímelo.
 - El .txt se corresponde con las entradas de una calculadora.
 - Cada línea tendrá un número o una operación representada por un
   símbolo (alternando ambos).
 - Soporta números enteros y decimales.
 - Soporta las operaciones suma "+", resta "-", multiplicación "*"
   y división "/".
 - El resultado se muestra al finalizar la lectura de la última
   línea (si el .txt es correcto).
 - Si el formato del .txt no es correcto, se indicará que no se han
   podido resolver las operaciones.

 ####  **Challenge #20**

 Crea una función que sume 2 números y retorne su resultado pasados
 unos segundos.
 - Recibirá por parámetros los 2 números a sumar y los segundos que
   debe tardar en finalizar su ejecución.
 - Si el lenguaje lo soporta, deberá retornar el resultado de forma
   asíncrona, es decir, sin detener la ejecución del programa principal.
   Se podría ejecutar varias veces al mismo tiempo.

 ####  **Challenge #19**

 Crea una función que reciba días, horas, minutos y segundos (como enteros)
 y retorne su resultado en milisegundos.

 ####  **Challenge #18**

 Crea una función que analice una matriz 3x3 compuesta por "X" y "O"
 y retorne lo siguiente:
 - "X" si han ganado las "X"
 - "O" si han ganado los "O"
 - "Empate" si ha habido un empate
 - "Nulo" si la proporción de "X", de "O", o de la matriz no es correcta.
   O si han ganado los 2.
 Nota: La matriz puede no estar totalmente cubierta.
 Se podría representar con un vacío "", por ejemplo.

 ####  **Challenge #17**

 Crea una función que evalúe si un/a atleta ha superado correctamente una
 carrera de obstáculos.
 - La función recibirá dos parámetros:
      - Un array que sólo puede contener String con las palabras
        "run" o "jump"
      - Un String que represente la pista y sólo puede contener "_" (suelo)
        o "|" (valla)
 - La función imprimirá cómo ha finalizado la carrera:
      - Si el/a atleta hace "run" en "_" (suelo) y "jump" en "|" (valla)
        será correcto y no variará el símbolo de esa parte de la pista.
      - Si hace "jump" en "_" (suelo), se variará la pista por "x".
      - Si hace "run" en "|" (valla), se variará la pista por "/".
 - La función retornará un Boolean que indique si ha superado la carrera.
 Para ello tiene que realizar la opción correcta en cada tramo de la pista.

 ####  **Challenge #16**

 Crea una función que reciba un String de cualquier tipo y se encargue de
 poner en mayúscula la primera letra de cada palabra.
 - No se pueden utilizar operaciones del lenguaje que
   lo resuelvan directamente.

 ####  **Challenge #15**

 Crea una función que calcule y retorne cuántos días hay entre dos cadenas
 de texto que representen fechas.
 - Una cadena de texto que representa una fecha tiene el formato "dd/MM/yyyy".
 - La función recibirá dos String y retornará un Int.
 - La diferencia en días será absoluta (no importa el orden de las fechas).
 - Si una de las dos cadenas de texto no representa una fecha correcta se
   lanzará una excepción.

 ####  **Challenge #14**

 Escribe una función que calcule si un número dado es un número de Armstrong
 (o también llamado narcisista).
 Si no conoces qué es un número de Armstrong, debes buscar información
 al respecto.

 ####  **Challenge #13**

 Escribe una función que calcule y retorne el factorial de un número dado
 de forma recursiva.

 ####  **Challenge #12**

 Escribe una función que reciba un texto y retorne verdadero o
 falso (Boolean) según sean o no palíndromos.
 Un Palíndromo es una palabra o expresión que es igual si se lee
 de izquierda a derecha que de derecha a izquierda.
 NO se tienen en cuenta los espacios, signos de puntuación y tildes.
 Ejemplo: Ana lleva al oso la avellana.

 ####  **Challenge #11**

 Crea una función que reciba dos cadenas como parámetro (str1, str2)
 e imprima otras dos cadenas como salida (out1, out2).
 - out1 contendrá todos los caracteres presentes en la str1 pero NO
   estén presentes en str2.
 - out2 contendrá todos los caracteres presentes en la str2 pero NO
   estén presentes en str1.

 ####  **Challenge #10**

 Crea un programa que comprueba si los paréntesis, llaves y corchetes
 de una expresión están equilibrados.
 - Equilibrado significa que estos delimitadores se abren y cieran
   en orden y de forma correcta.
 - Paréntesis, llaves y corchetes son igual de prioritarios.
   No hay uno más importante que otro.
 - Expresión balanceada: { [ a * ( c + d ) ] - 5 }
 - Expresión no balanceada: { a * ( c + d ) ] - 5 }

 ####  **Challenge #9**

 Crea un programa que sea capaz de transformar texto natural a código
 morse y viceversa.
 - Debe detectar automáticamente de qué tipo se trata y realizar
   la conversión.
 - En morse se soporta raya "—", punto ".", un espacio " " entre letras
   o símbolos y dos espacios entre palabras "  ".
 - El alfabeto morse soportado será el mostrado en
   https://es.wikipedia.org/wiki/Código_morse.

 ####  **Challenge #8**

 Crea un programa se encargue de transformar un número
 decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.

 ####  **Challenge #7**

 Crea un programa que cuente cuantas veces se repite cada palabra
 y que muestre el recuento final de todas ellas.
 - Los signos de puntuación no forman parte de la palabra.
 - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
 - No se pueden utilizar funciones propias del lenguaje que
   lo resuelvan automáticamente.

 ####  **Challenge #6**

 Crea un programa que invierta el orden de una cadena de texto
 sin usar funciones propias del lenguaje que lo hagan de forma automática.
 - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"

 ####  **Challenge #5**

 Crea un programa que se encargue de calcular el aspect ratio de una
 imagen a partir de una url.
 - Url de ejemplo: https://raw.githubusercontent.com/mouredev/
   mouredev/master/mouredev_github_profile.png
 - Por ratio hacemos referencia por ejemplo a los "16:9" de una
   imagen de 1920*1080px.

 ####  **Challenge #4**

 Crea una única función (importante que sólo sea una) que sea capaz
 de calcular y retornar el área de un polígono.
 - La función recibirá por parámetro sólo UN polígono a la vez.
 - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 - Imprime el cálculo del área de un polígono de cada tipo.

 ####  **Challenge #3**

 Escribe un programa que se encargue de comprobar si un número es o no primo.
 Hecho esto, imprime los números primos entre 1 y 100.

 ####  **Challenge #2**

 Escribe un programa que imprima los 50 primeros números de la sucesión
 de Fibonacci empezando en 0.
 - La serie Fibonacci se compone por una sucesión de números en
   la que el siguiente siempre es la suma de los dos anteriores.
   0, 1, 1, 2, 3, 5, 8, 13...

 ####  **Challenge #1**

 Escribe una función que reciba dos palabras (String) y retorne
 verdadero o falso (Bool) según sean o no anagramas.
 - Un Anagrama consiste en formar una palabra reordenando TODAS
   las letras de otra palabra inicial.
 - NO hace falta comprobar que ambas palabras existan.
 - Dos palabras exactamente iguales no son anagrama.

 ####  **Challenge #0**

 Escribe un programa que muestre por consola (con un print) los
 números de 1 a 100 (ambos incluidos y con un salto de línea entre
 cada impresión), sustituyendo los siguientes:
 - Múltiplos de 3 por la palabra "fizz".
 - Múltiplos de 5 por la palabra "buzz".
 - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".


---------------------

Credits: https://github.com/mouredev/Weekly-Challenge-2022-Kotlin
