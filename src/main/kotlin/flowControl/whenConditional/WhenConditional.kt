package flowControl.whenConditional

fun main() {
    val action: String
    println("Enter an animal: ")
    val animal = readln() ?: ""

    when (animal) {
        "cat" -> action = "pet it"
        "dog" -> action = "feed it"
        else -> action = "google it"
    }

    println(action)

    println("Enter a number: ")

    val number = (readln() ?: "0").toInt()
    when (number % 2) {
        0 -> println("$number - even")
        1 -> println("$number - odd")
    }

    val animal2 = "cat"
    val action2 = when (animal2) {
        "cat" -> "feed it"
        "dog" -> "pet it"
        else -> "google it"
    }
    println(action2)

    val month = "May"
    val days = when (month) {
        "January", "March", "May" -> 31
        "February" -> 28
        else -> 30
    }

    println("$month has $days days")
}
