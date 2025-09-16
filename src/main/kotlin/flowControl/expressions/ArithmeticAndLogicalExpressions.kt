package flowControl.expressions

fun main() {
    if (326 / 72 * 15 + 93 % 13 == 62) {
        println("Math is easy")
    } else {
        println("Math is hard")
    }

    val haveCat = true
    val haveCatFood = false

    if (haveCat && haveCatFood) {
        println("Cat is happy")
    } else {
        println("Oh no")
    }

    val age = 23

    if (age >= 18) println("Can drink an alcohol") else println("It's illegal!")
}
