package objectOrientedProgramming.interfaces.practice.coffeeShop

class NewYorkCoffeeShop(americanoPrice: Double, cappuccinoPrice: Double, lattePrice: Double) :
    CoffeeShop(americanoPrice, cappuccinoPrice, lattePrice) {
    override fun makeAmericano() {
        americanoCount++
        println("Thanks for order Americano in New York coffee shop")
    }

    override fun makeCappuccino() {
        cappuccinoCount++
        println("Thanks for order Cappuccino in New York coffee shop")
    }

    override fun makeLatte() {
        latteCount++
        println("Thanks for order Latte in New York coffee shop")
    }
}
