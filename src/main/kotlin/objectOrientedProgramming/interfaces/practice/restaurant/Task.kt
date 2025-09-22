package objectOrientedProgramming.interfaces.practice.restaurant

fun main() {
    val rest1: Restaurant = LocalRestaurant()
    rest1.provideFood()
    rest1.provideBill()

    val rest2: Restaurant = FancyRestaurant()
    rest2.provideFood()
    rest2.provideBill()
}
