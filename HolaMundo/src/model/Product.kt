package model

abstract class Product(var name: String, var description: String, var sku: Int) {

    // Métodos
    abstract fun create(): String

    abstract fun read(): String

    abstract fun update(): String

    abstract fun delete(): String

    override fun toString(): String {
        return "Name: $name\nDescription: $description\nSKU: $sku"
    }
}