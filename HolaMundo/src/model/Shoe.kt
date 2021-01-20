package model

class Shoe {
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