package flowControl.breakAndContinue

fun main() {
    val evenNumbers = listOf(2, 4, 6, 7, 8, 3)

    for (number in evenNumbers) {
        if (number % 2 != 0) {
            println("$number is not an even number!")
            break
        }
        println("$number / 2 = ${number / 2}")
    }

    println()

    for (number in evenNumbers) {
        if (number % 2 != 0) {
            println("$number is not an even number")
            continue
        }
        println("$number / 2 = ${number / 2}")
    }
}

/**
 *  break - прерывает работу цикла и выходит из него
 *  continue - пропускает текущую итерацию и продолжает следующую. Цикл не прерывается
 */
