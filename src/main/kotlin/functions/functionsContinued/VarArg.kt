package functions.functionsContinued

fun main() {
    //  Exercise 1

    sayHello("Alex", "Mary", "John")

    println()

    //  Exercise 2

    println(calculateSum(1, 5, 23, 89))
    println(calculateSum(7, 2, 22, 6))
    println(calculateSum(1, 5, 3, 8))

    println()

    //  Exercise 3

    greetClients(3, "Alex", "Bob", "Meg", "John")
}

fun sayHello(vararg names: String) {
    for (name in names) {
        println("Hello, $name!")
    }
}

fun calculateSum(vararg numbers: Int): Int {
    var sum = 0
    for (number in numbers) {
        sum += number
    }

    return sum
}

fun greetClients(count: Int, vararg clients: String) {
    for (client in clients) {
        for (i in 1..count) {
            print("Hello, $client!\t")
        }
        println()
    }
}
