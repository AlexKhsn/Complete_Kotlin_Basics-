package flowControl.forLoop

fun main() {
    for (i in 1..5) {
        for (j in 1..5) {
            print("$i,$j \t")
        }
        println()
    }

    println()

    for (i in 1..5) {
        for (j in 1..5) {
            if (i == j) print("diagonal\t") else print("$i,$j \t\t")
        }
        println()
    }

    val maxMatrixSize = 10

    for (i in 0..maxMatrixSize) {
        for (j in 0..maxMatrixSize) {
            if (i == j) print("diagonal\t") else print("$i, $j \t\t")
        }
        println()
    }
}
