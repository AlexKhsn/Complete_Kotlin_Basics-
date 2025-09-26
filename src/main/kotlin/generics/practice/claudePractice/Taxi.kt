package generics.practice.claudePractice

class Taxi(model: String, speed: Int) : Vehicle(model, speed), PassengerCarrier {
    override fun drive() {
        println("Такси $model едет со скоростью $speed км/ч")
    }

    override fun carryPassengers(count: Int) {
        println("Такси $model везет $count пассажира(ов)")
    }
}
