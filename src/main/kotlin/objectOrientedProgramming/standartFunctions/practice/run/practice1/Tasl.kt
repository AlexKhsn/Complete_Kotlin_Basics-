package objectOrientedProgramming.standartFunctions.practice.run.practice1

fun main() {
    val myRestaurant = Restaurant().run {
        standart = "potatoe"
        special = "fish"

        printMenu()
        this
    }

    run {
        val myRestaurant = Restaurant()
        myRestaurant.standart = "water"
        myRestaurant.special = "soup"
        myRestaurant.printMenu()
    }
}
