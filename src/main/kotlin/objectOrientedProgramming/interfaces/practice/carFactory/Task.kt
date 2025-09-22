package objectOrientedProgramming.interfaces.practice.carFactory

fun main() {
    val factory = CarFactory()
    val myCar: Car = factory.provideCar()
    myCar.speed = 89
    myCar.drive()
    myCar.park()
}
