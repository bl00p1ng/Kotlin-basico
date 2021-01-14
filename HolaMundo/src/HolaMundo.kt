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
}