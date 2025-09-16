package flowControl.whileLoop

fun main() {
    var num = 0
    while (num < 10) {
        println(num)
        num++
    }

    println()

    val puzzlePieces = 20
    var piecesPlaced = 0
    while (piecesPlaced < puzzlePieces) {
        piecesPlaced++
        println("Placed piece #$piecesPlaced")
    }
}
