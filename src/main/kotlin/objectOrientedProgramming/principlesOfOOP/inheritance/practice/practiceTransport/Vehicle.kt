package objectOrientedProgramming.principlesOfOOP.inheritance.practice.practiceTransport

open class Vehicle {
    open val brand = "автомобиль"
    open val maxSpeed = 150

    open fun displayInfo() {
        println("Транспорт $brand с максимальной скоростью $maxSpeed км/ч")
    }
}
