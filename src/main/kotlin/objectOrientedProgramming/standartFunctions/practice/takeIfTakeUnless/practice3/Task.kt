package objectOrientedProgramming.standartFunctions.practice.takeIfTakeUnless.practice3

fun main() {
    val userInputs = mutableListOf<Int>()

    for (i in 1..10) {
        println("Введи число: ")
        val number = (readln() ?: "").toInt()
            .takeIf { it % 2 != 0 && it != 3 && it != 13 }

        if (number != null)
            userInputs.add(number)
    }

    println(userInputs)
}
