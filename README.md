# Curso Básico de Kotlin

Apuntes y archivos del [Curso Básico de Kotlin de Platzi](https://platzi.com/clases/kotlin/)

## 📚 Módulo 1. Bienvenida e introducción

- ### Clase 1. ¿Por qué debo aprender Kotlin?

  **Kotlin** es uno de los lenguajes oficiales que **Google** ha adoptado como parte de la familia de lenguajes de programación para desarrollar con **Android**. Kotlin fue desarrollado desde el año 2010 gracias a JetBrains y su primera versión fue liberada en el año 2016.

  **Kotlin** es:

  - **Conciso**: reduce código a diferencia de Java.
  - **Seguro**: Kotlin tiene un método para evitar las excepciones así como para manejar las *NullPointerException*.
  - **Interoperable**: **Kotlin** al ser creado por **JetBrains** lo decidieron hacer basado en la máquina virtual de Java, es decir puedes trabajar con **Java** y **Kotlin** en una aplicación ya que comparten la misma máquina virtual.
  - **Versátil**: podemos aplicarlo en diferentes tipos de aplicaciones. Del lado del servidor con *Kotlin Server Side - Ktor*, del lado *Mobile Android* y del lado web con *KotlinJS*.

  **Java** usa *javac* y **Kotlin** usa *kotlinc* ambos al ser compilado se transforman en código **ByteCode** que es el código que lee la máquina virtual de **Java** (*Java Virtual Machine*)

  ![Cómo funciona Java](https://i.imgur.com/4MO24Rq.png)

- ### Clase 2. Mi primer programa en Kotlin

  Para empezar a trabajar con Kotlin se necesita:

  - El JDK de Java
  - IntelliJ Idea (Integra por defecto el compilador de Kotlin)

  La extensión de archivo de Kotlin es ``.kt``

  #### Función main en Kotlin

  ````kotlin
  fun main(args: Array<String>) {
      println("Hello World!")
  }
  ````


## 📚 Módulo 2. Conceptos básicos

- ### Clase 3. Variables vs. Objetos

  #### Variable

  Espacio que se reserva en memoria para guardar un sólo dato.

  #### Objetos

  Son un espacio en memoria un poco más complejo, pues puede componerse de múltiples variables y/o objetos, métodos, etc.

  En Kotlin todo es un objeto, se tratan de evitar los tipos de datos primitivos por lo que *no se deben declarar valores primitivos en Kotlin*. No obstante cuando no se usa un elemento como un objeto Kotlin lo toma como un primitivo, **por ejemplo:**

  ````kotlin
  var i = 10
  i = i * 2
  println(i)
  ````

  Kotlin utiliza *Wrappers* para los números, a esto se le conoce como **Boxing**.

  #### Operadores

  Dado que en Kotlin hay que procurar como buena práctica que todo sea un objeto hay una serie de métodos que cumplen la misma función que los operadores de los tipos primitivos:

  ![métodos](https://i.imgur.com/VKJkrin.png)

  ![métodos 2](https://i.imgur.com/xcDrb3q.png)

  ![métodos 3](https://i.imgur.com/HYUswRU.png)


- ### Clase 4. Operadores en Kotlin

  ````kotlin
  val a = 4 // Declarar una variable. 
  a.plus(b) // Ejecutar métodos. plus() → Método para sumar
  ````

  Aunque aparentemente ``a`` es una variable, Kotlin internamente trata esa variable como un objeto, por eso se pueden ejecutar métodos sobre ``a``.

  Es recomendable usar los métodos para hacer operaciones en lugar de usar operadores, esto es porque los métodos están mejor optimizados y permiten tener manejar de forma más eficiente hilos y coroutines.

- ### Clase 5.  Otros Operadores en Kotlin

  #### Operadores unarios

  Aplicar la ley de signos, permitiendo convertir un número positivo en negativo y viceversa.

  ````kotlin
  var a = -2
  var b = a.unaryMinus()
  println("b: $b")
  
  /* Esto imprimirá:
  b: 2 
  Porque (-) por (-) es (+)
  */
  ````

  **🛈 Nota:** También se pueden crear variables usando la palabra reservada ``var``

  #### Operador de negación

  Funciona con datos lógicos, este simplemente negará el dato establecido.

  ````kotlin
  var a = true
  var b = a.not()
  println("b: $b")
  
  // Esto imprimirá:
  B: FALSE
  ````

  Al utilizar datos lógicos, la función not() no será la única que se puede usar, hay otras opciones como se muestra en la figura:

  ![Otros operadores lógicos en Kotlin](https://i.imgur.com/PE51l60.jpg)

  #### Operador incremento y decremento

  Permiten incrementar o decrementar el valor de la variable en 1. Puede aplicarse pre-incremento/decremento y post-incremento/decremento.

  #### Operadores de equidad

  Permiten comparar si un dato es igual, o mayor, o mayor e igual que otro, etc. su resultado será un valor lógico. Estos pueden ser utilizados en los  controladores de flujo como if, when, for, while etc.

- ### Clase  6. Tipos de variables: var, val y const

  Hay 2 Tipos de variables en Kotlin: *changeales*(que se valor puede cambiar) y *unchangeables*(su valor no puede cambiar).

  ##### Changeables

  - ##### var

  #### Unchangeables

  En el caso de Kotlin es recomendable usar más este tipo de variables. Esto se debe a que Kotlin obedece mucho a los principios de la programación funcional, y uno de esos principios es la inmutabilidad.

  - ##### val

    El valor se puede determinar en tiempo de ejecución.

  - ##### const

    El valor se determina en tiempo de compilación.

- ### Clase 7. Ejercicio var val const

  #### var

  No es una buena práctica usar ``var``, usarlo sólo si es estrictamente necesario y las necesidades del programa lo requieran. Si ese es el caso hay que usar este tipo de variables sólo como **locales a un método**, nunca de manera global.

  ````kotlin
  var n = 3 // Declarar una variable con var
  ````

  **🛈 Nota:** no es una buena práctica usar ``var`` en variables globales, pues esto interfiere con el concepto de *funciones puras* que son funciones que no pueden ser alteradas y además al ser de scope global y a la vez una variable cuyo valor puede ser alterado en cualquier momento se provoca que el código sea vulnerable y que el resultado de la ejecución del mismo sea arbitrario.

  #### val

  ````kotlin
  val name = args[0]
  ````

  En las variables de tipo ``val`` el valor se asigna durante la ejecución del código

  ``val`` es ampliamente usado en variables de scope local

  #### const

  No se usa para definir variables locales pues su uso más extendido es la definición de variables globales. Al ser una constante, por convención el nombre de la variable se escribe  en mayúsculas. 

  ````java
  const val N = "NAME" // const val es el equivalente a final static en Java
  ````

  



