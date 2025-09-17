package functions.lambdaFunctions

fun main() {
    //  Exercise 1

    val numbers = mutableListOf(3, 23, 43, 12, 64, 14)
    println(numbers)
    val newNumbers = update(numbers) { num: Int -> num / 10 }
    println(newNumbers)

    //  Exercise 2

    val clients = mutableListOf("Alex", "Bob", "John", "Tim")
    println(clients)
    val messages = personalized(clients) { name: String -> "Hello, $name. How are you?" }
    println(messages)

    //  Exercise 3

    val numbers2 = listOf(5, 12, 8, 20, 3, 15)
    val words = listOf("hello", "world", "kotlin", "lambda", "function")

    val square = { num: Int -> num * num }
    val isPositive = { num: Int -> num > 0 }
    val getLength = { word: String -> word.length }
    val makeUppercase = { word: String -> word.uppercase() }

    println(square(numbers2[0]))
    println(isPositive(numbers2[1]))
    println(getLength(words[0]))
    println(makeUppercase(words[1]))

    println(numbers2.filter { num: Int -> num > 10 })
    println(words.map { word: String -> word.uppercase() })

    //  Exercise 4

    println()

    val prices = listOf(25.50, 100.00, 15.75, 200.00, 50.25)
    val products = listOf("mouse", "laptop", "cable", "monitor", "keyboard")
    val testNumbers = listOf(1, 2, 3, 4, 5)

    prices.forEach { price: Double -> println("$price$") }
    println("Есть ли товары дороже 150$: ${prices.any{price: Double -> price > 150.0}}")
    println("Кол-во товаров дешевле 50$: ${prices.count{price: Double -> price < 50.0}}")

    println(testNumbers)
    println(applyToNumbers(testNumbers) { number: Int -> number * 3 })
    println(applyToNumbers(testNumbers) { number: Int -> number + 10 })
}

//  Exercice 1 Function

fun update(numbers: MutableList<Int>, divide: (Int) -> Int): MutableList<Int> {
    for (i in 0..numbers.size - 1) {
        if (numbers[i] % 2 == 0) numbers[i] = divide(numbers[i])
    }

    return numbers
}

//  Exercise 2 Function

fun personalized(names: MutableList<String>, message: (String) -> String): MutableList<String> {
    val messages = mutableListOf<String>()
    for (name in names) messages.add(message(name))
    return messages
}

//  Exercise 4 Functions

fun applyToNumbers(numbers: List<Int>, operation: (Int) -> Int): List<Int> {
    val result = mutableListOf<Int>()
    for (number in numbers) {
        result.add(operation(number))
    }

    return result
}
