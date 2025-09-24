package objectOrientedProgramming.standartFunctions

fun main() {
    val car = Car2().apply {
        speed = 50
        color = "Black"
        startCar()
    }

    val car2 = Car2().run {
        this
    }

    println(car)
    println(car2)
}

class Car2 {
    var speed = 0
    var color = ""

    fun startCar() {
        println("Starting the car. Speed is $speed, color is $color")
    }
}
