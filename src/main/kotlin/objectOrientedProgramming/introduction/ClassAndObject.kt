package objectOrientedProgramming.introduction

fun main() {
    val myGarage = Garage()
    myGarage.car.drive()
    println(myGarage.car)
}

class MyCar {
    fun drive() {
        println("Driving a car")
    }
}

class Garage {
    val car = MyCar()
}
