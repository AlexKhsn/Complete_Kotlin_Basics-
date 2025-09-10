package org.example.Numbers_And_Variable_Types

fun main(args: Array<String>) {
    println("Give a number of type Double: ")
    val userDoubleNumber = (readLine()?:"0").toDouble()
    val pi = 3.14159
    val result = userDoubleNumber * pi

    println(result)
    println(result::class.java)
}