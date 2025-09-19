package objectOrientedProgramming.introduction

fun main() {
    val car = newCar()
    println("Car name is - '${car.name}'")
    println("Car speed is - '${car.speed}'")

    println()

    car.speed = 100
    println("Now car name is - '${car.name}'")
    println("Now car speed is - ${car.speed}")
}

class newCar {
    var name = ""
    var speed: Int = 59
        get() = field
        set(value) {
            name = "High speed car $value"
            field = value
        }
}
