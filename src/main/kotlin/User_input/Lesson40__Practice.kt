package org.example.User_input

fun main(args: Array<String>) {
    val currentYear: Int = 2025
    println("What's your birth year?")
    val birthYear = readLine()?:""
    val userAge = currentYear - birthYear.toInt()
    println("Your age is $userAge")
}