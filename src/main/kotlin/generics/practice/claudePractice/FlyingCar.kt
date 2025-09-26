package generics.practice.claudePractice

class FlyingCar(model: String, speed: Int) : Vehicle(model, speed), Flyable {
    override fun drive() {
        println("Летающий $model едет со скоростью $speed км/ч")
    }

    override fun fly() {
        println("Летающий $model летит со скоростью $speed км/ч")
    }
}
