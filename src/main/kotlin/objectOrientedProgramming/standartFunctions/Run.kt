package objectOrientedProgramming.standartFunctions

fun main() {
    val car = NewCar().run {
        speed = 70
        drive()
        println("New car is driving")
        this
    }

    println(car)

    run {
        val car = NewCar()
        car.speed = 345
        car.drive()
        println("Another new car is driving too")
    }
}

class NewCar {
    var speed = 10

    fun drive() {
        println("Car is driving at $speed")
    }
}
