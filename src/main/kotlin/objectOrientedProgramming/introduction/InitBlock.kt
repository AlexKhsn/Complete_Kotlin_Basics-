package objectOrientedProgramming.introduction

fun main() {
    val car = OneCar()
}

class OneCar {
    var model = "no model"
    var speed = 100

    init {
        println("Model - $model, Speed - $speed")
    }
}
