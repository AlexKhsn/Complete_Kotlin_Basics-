package generics.practice.claudePractice

class Boat(model: String, speed: Int) : Vehicle(model, speed), PassengerCarrier {
    fun swim() {
        println("Лодка $model плывет со скоростью $speed км/ч")
    }

    override fun carryPassengers(count: Int) {
        println("Лодка везет $count пассажиров")
    }
}
