package objectOrientedProgramming.principlesOfOOP.polymorphism.practice.coffee

fun main() {
    val coffeeShop = CoffeeShop()
    var myCoffee: Coffee? = null

    for (i in 1..5) {
        myCoffee = coffeeShop.makeCoffee()
        myCoffee.wakeUp()
        myCoffee.quenchThirst()
    }
}
