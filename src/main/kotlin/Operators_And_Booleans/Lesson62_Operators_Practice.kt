package org.example.Operators_And_Booleans

fun main(args: Array<String>){
    val a = 76.254
    val b = 3.867

    println("$a + $b = ${a + b}")
    println("$a - $b = ${a - b}")
    println("$a * $b = ${a * b}")
    println("$a / $b = ${a / b}")
    println("$a % $b = ${a % b}")

    println()

    val kg = 1f/3f
    val price = 29.99
    println("The person needs ${kg * price}$")

    println()

    println("Сколько денег у тебя?")
    val userMoney = (readLine()?:"0").toDouble()
    println("You balance is $userMoney$")
    println("We've tripled it. Now you have ${userMoney * 3}$ on your balance")
}