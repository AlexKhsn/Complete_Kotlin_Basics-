package flowControl.expressions

fun main() {
    println("cat" in listOf("cat", "dog", "parrot"))
    println(3 in setOf(2, 56, 2, 1, 67, 7))
    println(5 in 1..10)
    println(15 in 1..10)

    val favAnimal = "dog"
    val animals = listOf("dog", "cat", "parrot")

    if (favAnimal in animals) println("We have your best friend") else println("Sorry, $favAnimal is not available")

    val availableCoffee = listOf("americano", "capuccino")
    println("Enter your fav coffee: ")
    val favCoffee = readln() ?: ""

    if (favCoffee !in availableCoffee) {
        println("Sorry, we don't have $favCoffee")
    } else {
        println("We have $favCoffee")
    }

    println("Enter a number: ")
    val number = (readln() ?: "").toInt()

    if (number !in 1..9) {
        println("Your number is not a single digit")
    } else {
        println("Your number is a single digit")
    }
}
