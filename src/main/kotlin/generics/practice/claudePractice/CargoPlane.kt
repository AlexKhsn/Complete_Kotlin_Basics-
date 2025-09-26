package generics.practice.claudePractice

class CargoPlane(model: String, speed: Int) : Vehicle(model, speed), Flyable, CargoCarrier {
    override fun fly() {
        println("Грузовой самолет $model летит со скоростью $speed км/ч")
    }

    override fun carryCargo(weight: Int) {
        println("Грузовой самолет везет $weight тонн груза")
    }
}
