package model

class Shoe(sku: Int, var brand: String, name: String, description: String): Product(name, description, sku), ICrudActions {
    override fun create(): String {
        return "Create shoe"
    }

    override fun read(): String {
        return "Read shoe"
    }

    override fun update(): String {
        return "Update shoe"
    }

    override fun delete(): String {
        return "Delete shoe"
    }

    override fun toString(): String {
        return super.toString() + "SKU ID: $sku\nBRAND: $brand\nMODEL: $model\nCOLOR: $color\nSIZE: $size"
    }

    init {
        println("SKU ID: $sku")
        println("BRAND: $brand")
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