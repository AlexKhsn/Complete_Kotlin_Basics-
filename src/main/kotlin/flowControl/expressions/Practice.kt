package flowControl.expressions

fun main() {
    // Exercise 1

    val guestList = setOf("Alex", "Dima", "Kate", "Victoria", "Tatyana")
    println("What's your name?")
    val name = readln() ?: ""

    if (name in guestList) println("You can enter") else println("Sorry, you can't enter")

    // Exercise 2

    println("How many cats do you have?")
    val catsNumber = (readln() ?: "").toInt()

    if (catsNumber == 0)
        println("no cats")
    else if (catsNumber in 1..3)
        println("few cats")
    else if (catsNumber in 4..6)
        println("several cats")
    else
        println("many catsR")

    // Exercise 3

    val animals = mutableListOf<String>()

    if (!animals.isEmpty()) println("We have $animals to adopt")
    else println("Thank you! All the animals are adopted")

    // Exercise 4

    println("What's your age?")
    var age = (readln() ?: "0").toInt()
    if (age == 0) age = 1
    val textAge = if (age in 1..12) "child"
    else if (age in 13..17) "teen"
    else "adult"

    println("Age $age means you are $textAge")
}
