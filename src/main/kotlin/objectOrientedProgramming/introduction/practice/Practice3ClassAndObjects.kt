package objectOrientedProgramming.introduction.practice

fun main() {
    val boeingPlane = Boeing()
    val airbusPlane = Airbus()

    boeingPlane.name = "Boeing"
    airbusPlane.name = "Airbus"

    boeingPlane.speed = 300
    airbusPlane.speed = 400

    boeingPlane.ascend()
    boeingPlane.ascend()

    airbusPlane.ascend()

    boeingPlane.descend()
    airbusPlane.descend()
}

open class Airplane {
    var speed = 0
    var altitude = 0
    var name = "plane"

    fun ascend() {
        altitude++
        println("$name's altitude increased: $altitude. Speed: $speed")
    }

    fun descend() {
        altitude--
        println("$name's altitude decreased: $altitude. Speed: $speed")
    }
}

class Boeing : Airplane()

class Airbus : Airplane()
