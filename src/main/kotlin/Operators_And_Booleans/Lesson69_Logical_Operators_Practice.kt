package org.example.Operators_And_Booleans

fun main(args: Array<String>){
    val animals = 3
    val members = 3
    val producing = true
    val funding = (animals <= 5 && producing) || members >= 3

    if(funding) {
        println("A farmer will get the funding")
    } else {
        println("A farmer will not get the funding")
    }
}