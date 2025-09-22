package objectOrientedProgramming.principlesOfOOP.inheritance.practice.practiceTransport

class Car : Vehicle() {
    override val brand = "BMW"
    override val maxSpeed = 200

    override fun displayInfo() {
        println("Автомобиль $brand с максимальной скоростью $maxSpeed км/ч")
        super.displayInfo()
    }
}
