package org.example.User_input


// User Input

/*
fun main(Args : Array<String>) {
    println("Enter your name: ")
    val userNameInput = readLine()
    println("Your name is: $userNameInput")
}
 */


//  Input a number

fun main(Args : Array<String>) {
    println("Введи число")
    val userInput = readLine()?:""
    println("Double number: ${userInput.toInt() * 2}")
}