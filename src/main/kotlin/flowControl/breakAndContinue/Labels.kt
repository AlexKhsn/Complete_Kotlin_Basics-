package flowControl.breakAndContinue

fun main() {
    loop@for (i in 1..10) {
        for (j in 1..10) {
            if (i % 3 == 0) break@loop
            println("$i, $j")
        }
    }

    println()

    loop@ for (i in 1..10) {
        for (j in 1..10) {
            if (i % 3 == 0) continue@loop
            println("$i, $j")
        }
    }
}
