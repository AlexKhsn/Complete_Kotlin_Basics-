package objectOrientedProgramming.introduction

fun main() {
}

class Car {
    var model: String? = null
    var topSpeed = 100

    fun start() {
        println("Starting the $model")
    }

    fun drive(speed: Int) {
        println("Driving at a speed $speed")
    }
}
