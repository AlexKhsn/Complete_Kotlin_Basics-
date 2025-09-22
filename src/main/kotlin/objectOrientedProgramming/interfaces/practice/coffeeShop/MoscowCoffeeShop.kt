package objectOrientedProgramming.interfaces.practice.coffeeShop

class MoscowCoffeeShop(americanoPrice: Double, cappuccinoPrice: Double, lattePrice: Double) :
    CoffeeShop(americanoPrice, cappuccinoPrice, lattePrice) {
    override fun makeAmericano() {
        americanoCount++
        println("Thanks for order Americano in Moscow coffee shop")
    }

    override fun makeCappuccino() {
        cappuccinoCount++
        println("Thanks for order Cappuccino in Moscow coffee shop")
    }

    override fun makeLatte() {
        latteCount++
        println("Thanks for order Latte in Moscow coffee shop")
    }
}
