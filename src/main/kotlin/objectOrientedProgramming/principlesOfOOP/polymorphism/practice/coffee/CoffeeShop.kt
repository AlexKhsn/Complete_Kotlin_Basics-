package objectOrientedProgramming.principlesOfOOP.polymorphism.practice.coffee

class CoffeeShop {
    fun makeCoffee(): Coffee {
        val randomNumber = System.currentTimeMillis()
        if (randomNumber %2 == 0L) {
            return Arabica()
        } else {
            return Robusta()
        }
    }
}
