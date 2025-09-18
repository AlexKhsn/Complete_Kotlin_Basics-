package functions.lambdaFunctions
import kotlin.random.Random

fun main() {
    // Exercise 1

    val integers = mutableSetOf<Int>()
    for (i in 1..10) {
        integers.add(Random.nextInt(30))
    }
    println(integers)
    val doubleDigit = integers.filter { it in 10..99 }
    println(doubleDigit)

    println()

    // Exercise 2

    val clients = listOf("Bob", "Alex", "Steve", "Naomi", "Kate", "Alexis", "Castiel", "Dolboeb")
    println(clients.sortedBy { it.last() })

    // Exercise 3

    val threeDigitIntegers = mutableListOf<Int>()
    for (i in 1..10) {
        threeDigitIntegers.add(Random.nextInt(100, 1000))
    }
    println(threeDigitIntegers)
    println(threeDigitIntegers.maxBy { it / 10 % 10 })

    println()

    // Exercise 4

    val randomIntegers = mutableSetOf<Int>()
    for (i in 1..10) {
        randomIntegers.add(Random.nextInt(50))
    }
    println(randomIntegers)

    println(
        randomIntegers.map {
            if (it % 2 != 0) it * 2 else it / 2
        }.filter { it > 25 },
    )
}
