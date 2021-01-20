fun main() {
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
    var ingredientesSeleccionados = arrayOf<String?>()
    fun makeRecipe() {

        if (response == "1") {

            do {
                println("\n\n🥩 Elige los ingredientes de tu receta")
                println(
                    """                
                    1 → Agua
                    2 → Leche
                    3 → Carne
                    4 → Verduras
                    5 → Frutas
                    6 → Cereal
                    7 → Huevos
                    8 → Aceite
                    
                    🛈 Escribe "confirmar" sin las comillas cuando termines de elegir los ingredientes                 
                """.trimIndent()
                )

                val eleccionUsuario = readLine()

                // Evaluar los ingredientes que ingreso el usuario e ingresarla en un Array
                when (eleccionUsuario) {
                    "1" -> ingredientesSeleccionados = ingredientesSeleccionados.plus("Agua")
                    "2" -> ingredientesSeleccionados = ingredientesSeleccionados.plus("Leche")
                    "3" -> ingredientesSeleccionados = ingredientesSeleccionados.plus("Carne")
                    "4" -> ingredientesSeleccionados = ingredientesSeleccionados.plus("Verduras")
                    "5" -> ingredientesSeleccionados = ingredientesSeleccionados.plus("Frutas")
                    "6" -> ingredientesSeleccionados = ingredientesSeleccionados.plus("Cereal")
                    "7" -> ingredientesSeleccionados = ingredientesSeleccionados.plus("Huevos")
                    "8" -> ingredientesSeleccionados = ingredientesSeleccionados.plus("Aceite")
                }
            } while (!(eleccionUsuario.equals("confirmar", true)))
        }
    }

    makeRecipe()

    // Ver Recetas
    fun viewRecipe() {
        // Mostar ingredientes que ingreso el usuario
        println("Elegiste los siguientes ingredientes:")
        for (ingrediente in ingredientesSeleccionados) {
            println("- $ingrediente")
        }
    }

    viewRecipe()
}
