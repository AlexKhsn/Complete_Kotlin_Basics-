package flowControl.whenConditional

fun main() {
    // Exercise 1

    println("How many times do you eat?")
    val userInp = (readln() ?: "0").toInt()
    val result = when (userInp) {
        in 0..2 -> "eat more"
        3 -> "excellent"
        else -> "Eat less"
    }
    println(result)

    // Exercise 2

    println("What time is it now?")
    val currentTime = (readln() ?: "0").toInt()
    val dayTime = when (currentTime) {
        in 6..11 -> "morning"
        in 12..14 -> "noon"
        in 15..17 -> "afternoon"
        in 18..21 -> "evening"
        else -> "night"
    }
    println("It's $dayTime now")

    // Exercise 3

    println("Enter your name: ")
    val userName = readln() ?: ""
    val greeting = when (userName[0].lowercase()) {
        "a", "b", "c" -> "Hello"
        in "d".."f" -> "Hi"
        else -> "Welcome"
    }

    println("$greeting, $userName!")
}
