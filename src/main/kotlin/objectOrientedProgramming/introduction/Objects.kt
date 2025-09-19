package objectOrientedProgramming.introduction

fun main() {
    val myCar: Car = Car()
    val yourCar = Car()

    myCar.model = "BMW"
    yourCar.model = "TOYOTA"

    myCar.start()
    myCar.drive(50)

    println()

    yourCar.start()
    yourCar.drive(70)
}
