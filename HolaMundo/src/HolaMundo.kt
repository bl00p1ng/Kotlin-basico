import model.Camera
import model.Movie
import model.Shoe

const val N = "Name"

fun main(args: Array<String>) {
    println("Hola Mundo")

    // Primitivos
    println("Primitivos")
    println(1 + 1)
    println(3 - 1)
    println(2 * 2)
    println(4 / 2)
    println(7 % 2)

    // Objetos
    val a = 4
    val b = 2

    println("\nObjetos")
    println(a.plus(b))
    println(a.minus(b))
    println(a.times(b))
    println(a.div(b))

    // var
    println("\nvar")
    var n = 3
    println("n = $n")
    n = 10
    println("n = $n")

    // val
    println("\nval")
    val name = args[0]
    println("name = $name")

    // const
    println("\nconst")
    println("N = $N")

    // Strings
    println("\nStrings")
    val nombre = "Andrés"
    val apellido: String = "López"
    println("Tu nombre es $nombre $apellido")

    // Raw Strings
    println("\nRaw Strings")
    val paragraph = """
        Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore 
        magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo 
        consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.
    """.trimIndent()
    println("paragraph = $paragraph")

    // Rangos
    println("\n Rangos")
    val oneToHundred: IntRange = 1..10
    for (i in oneToHundred) {
        println(i)
    }

    val aToZ: CharRange = 'A'..'Z'
    for (letter in aToZ) {
        println(letter)
    }

    /*
    Otra forma de imprimir el rango anterior
    for (letter in 'A'..'Z') {
        println(letter)
    }
     */

    // If
    println("\nIf")
    val number = 2
    if (number != 2) {
        println("number es diferente de 2")
    }

    if (number.equals(2)) {
        println("number es igual a 2")
    } else {
        println("No, no son iguales")
    }

    // When
    println("\nWhen")
    when(number) {
        in 1..5 -> println("Si esta entre 1 y 5")
        in 1..3 -> println("Si esta entre 1 y 3")
        !in 5..10 -> println("No esta entre 5 y 10")
        else -> println("No esta en ninguno de los anteriores")
    }

    // While
    println("\nWhile")
    var i = 1
    while (i <= 10) {
        println("i = $i")
        i++
    }

    // Do While
    println("\nDo While")
    i = 1
    do {
        println("i = $i")
        i++
    } while (i <= 10)

    // Null safety
    println("\nNull safety")

   /*try {
        var compute: String?
        compute = null
        var longitud: Int = compute!!.length
    } catch (e: NullPointerException) {
        println("Ingresa un valor, no aceptamos nulos")
    }*/

    // Llamada segura
    println("\nLlamada segura")
    val compute: String? = null
    val longitud: Int? = compute?.length
    println("longitud = $longitud")

    // Operador Elvis
    println("\nOperador Elvis")
    val teclado: String? = null
    val longitudTeclado: Int = teclado?.length ?: 0
    println("Longitud teclado; $longitudTeclado")

    val listWithNulls: List<Int?> = listOf<Int?>(7, null, null, 4)
    println("Lista con null: $listWithNulls")

    val listWithoutNull: List<Int> = listWithNulls.filterNotNull()
    println(listWithoutNull)

    // Arrays
    println("\nArrays")
    val countries = arrayOf("India", "México", "Colombia", "Argentina", "Chile", "Perú", 5, 6)
    val days = arrayOf<String>("Lunes", "Martes", "Miércoles", "Jueves", "Sábado", "Domingo")

    // Convertir un Array de objetos en un Array de tipos primitivos
    println("\nConversión de Arrays")
    var arrayObject = arrayOf(5, 6, 7, 8)
    var intPrimitive: IntArray = arrayObject.toIntArray()

    // Métodos de Arrays
    println("\nMétodos de Arrays")
    val suma = arrayObject.sum()
    println("La suma de Array es $suma")

    arrayObject = arrayObject.plus(4)
    for (element in arrayObject) {
        println(element)
    }

    arrayObject = arrayObject.reversedArray()
    for (element in arrayObject) {
        println(element)
    }

    // Expresiones
    println("\nExpresiones")
    var x = 5;
    println("x es igual a 5? ${x == 5}")

    val msg = "El valor de x es $x"
    x++
    println("${msg.replace("es", "fue")}, x es igual a $x")

    // Funciones
    println("\nFunciones")
    println("Raíz cuadrada de: ${Math.sqrt(4.0)}")

    // Promedio números
    val numbers = intArrayOf(6, 6, 23, 9, 2, 3, 2)
    println("El promedio de los números es: ${averageNumbers(numbers)}")

    println("${evaluate(number = 8)}")

    // Lambdas
    println("\nLambdas")
    val saludo = { println("Hola mundo") }
    saludo()

    val plus = {a: Int, b: Int, c: Int -> a + b + c}
    val result = plus(3, 4, 5)
    println("result = $result")

    // Otra forma de crear funciones Lambda
    println({ a: Int, b: Int, c: Int -> a + b + c }(1, 2, 3))

    val calculateNumber = {n: Int ->
        when(n) {
            in 1..3 -> println("El número esta entre 1 y 3")
            in 4..7 -> println("El número esta entre 4 y 7")
            in 8..10 -> println("El número esta entre 8 y 10")
        }
    }

    calculateNumber(6)

    // Clases
    println("\nClases")
    val camera = Camera()
    camera.turnOn()
    println(camera.getCameraStatus())

    // Getters y Setters
    println("\nGetters y Setters")
    camera.setResolution(1080)
    println("Resolution: ${camera.getResolution()}")

    // Getters y Setters propios de Kotlin
    println("\nGetters y Setters propios de Kotlin")
    val shoe = Shoe(2345, "Praga", "Shoe", "Blue Shoes")
    /*shoe.size = 33
    println(shoe.size)
    println(shoe.mark)

    shoe.model = "Tennis"
    println(shoe.model)*/

    // Data Class
    println("\nData Class")
    val movie = Movie("Ready Player One", "Steven Spielberg", 140)
    println("🎥 Movie")
    println(movie.title)
    println(movie.creator)
    println("${movie.duration} mins")

    // Herencia y Polimorfismo
    println("\nHerencia y Polimorfismo")
    println("$shoe")
}

fun evaluate(character: Char = '=', number: Int  = 2): String {
    return "$number es $character"
}

fun averageNumbers(numbers: IntArray): Int {
    var sum = 0
    for (num in numbers) {
        sum += num
    }

    return sum / numbers.size
}