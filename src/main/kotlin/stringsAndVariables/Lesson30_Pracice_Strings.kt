package stringsAndVariables

fun main(args: Array<String>) {
    val dogName = "My dog's name is \"Reks\""
    println("The dogName variable length is ${dogName.length}")

    val car = "My car won't start"
    println(car.substring(3, 6))

    val clientName = "Alex"
    println("Hello, $clientName! Welcome!")

    val apples = 3
    val oranges = 4
    println("The amount of fruits is ${apples + oranges}")

    val client = "Mary"
    val products = 3
    val price = 30

    println("Mary needs to pay ${products * price}$ for products")
}
