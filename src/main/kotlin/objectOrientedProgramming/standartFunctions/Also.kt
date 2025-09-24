package objectOrientedProgramming.standartFunctions

fun main() {
    val car = Car3().apply {
        speed = 50
        run()
        println("Car is running")
    }
        .also {
            println("The car has been started")
            println("Car info: speed = ${it.speed}")
        }
}

class Car3 {
    var speed = 0

    fun run() {
        println("Car is running at $speed")
    }
}
