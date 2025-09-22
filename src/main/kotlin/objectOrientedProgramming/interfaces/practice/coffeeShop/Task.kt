package objectOrientedProgramming.interfaces.practice.coffeeShop

import kotlin.system.exitProcess

fun main() {
    val moscowCoffeeShop = MoscowCoffeeShop(3.0, 4.5, 5.0)
    val newYorkCoffeeShop = MoscowCoffeeShop(5.0, 7.5, 8.0)
    var currentCoffeeShop: CoffeeShop

    println("Choose a city: ")
    println("1) Moscow\n2)New York")

    currentCoffeeShop = when (readln()) {
        "1" -> moscowCoffeeShop
        "2" -> newYorkCoffeeShop
        else -> {
            println("Error")
            exitProcess(1)
        }
    }

    println("Choose a drink:")
    println("1) Americano\n2) Cappuccino\n3) Latte")

    when (readln()) {
        "1" -> currentCoffeeShop.makeAmericano()
        "2" -> currentCoffeeShop.makeCappuccino()
        "3" -> currentCoffeeShop.makeLatte()
        else -> {
            println("Error")
            exitProcess(1)
        }
    }
}
