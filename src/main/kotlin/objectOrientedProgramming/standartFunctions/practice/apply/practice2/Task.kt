package objectOrientedProgramming.standartFunctions.practice.apply.practice2

fun main() {
    println("Как вас зовут?")
    val name = readln() ?: ""

    CoffeeShop().sellCoffee(name)
}
