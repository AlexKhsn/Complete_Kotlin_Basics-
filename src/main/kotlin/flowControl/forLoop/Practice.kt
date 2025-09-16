package flowControl.forLoop

fun main() {
    // Exercise 1

    for (i in 1..10) {
        println("$i) Hello!")
    }

    println()

    // Exercise 2

    var sum = 0

    for (i in 1..100) {
        sum += i
    }

    println("Sum is - $sum")

    println()

    // Exercise 3

    val customers = mutableMapOf(
        "Alice" to 4,
        "Judy" to 8,
        "Anna" to 6,
    )

    for ((name, number) in customers) {
        println("$name made $number purchases")
    }

    for (name in customers.keys) {
        println("$name made ${customers[name]} purchases")
    }

    println()

    // Exercise 4

    val word = "Something"
    for (letter in word) {
        println(letter)
    }

    println()

    // Exercise 5

    val namesSet = setOf("Alex", "Olya", "Dima")
    for (name in namesSet) {
        println(name)
    }

    println()

    // Exercise 6

    println("Enter a year")
    val year = (readln() ?: "").toInt()

    for (i in 1..12) {
        val message = when (i) {
            1 -> "January has 31 days"
            2 -> if (year % 4 == 0) "February has 29 days" else "February has 28 days"
            3 -> "March has 31 days"
            4 -> "April has 30 days"
            5 -> "May has 31 days"
            6 -> "June has 30 days"
            7 -> "July has 31 days"
            8 -> "August has 30 days"
            9 -> "September has 30 days"
            10 -> "October has 31 days"
            11 -> "November has 30 days"
            12 -> "December has 31 days"
            else -> ""
        }

        println(message)
    }

    println()

    // Exercise 7

    println("Enter a number: ")
    val maxValue = (readln() ?: "").toInt()

    for (i in maxValue downTo 0) {
        if (i % 7 == 0) println(i)
    }

    println()

    // Exercise 8

    val toCopy = "\uD83D\uDE0A"
    var result: String = ""
    for (i in 1..10) {
        result += toCopy
        println(result)
    }

    for (i in 1..10) {
        for (j in 1..i) {
            print("\uD83D\uDE0A")
        }
        println()
    }

    println()

    // Exercise 9

    println("Enter a number: ")
    val number = (readln() ?: "").toInt()

    for (i in 1..number) {
        for (j in 1..number) {
            when (i * j % 3) {
                0 -> print("\uD83D\uDE00")
                1 -> print("\uD83E\uDD28")
                2 -> print("\uD83D\uDE31")
            }
        }
        println()
    }
}
