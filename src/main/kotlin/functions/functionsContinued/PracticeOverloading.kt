package functions.functionsContinued

fun main() {
    //  Exercise 1

    feed("Dog")
    feed(setOf("Parrot", "Cat", "Crocodile"))

    println()

    //  Exercise 2

    sizeOf("Hello! It's me!")
    println(sizeOf(5))

    println()

    // Exercise 3

    showPrice("Phone", 123.0)
    showPrice(
        mapOf(
            "tablet" to 123.0,
            "laptop" to 453.0,
            "mouse" to 25.0,
            "keyboard" to 10.0,
        ),
    )
}

fun feed(animal: String) = println("Feed $animal!")

fun feed(animals: Collection<String>) {
    for (animal in animals) feed(animal)
}

fun sizeOf(message: String) = println(message.length)

fun sizeOf(number: Int): String {
    var result = ""
    for (i in 0..number - 1) result += 'a'
    return result
}

fun showPrice(name: String, price: Double?) {
    val newPrice = price?.times(1.2)
    println("$name costs $newPrice$")
}

fun showPrice(products: Map<String, Double>) {
    for (product in products.keys) {
        showPrice(product, products[product])
    }
}
