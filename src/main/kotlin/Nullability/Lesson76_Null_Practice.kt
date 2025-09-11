package org.example.Nullability

fun main(args: Array<String>) {
    val name: String? = "Alexander"
    println(name?.substring(3, 6))

    var number: Double? = 12.4
    number = number?.times(6)
    println(number?.toFloat())


    println("Введи имя: ")
    val userName = readLine()
    println("Длинна введенного имени: ${userName?.length}")
}