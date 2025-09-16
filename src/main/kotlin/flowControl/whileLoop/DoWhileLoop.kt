package flowControl.whileLoop

fun main() {
    val puzzlePieces = 20
    var placedPieces = 0

    do {
        placedPieces++
        println("$placedPieces puzzle pieces are placed")
    } while (placedPieces < puzzlePieces)

    println()

    println("Enter an integer: ")
    val number = (readln() ?: "0").toInt()
    var counter = 1
    var factorial = 1

    do {
        counter++
        factorial *= counter
    } while (counter < number)

    println("Factorial $number is $factorial")
}
