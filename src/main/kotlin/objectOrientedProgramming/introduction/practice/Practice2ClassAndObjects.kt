package objectOrientedProgramming.introduction.practice

fun main() {
    //  Exercise 1

    val laptop = Laptop()
    val apple = Apple()
    apple.screenSize = 10

    laptop.run()
    apple.run()

    apple.name = "Macbook"
    apple.run()

    println()
}

open class Laptop {
    var screenSize = 15
    var speed = 1200
    var name = "Generic name"

    fun run() {
        println("Run laptop $name with screen size $screenSize and speed $speed")
    }
}

class Apple : Laptop()
