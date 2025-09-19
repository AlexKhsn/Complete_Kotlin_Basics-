package objectOrientedProgramming.principlesOfOOP.practice

fun main() {
    val bird = Bird("parrot", "green", 15)
    val parakeet = Parakeet("parakeet", "yellow", 25)

    bird.fly()
    parakeet.fly()
}

open class Bird {
    var name = ""
    var color = ""
    var flySpeed = 0

    constructor(name: String, color: String, flySpeed: Int) {
        this.name = name
        this.color = color
        this.flySpeed = flySpeed
    }

    fun fly() {
        println("A $color $name's fly speed is $flySpeed km/h")
    }
}

class Parakeet(name: String, color: String, flySpeed: Int) : Bird(name, color, flySpeed)
