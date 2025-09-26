package generics.practice.claudePractice

class Truck(model: String, speed: Int) : Vehicle(model, speed), CargoCarrier, PassengerCarrier {
    override fun drive() {
        println("Грузовик $model едет со скоростью $speed км/ч")
    }

    fun loadCargo(weight: Int) {
        println("В грузовик загрузили $weight тонн груза")
    }

    override fun carryPassengers(count: Int) {
        println("Грузовик везет $count пассажиров")
    }

    override fun carryCargo(weight: Int) {
        println("Грузовик везет $weight тонн груза")
    }
}
