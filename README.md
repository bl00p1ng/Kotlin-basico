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

  