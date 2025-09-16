package flowControl.whileLoop

fun main() {
    // Exercise 1

    var counter = 0

    while (counter < 10) {
        counter++
        println("$counter) Hello!")
    }

    println()

    // Exercise 2

    val cats = listOf("Tigger", "Smokey", "Sassy", "Patch", "Sammy")
    var counter2 = 0

    while (counter2 < cats.size) {
        println("Hello, ${cats[counter2]}")
        counter2++
    }

    println()

    // Exercise 3

    println("Enter an integer: ")
    var number = (readln() ?: "").toInt()
    var factorial = 1L

    while (number > 0) {
        factorial *= number--
    }

    println("Factorial is $factorial")

    println()

    // Exercise 4

    println("Enter a large integer: ")
    var number2 = (readln() ?: "").toInt()

    while (number2 > 0) {
        if (number2 % 7 == 0) println(number2)
        number2--
    }
}
