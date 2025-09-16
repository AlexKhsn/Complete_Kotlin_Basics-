package flowControl.forLoop

fun main() {
    for (i in 1..3) {
        println("Strike #$i")
    }
    println("You're out!")

    println()

    for (i in 10 downTo 0) {
        println(i)
        when (i) {
            9 -> println("Start your engines!")
            6 -> println("On your marks")
            3 -> println("Get set")
            0 -> println("Go")
        }
    }

    println()

    for (i in 10 downTo 0 step 3) {
        println(i)
    }

    println()

    for (i in 1..6 step 2) {
        println(i)
    }

    println()

    for (i in 6 downTo 1) {
        println(i)
    }
}

/**
 *  1) downTo - возвращает диапазон по уменьшению
 *  2) step n - возвращает диапазон пропуская n элементов =
 */
