package generics.practice.claudePractice

fun main() {
    val bmw = Car("Bmw", 200)
    bmw.drive()
    bmw.accelerate()
    bmw.drive()

    println()

    val flyingGeely = FlyingCar("Geely", 350)
    flyingGeely.drive()
    flyingGeely.fly()
    flyingGeely.accelerate()
    flyingGeely.fly()

    println()

    val boat = Boat("Mercedes", 140)
    boat.swim()
    boat.accelerate()
    boat.swim()

    println()

    val volvoTruck = Truck("Volvo", 150)
    volvoTruck.drive()
    volvoTruck.accelerate()
    volvoTruck.drive()

    println()

    val flyingVehicles = mutableListOf<Flyable>(
        FlyingCar("Tesla", 200),
        FlyingCar("Xiaomi", 543),
        flyingGeely,
        FlyingCar("Zeekr", 654),
    )

    makeAllFly(flyingVehicles)

    println()

    val boeingHelicopter = Helicopter("Boeing", 543)
    flyingVehicles.add(boeingHelicopter)

    makeAllFly(flyingVehicles)

    println()

    val taxiZeekr = Taxi("Zeekr", 138)
    val cargoPlaneAirbus = CargoPlane("Airbus", 654)

    boat.swim()
    boat.carryPassengers(5)
    volvoTruck.carryCargo(34)
    volvoTruck.carryPassengers(234)
    cargoPlaneAirbus.fly()
    cargoPlaneAirbus.carryCargo(324)
    taxiZeekr.carryPassengers(3)

    println()

    val cargoVehicles = listOf(
        volvoTruck,
        cargoPlaneAirbus,
    )

    val passengerVehicles = listOf(
        boat,
        volvoTruck,
        boat,
        taxiZeekr,
    )

    moveAllCargo(cargoVehicles)
    moveAllPassengers(passengerVehicles)
}

fun makeAllFly(vehicles: List<Flyable>) {
    vehicles.forEach { it.fly() }
}

fun moveAllCargo(cargoVehicles: List<CargoCarrier>) {
    cargoVehicles.forEach { it.carryCargo(100) }
}

fun moveAllPassengers(passengersVehicles: List<PassengerCarrier>) {
    passengersVehicles.forEach { it.carryPassengers(5) }
}
