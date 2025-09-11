package nullability

fun main(Args: Array<String>) {
    val price = 29.99

    println("How many items do you want to buy?")
    val inputNumber = readLine()?.toInt() ?: 1
    println("You bought $inputNumber item(s) for ${price * inputNumber}$")
}
