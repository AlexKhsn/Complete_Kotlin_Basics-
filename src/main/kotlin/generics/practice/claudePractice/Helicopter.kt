package generics.practice.claudePractice

class Helicopter(model: String, speed: Int) : Vehicle(model, speed), Flyable {
    override fun fly() {
        println("Вертолет $model летит со скоростью $speed км/ч")
    }
}
