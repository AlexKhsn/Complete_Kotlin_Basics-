package flowControl.ifConditional

fun main() {
    val number = 24
    var isEven: String? = null

    if (number % 2 == 0)
        isEven = "Number is Even"
    else
        isEven = "Number is Odd"

    if (number % 2 == 0) isEven = "Number is Even" else isEven = "Number is Odd"

    isEven = if (number % 2 == 0) "Number is Even" else "Number is Odd"

    println(isEven)
}
