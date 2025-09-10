package org.example.Operators_And_Booleans

import kotlin.math.pow

fun main(args: Array<String>){
    println("How much money do you have?")
    val balance = (readLine()?:"0").toDouble()
    val result = balance * 1.055.pow(5)
    println("After 5 years user will have $result$")
}