package functions.lambdaFunctions

fun main() {
    val clients = listOf("Alex", "Bob", "Steve", "Anna", "Castiel")

    // forEach

    clients.forEach { name -> println("Hello, $name!") }
    clients.forEach { println("Hello, $it! (With 'it')") }

    println()

    // filter

    clients.filter { it.length < 5 }
        .forEach { println("$it's name less than 5 chars") }

    // map

    val sizes = clients.map { it.length }
    println(sizes)

    println()

    // sortedBy

    val sorted = clients.sortedBy { it.length }
    println(sorted)

    println()

    val sortedByDescending = clients.sortedByDescending { it.length }
    println(sortedByDescending)

    println()

    val sortedByAlphabet = clients.sorted()
    println(sortedByAlphabet)

    println()

    val sortedByAlphabetDescending = clients.sortedDescending()
    println(sortedByAlphabetDescending)

    println()

    // maxBy

    val maxByLength = clients.maxBy { it.length }
    println(maxByLength)

    val maxByAlphabet = clients.max()
    println(maxByAlphabet)

    println()

    // minBy

    val minByLength = clients.minBy { it.length }
    println(minByLength)

    println()
}
