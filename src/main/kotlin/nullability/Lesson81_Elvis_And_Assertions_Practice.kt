package nullability

fun main(Args: Array<String>) {
//    println("Введи имя: ")
//    val name = readLine()
//    println("Hello, ${name?:"user"}!")

    println()

    println("Введи число: ")
    val number = readLine()?.toInt()
    println("$number * 5 = ${number!! * 5}")
}
