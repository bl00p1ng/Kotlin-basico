fun main(args: Array<String>) {
    var response: String? = ""
    // Mostar menú
    fun showMenu() {
        do {
            println("\n:: Bienvenido a Recipe Maker ::")
            println("""
                Selecciona la opción deseada
                1 → Hacer una receta
                2 → Ver mis recetas
                3 → Salir
            """.trimIndent())
            response = readLine()

            // Verificar que el usuario elija una opción
            if (response == null) {
                println("⚠ Por favor ingresa una opción")
            }

            // Terminar de mostrar el menú
            if (response == "1" || response == "2") break
        } while (response != "3")
    }

    showMenu()

    // Hacer una receta
    if (response == "1") {

        do {
            println("\n\n🥩 Elige los ingredientes de tu receta")
            println("""                
                1 → Agua
                2 → Leche
                3 → Carne
                4 → Verduras
                5 → Frutas
                6 → Cereal
                7 → Huevos
                9 → Aceite
                
                🛈 Escribe "confirmar" sin las comillas cuando termines de elegir los ingredientes                 
            """.trimIndent())
            response = readLine()

        } while (!(response.equals("confirmar", true)))
    }
}
