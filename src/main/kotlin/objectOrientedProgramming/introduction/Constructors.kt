package objectOrientedProgramming.introduction

fun main() {
    val myCar = CarCreator()
    val yourCar = CarCreator("BMW")
    val hisCar = CarCreator("Fiat", 300)
}

class CarCreator {
    constructor() {
        model = "No model"
        topSpeed = 150
    }

    constructor(newModel: String) {
        model = newModel
        topSpeed = 150
    }

    constructor(newModel: String, newTopSpeed: Int) {
        model = newModel
        topSpeed = newTopSpeed
    }

    var model: String? = null
    var topSpeed = 100
}

/**
 * Если в классе только 1 конструктор, исползуются параметры в скобках при объявлении и
 * создании экземпляра
 *
 * Если же в классе несколько конструкторов, то необходимо писать конструторы внутри класса
 */
