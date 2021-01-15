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
    val numbers = intArrayOf(6, 6, 23, 9, 2, 3, 2)

    for (num in numbers) {
        println("Numbers: $num")
    }

    // Promedio de los números dados
    var sum = 0
    for (num in numbers) {
        sum += num
    }

    var average = sum / numbers.size
    println("average = $average")
}