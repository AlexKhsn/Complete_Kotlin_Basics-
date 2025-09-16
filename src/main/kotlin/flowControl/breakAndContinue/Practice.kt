package flowControl.breakAndContinue

fun main() {
    // Exercise 1

    val shelter = mutableListOf<String>()

    for (i in 1..5) {
        println("Enter an animal you want to bring: ")
        val animal = readln() ?: ""

        if (animal == "snake") {
            println("It's forbidden to bring a snake!")
            break
        }
        println("$animal was added")
        shelter.add(animal)
    }

    println(shelter)

    println()

    // Exercise 2

    val clients = listOf("Anna", "Bob", "Carol", "David")
    for (client in clients) {
        if (client[0].lowercase() == "c") continue
        println("Hello, $client! Nice to see you")
    }

    println()

    // Exercise 3

    val visitors = listOf("Alex", "Anna", "Dima", "John")

    for (visitor in visitors) {
        println("What is $visitor's age?")
        val input = readln() ?: ""
        if (input == "stop") break
        val age = input.toInt()

        if (age < 18) {
            println("Age is lower 18. $visitor is not allowed to enter!")
            continue
        }

        println("Welcome, $visitor!")
    }

    while (true) {
        println("Enter your age: ")
        val input = readln() ?: ""
        if (input == "stop") break
        val age = input.toInt()

        if (age < 18) {
            println("Age is less than 18. Visitor is not allowed to enter!")
            continue
        }

        println("Welcome!")
    }
}
