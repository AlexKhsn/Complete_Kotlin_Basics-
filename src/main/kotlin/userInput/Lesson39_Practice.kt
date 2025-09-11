package userInput

fun main(args: Array<String>) {
    println("What's your name?")
    val userName = readLine()
    println("Hi, $userName! Nice to see you!")

    println("What's your number?")
    val userNumber = readLine() ?: ""
    val result = userNumber.toInt() * 5
    println("$userNumber * 5 = $result")
}
