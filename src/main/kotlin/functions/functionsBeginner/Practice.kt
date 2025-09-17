package functions.functionsBeginner

fun main() {
    // Exercise 1

    for (i in 1..10) {
        sayHello()
    }

    println()

    // Exercise 2

    for (i in 1..3) getNumberAndMult()

    println()

    // Exercise 3

    for (i in 1..3) calculateAge()

    println()

    // Exercise 4

    for (i in 1..3) {
        val result = sumOfNumbers(5, 5)
        println(result)
    }

    println()

    // Exercise 5

    val products = mutableMapOf(
        "shoes" to 29.99,
        "socks" to 5.99,
        "jeans" to 39.99,
    )

    for (product in products.keys) {
        val newPrice = newPrice(products[product])
        println("$product's price with 20% tax: $newPrice$")
    }

    println()

    // Exercise 6

    println("Enter an animal: ")
    val animal = readln() ?: ""
    println("$animal's lifespan is ${showLifespan(animal)} years")
}

fun sayHello() {
    println("Hello")
}

fun getNumberAndMult() {
    println("Enter a number: ")
    val number = (readln() ?: "0").toInt()
    println("$number * 17 = ${number * 17}")
}

fun calculateAge() {
    println("What's your name?")
    val name = readln() ?: ""
    println("What's your birth year?")
    val year = (readln() ?: "0").toInt()
    println("$name is ${2025 - year} years old")
}

fun sumOfNumbers(num1: Int = 0, num2: Int = 0) = num1 + num2

fun newPrice(price: Double? = 0.0) = price?.times(1.2)

fun showLifespan(animal: String): Int {
    return when (animal) {
        "cat" -> 15
        "dog" -> 10
        "rabbit" -> 12
        else -> 20
    }
}
