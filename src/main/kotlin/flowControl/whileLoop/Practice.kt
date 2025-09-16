package flowControl.whileLoop

fun main() {
    // Exercise 1
    var isFinished = false

    do {
        println("Enter a number larger than 100: ")
        val number = (readln() ?: "0").toInt()
        if (number > 100) {
            println("Finally")
            isFinished = true
        } else {
            println("$number is not larger than 100. Try again")
        }
    } while (!isFinished)

    println()

    // Exercise 2

    var isFinished2 = false

    while (!isFinished2) {
        println("Enter a number: ")
        val number = (readln() ?: "0").toInt()
        var counter = 1
        var factorial = 1L

        while (counter <= number) {
            factorial *= counter
            counter++
        }

        if (factorial > 3_000_000) {
            isFinished2 = true
            println("Factorial $number is more than 3000000: $factorial")
        } else {
            println("Try again... Factorial $number is $factorial")
        }
    }

    // Exercise 3

    val userNames = mutableSetOf("john", "bob", "alice")
    var isTaken = true

    do {
        println("Enter your user name: ")
        val userName = readln() ?: ""

        if (userName !in userNames) {
            println("Have a good day, $userName!")
            isTaken = false
            userNames.add(userName)
        } else {
            println("Name '$userName' is not available. Please try again")
        }
    } while (isTaken)

    println(userNames)
}
