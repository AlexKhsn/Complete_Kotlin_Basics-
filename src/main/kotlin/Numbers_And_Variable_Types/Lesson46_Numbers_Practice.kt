package org.example.Numbers_And_Variable_Types

fun main(Args : Array<String>) {

    // Integer number

    val num1 = 1
    println(num1)
    println(num1::class.java)

    // Long number

    val num2 = 2L
    println(num2)
    println(num2::class.java)

    //  Double number

    val num3 = 324.54
    println(num3)
    println(num3::class.java)

    println("Введи число: ")
    val number = 123.43
    val userNumber = (readLine()?:"").toInt()
    val result = number * userNumber
    println("$number * $userNumber = $result")
    println("type of $result is ${result::class.java}")
}