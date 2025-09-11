package nullability

fun main(Args: Array<String>) {
    println("Введи число: ")
    val userNumber = readLine()?.toDouble()
    val multipliedNumber = userNumber?.times(7)
    println(multipliedNumber?.toString()?.length)
}
