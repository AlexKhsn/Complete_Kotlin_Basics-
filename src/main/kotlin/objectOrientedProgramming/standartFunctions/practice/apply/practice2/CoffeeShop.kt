package objectOrientedProgramming.standartFunctions.practice.apply.practice2

class CoffeeShop {
    fun sellCoffee(name: String) {
        Cup().apply {
            clientName = name
            prepare()
            println("Coffee for $clientName is ready")
            println(this)
        }
    }
}
