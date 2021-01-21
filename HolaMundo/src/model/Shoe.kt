package model

class Shoe(val sku: Int, var mark: String) : Any() {

    override fun toString(): String {
        return "SKU ID: $sku\nMARK: $mark\nMODEL: $model\nCOLOR: $color\nSIZE: $size"
    }

    init {
        println("SKU ID: $sku")
        println("MARK: $mark")
    }

    // Atributos
    var size: Int = 34
        set(value) {
            if (value >= 34)
                field = value
            else
                field = 34
        }

    var color: String = "White"

    var model: String = "Boots"
        set(value) {
            if (value.equals("Tennis"))
                field = "Boots"
            else
                field = value
        }
}