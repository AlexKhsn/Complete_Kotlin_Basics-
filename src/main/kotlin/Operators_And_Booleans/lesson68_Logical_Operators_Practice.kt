package org.example.Operators_And_Booleans

fun main(args : Array<String>) {
    val a = 5.374 * 9.5847
    val b = 3.237 * 15.3726
    println(a > b)

    println()

    println(((true && false) || (true || false)))

    println()

    println(!((3 >= 3) && (false || (2 < 5))))

    println()

    val toys = 2
    val broken = 1
    println((toys < 5) && ((toys - broken) >= 1))
}